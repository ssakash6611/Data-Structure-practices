/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1.pkg220;
import java .util.Scanner;
/**
 *
 * @author Akash
 */
public class Task12 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("give me ur first month(1-12) and date(1-30)");
        int a=j.nextInt();
        int a1=j.nextInt();
        System.out.println("give me ur second month(1-12) and date(1-30)");
        int b=j.nextInt();
        int b1=j.nextInt();
        Firstcome c=new Firstcome(a,a1);
        c.setSecond(b,b1);
        c.toString();
        
    }
    
}
