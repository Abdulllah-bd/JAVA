/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lru;

import java.util.Arrays;

/**
 *
 * @author spark
 */
public class LRU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "D", "Q", "Z", "C"}; //{"A", "B", "A", "C", "A", "A"};  //"A", "B", "F", "D", "E", "F","F","A"
        String[] result;
        result = lruCache(arr);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null && i == 0) {
                System.out.print(result[i]);
            } else if (result[i] != null) {
                System.out.print("-" + result[i]);
            }

        }

        System.out.println();//Arrays.toString(result=lruCache(arr)));

    }

    public static String[] lruCache(String[] arr) {
        String[] lru = new String[5];
        int in = -1;
        for (int i = 0; i < arr.length; i++) {
            if (in < lru.length - 1 && !Arrays.asList(lru).contains(arr[i])) {
                in++;
                lru[in] = arr[i];

                //System.out.println(in+"-->"+lru.length);
            } else if (in == lru.length - 1 && !Arrays.asList(lru).contains(arr[i])) {
                //System.err.println("here");
                lru = shiftLeft(lru);
                lru[in] = arr[i];
            } else if (in == lru.length - 1 && Arrays.asList(lru).contains(arr[i])) {
                boolean b = false;
                for (int j = 0; j < lru.length - 1; j++) {
                    if (arr[i].equals(lru[j])) {
                        b = true;
                    }
                    if (b) {
                        lru[j] = lru[j + 1];
                    }
                    if (j == 3) {
                        lru[4] = arr[i];
                    }
                }
            } else if (in < lru.length && Arrays.asList(lru).contains(arr[i])) {
                boolean b = false;
                for (int j = 0; j < in; j++) {
                    //System.out.println(Arrays.toString(lru));
                    if (arr[i].equals(lru[j])) {
                        b = true;
                    }
                    if (b) {
                        lru[j] = lru[j + 1];
                    }
                    if (j == in - 1) {
                        lru[j + 1] = arr[i];
                    }
                }

            }

        }
        return lru;

    }

    private static String[] shiftLeft(String[] lru) {
        for (int i = 0; i < lru.length - 1; i++) {
            lru[i] = lru[i + 1];
        }
        return lru;
    }

}
