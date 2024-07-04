
package com.cbfacademy.accounts;
import java.util.ArrayList;

public class Bank {
protected String accountType;
protected Double balance;
protected Integer accountNumber;



public Bank( String accountType, Double balance, Integer accountNumber){
  this.accountType = accountType;
  this.balance = balance;
  this.accountNumber= accountNumber;

}

}

public class BankLists{
  public static void main(String[] args){
    ArrayList<Bank> banks = new ArrayList();
    Bank ba1 = new Bank("SavingsAccount", 525.60, 156739);
    Bank ba2 = new Bank("SavingsAccount", 1000.75, 156738);
    Bank ba3 = new Bank("SavingsAccount", 1500.60, 156742);
    Bank ba4 = new Bank("CurrentAccount", -525.60, 156777);
    Bank ba5 = new Bank("CurrentAccount", 600.70, 156796);
    Bank ba6 = new Bank("CurrentAccount", -25.20, 156755);
    Bank ba7 = new Bank("CurrentAccount", 4000.96, 156700);
    Bank ba8 = new Bank("SavingsAccount", 5780.96, 156766);

    banks.add(ba1);
    banks.add(ba2);
    banks.add(ba3);
    banks.add(ba4);
    banks.add(ba5);
    banks.add(ba6);
    banks.add(ba7);
    banks.add(ba8);

    

  }
  
  
}
  

