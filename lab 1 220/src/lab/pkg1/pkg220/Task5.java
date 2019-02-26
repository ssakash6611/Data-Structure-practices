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
public class Task5 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Give me numbers from 0-9");
        for(int c=0;c<a.length;c++)
        {
            int b=j.nextInt();
            a[b]++;
        }
        for(int d=0;d<a.length;d++)
        {
            System.out.println(a[d]);
        }
        
    }
    
}
