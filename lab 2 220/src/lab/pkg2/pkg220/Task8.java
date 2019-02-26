/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.pkg220;
import java.util.Scanner;
/**
 *
 * @author Akash
 */
public class Task8 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("Give me ur equation with sign");
        int a1=j.nextInt();
        int a2=j.nextInt();
        int a3=j.nextInt();
        QuadEqn a=new QuadEqn(a1,a2,a3);
        System.out.println("one of the root is "+a.root());
        
        
       
  
        
    }  
    
}
