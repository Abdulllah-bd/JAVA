/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task15_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Lab02_task15_Abdullah {

    public static int[] removeOdd (int[] input){
        int k=0,counter=0;
        for(int c=0; c<input.length-1; c++){
          if(input[c]%2==0){
            counter++;
          } 
        }
        int[]noOdd=new int[counter];
        for(int i=0; i<input.length-1; i++){
          if(input[i]%2==0){
            noOdd[k]=input[i];
            k++;
          }
        }
        return noOdd;
      }
      public static void main(String[] args){
        int[] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for(int i=0; i<mixedArray.length; i++){
          System.out.print(mixedArray[i]+" ");
        }
        System.out.println();
        int[] noOdd = removeOdd(mixedArray);
        for(int i=0; i<noOdd.length; i++){
          System.out.print(noOdd[i]+" ");
        }
        System.out.println();
      }
    }
