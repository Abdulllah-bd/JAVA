/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task13_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class CheckingAccount extends Account{
  static int  numberOfAccount = 0;
  public CheckingAccount(){
   super(0.0);
    numberOfAccount++;
  }
  public CheckingAccount(double x){
    super(x);
    numberOfAccount++;
  }
  public double getBalance(){
    return super.getBalance();
  }
}