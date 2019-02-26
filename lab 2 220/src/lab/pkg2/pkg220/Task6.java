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
public class Task6 {
    public static void main(String[]args){
    Scanner j=new Scanner(System.in);
    System.out.println("Give ur complex number's real part");
    int x=j.nextInt();
    System.out.println("Give ur complex number's imajinary part");
    int y=j.nextInt();
    ComplexNumber a=new ComplexNumber(x,y);
    a.increaseValue();
    System.out.println(a.toString());
    System.out.println(a.polarRadius());
    
    
    
}
    
}
