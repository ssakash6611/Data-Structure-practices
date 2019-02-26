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
public class Task4 {
     public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("give me matrix size?");
        int n=j.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        int[]c=new int[n];
        System.out.println("give me ur numbers for A");
        for(int r=0;r<a.length;r++)
        {
            a[r]=j.nextInt();
        }
        System.out.println("give me ur numbers for B");
        for(int d=0;d<b.length;d++)
        {
            b[d]=j.nextInt();
        }
        System.out.print("C=[ ");
        for(int e=0;e<b.length;e++)
        {
            c[e]=5*a[e]-b[e];
            System.out.print(c[e]+" ");
        }
        System.out.println(" ]");
        
        
         
    }
    
    
}
