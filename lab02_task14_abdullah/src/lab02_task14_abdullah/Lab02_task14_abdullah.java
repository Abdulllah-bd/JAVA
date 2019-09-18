/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task14_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Lab02_task14_abdullah {

    /**
     * @param s
     */
     public static void printShout(Student s){
    System.out.println("------------------");
    System.out.println(s.msg);
    System.out.println(s.shout());
  }
  public static void main(String [] args){
    Student s = new Student();
    CSEStudent cs = new CSEStudent();
    CSE111Student cs111 = new CSE111Student();
    System.out.println(s.msg);
    System.out.println(cs.msg);
   System.out.println(cs111.msg);
    printShout(s);
   printShout(cs);
    printShout(cs111);
}
}
