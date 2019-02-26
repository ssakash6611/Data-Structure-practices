/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.pkg220;

/**
 *
 * @author Akash
 */
public class TestAccount {
  public static void printBalance(Task13 a){
    System.out.println("Account Balance: " + a.getBalance());
  }
  public static void main(String [] args)
  {
    System.out.println("Number of Checking Accounts: " + CheckingAccount.numberofAccount);
    printBalance(new CheckingAccount());
    printBalance(new CheckingAccount(100.00));
    printBalance(new CheckingAccount(200.00));
    System.out.println("Number of Checking Accounts: " + CheckingAccount.numberofAccount);
  }
    
}

