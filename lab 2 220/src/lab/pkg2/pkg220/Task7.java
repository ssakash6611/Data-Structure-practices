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
public class Task7 {
        public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("Give me the value of x dimension");
        int x=j.nextInt();
         System.out.println("Give me the value of y dimension");
         int y=j.nextInt();
         Point a=new Point(x,y);
         System.out.println(a.distanceFromOrigin());
         
    
}
}
