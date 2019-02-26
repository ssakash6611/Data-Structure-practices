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
public class Main {
     public static void main(String[]args)
     {
          BankAccount acc1=new BankAccount();
          acc1.setName("Akash");
          acc1.setAccountID("132");
          acc1.setAddress("138 e/2 nawmahal");
          acc1.setBalance(10000000000000000000000000000000000000000000000.0);
          
          BankAccount acc2=new BankAccount();
          acc2.setName("Shourav");
          acc2.setAccountID("134");
          acc2.setAddress("nawmahal");
          acc2.setBalance(10000000000000000.0);
          
          BankAccount acc3=new BankAccount();
          acc3.setName("oli");
          acc3.setAccountID("136");
          acc3.setAddress("138 e/2 nawmahal");
          acc3.setBalance(1000000.0);
          System.out.println(acc1.getName());
          System.out.println(acc1.getAccountID());
          System.out.println(acc1.getBalance());
          System.out.println(acc1.getAddress());
          System.out.println(acc1.addInterest());
          System.out.println();
          System.out.println(acc2.getName());
          System.out.println(acc2.getAccountID());
          System.out.println(acc2.getBalance());
          System.out.println(acc2.getAddress());
          System.out.println();
          System.out.println(acc3.getName());
          System.out.println(acc3.getAccountID());
          System.out.println(acc3.getBalance());
          System.out.println(acc3.getAddress());
          System.out.println(acc3.addInterest());
     }
    
}
