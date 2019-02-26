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
public class BankAccount {
    private String name;
    private String address;
    private String accountID;
    private double balance;
    private double interest;
    
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
      return name;
    }
    public void setAccountID(String i)
    {
        accountID=i;
    }
    public String getAccountID()
    {
      return accountID;
    }
    public void setAddress(String a)
    {
        address=a;
    }
    public String getAddress()
    {
      return address;
    }
    
    public void setBalance(double c)
    {
      balance=c;
    }
    public double getBalance()
    {
      return balance;
    }
    public double addInterest()
    {
      return balance+.07*balance;

    }
}
