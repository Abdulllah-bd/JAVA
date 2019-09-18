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

   public class Account{
  protected double balance = 0.0;
  public Account(double balance){
    this.balance = balance;
  }
  public double getBalance(){
    return balance;
  }
}
