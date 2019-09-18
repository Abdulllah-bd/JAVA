/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentheses;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author spark
 */
public class Parentheses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        Stack stk = new Stack();
        boolean B=true;
        
        for (int c = 0; c < st.length(); c++) {
            char a = st.charAt(c);
            if (a == '(' || a == '[' || a == '{') {
                stk.push(a);
            }
        }
        for (int c = st.length()-1; c >=0 ; c--) {
            char a = st.charAt(c);
            if (a == '}') {
                char b = (char) stk.pop();
                if ('{' != b) {
                    B=false;
                    break;
                }
            }
            if (a == ')') {
                char b = (char) stk.pop();
                if ('(' != b) {
                    B=false;
                    break;
                }
            }
            if (a == ']') {
                char b = (char) stk.pop();
                if ('[' != b) {
                    B=false;
                    break;
                }
            }
            
            
            
        }
        if(B==true && stk.empty())
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }

}
