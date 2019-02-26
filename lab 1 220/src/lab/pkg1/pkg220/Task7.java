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
public class Task7 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        int[]a=new int[10];
        System.out.println("give me ur numbers");
        for(int c=0;c<a.length;c++)
        {
            a[c]=j.nextInt();
        }
        System.out.println("give me ur printing numbers");
        int n=j.nextInt();
        for(int d=1;d<=a[n];d++)
        {
            System.out.println("*");
        }
        
        
    }
}
