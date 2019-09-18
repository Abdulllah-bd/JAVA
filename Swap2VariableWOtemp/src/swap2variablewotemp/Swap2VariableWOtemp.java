/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap2variablewotemp;

/**
 *
 * @author spark
 */
public class Swap2VariableWOtemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(a+" "+b);
        a += b; //7
        b = a - b; // 5
        a = a - b; //
        System.out.println(a+" "+b);
     }
    
}
