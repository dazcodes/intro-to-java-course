//Session 7 Tuesday 11th June 2024
package com.cbfacademy.accounts;

//This is the parent class 
//If you keep it as private field then you can use the method for specific things 
public class Account {

  //it was protected because we want to reference these instances as child classes
 protected int accountNumber;
  protected double balance;

  public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double deposit(double amount) {
    this.balance += amount;
    return this.balance;
  }

  public double withdraw(double requested) {
    if (this.balance < requested || requested < 0) {
      return 0;
    } else {
      this.balance -= requested;
      return requested;
    }
  }

}