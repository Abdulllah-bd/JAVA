/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstrecurringcharacter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author spark
 */
public class FirstRecurringCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(recurringChar("ABCDEE"));
        System.out.println(recurringCharHash("ABCDEE"));
    }

    public static char recurringChar(String str) {
        char[] strArr = str.toCharArray();
        int c = 0;
        while (c < strArr.length) {
            char find = strArr[c];
            for (int i = c + 1; i < strArr.length; i++) {
                if (find == strArr[i]) {
                    return find;
                }
            }
            c++;
        }
        return ' ';
    }

    public static char recurringCharHash(String str) {
        char[] char_array = str.toCharArray();
        HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
        int i = 0;
        while (i < char_array.length) {
            Character ch = char_array[i];
            if (charCounter.containsKey(ch)) {
                charCounter.put(ch, charCounter.get(ch) + 1);
            } else {
                charCounter.put(ch, 1);
            }
            i++;
        }

        Set s1 = charCounter.entrySet();
        Iterator itr = s1.iterator();

        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            if (m1.toString().charAt(2) > '1') {
                return m1.toString().charAt(0);
            }
            //System.out.println(m1.toString());
        }
        return ' ';
    }

}
