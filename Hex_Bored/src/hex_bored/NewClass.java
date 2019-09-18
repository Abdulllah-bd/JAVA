/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex_bored;

/**
 *
 * @author spark
 */
public class NewClass {
    public static void main(String[] args) {
        for(int a =0;a<=100;a++){
            if(!(a%3==0 || a%5==0 || a%7==0))
                System.out.print(a+" ");
        }
    }
    
}
