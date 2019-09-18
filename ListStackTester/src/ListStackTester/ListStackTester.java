/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListStackTester;

/**
 *
 * @author 14321005
 */
public class ListStackTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ListStack l= new ListStack();
    try{
   
   l.push(41);
    
   l.push(40); 
   l.push(30);
   l.push(45);
   l.push(47);
   l.pop();
   System.out.println(l.peek());
   System.out.println(l.toString());
   System.out.println(l.search(30)); 
    }
    catch(StackOverflowException n){
      System.out.println("StackOverflowException");
     }
    catch(StackUnderflowException n){
      System.out.println("StackUnderflowException");
     }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
