/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1.pkg220;
import java.util.Scanner;
/**
 *
 * @author Akash
 */
public class Task11 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("give me ur numbers");
        int a=j.nextInt();
        
        AllDigitsOdd b=new AllDigitsOdd(a);
        System.out.println(b);
        
    }
    
}
