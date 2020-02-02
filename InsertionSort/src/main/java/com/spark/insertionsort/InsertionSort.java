/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spark.insertionsort;

import java.util.Arrays;

/**
 *
 * @author spark
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 8, 1, 3};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }

}
