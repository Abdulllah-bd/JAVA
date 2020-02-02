/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author spark
 */
public class MinSubStringBackup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mw2 am = new Mw2();
        String ds = am.minWindow("ahffaksfajeeubsne", "jefaa");
        System.out.println(ds + "--->mw2");
    }

}

class Mw2 {

    public String minWindow(String search, String t) {

        Map<Character, Integer> required = buildMappingOfChar(t);

        Map<Character, Integer> charMapping = new HashMap<>();

        int left = 0;
        int right = 0;

        int totalCharFrequenciesToMatch = required.size();
        int charFrequenciesInWindowThatMatch = 0;

        int minWindowLengthSeenSoFar = Integer.MAX_VALUE;
        String minWindow = "";

        while (right < search.length()) {

            char characterAtRightPointer = search.charAt(right);
            addCharacterToHashtableMapping(charMapping, characterAtRightPointer);

            boolean rightCharIsARequirement = required.containsKey(characterAtRightPointer);
            if (rightCharIsARequirement) {

                boolean requirementForCharacterMet = required.get(characterAtRightPointer).intValue()
                        == charMapping.get(characterAtRightPointer).intValue();
                if (requirementForCharacterMet) {

                    charFrequenciesInWindowThatMatch++;
                }
            }

            while (charFrequenciesInWindowThatMatch == totalCharFrequenciesToMatch && left <= right) {

                char charAtLeftP = search.charAt(left);
                int windowSize = right - left + 1;

                if (windowSize < minWindowLengthSeenSoFar) {
                    minWindowLengthSeenSoFar = windowSize;
                    minWindow = search.substring(left, right + 1);
                }

                charMapping.put(charAtLeftP, charMapping.get(charAtLeftP) - 1);

                boolean leftCharIsARequirement = required.containsKey(charAtLeftP);
                if (leftCharIsARequirement) {

                    boolean characterFailsRequirement = charMapping.get(charAtLeftP)
                            < required.get(charAtLeftP);

                    if (characterFailsRequirement) {

                        charFrequenciesInWindowThatMatch--;
                    }
                }

                left++;
            }

            right++;
        }

        return minWindow;
    }

    private Map<Character, Integer> buildMappingOfChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int occurrencesOfCharacter = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), occurrencesOfCharacter + 1);
        }

        return map;
    }

    private void addCharacterToHashtableMapping(Map<Character, Integer> map, Character c) {
        int occurrences = map.getOrDefault(c, 0);
        map.put(c, occurrences + 1);
    }
}
