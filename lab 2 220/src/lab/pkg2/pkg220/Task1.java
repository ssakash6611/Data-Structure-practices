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
public class Task1 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        double h, w, a;
        Square s1 = new Square();
        s1.setHeight(3.0);
        s1.setWidth(4.0);
        h = s1.getHeight();
        w = s1.getWidth();
        a = s1.getArea();
        System.out.println("Height = "+h);
        System.out.println("Width = "+w);
        System.out.println("Area = "+a);


 
        
        
    }
    
}
