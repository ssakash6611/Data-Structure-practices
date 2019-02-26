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
public class Task3 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        int[]a=new int[5];
        int temp;
        System.out.println("give me ur numbers");
        for(int c=0;c<a.length;c++)
        {
            a[c]=j.nextInt();
        }
        for(int b=0;b<a.length;b++)
        {
            for(int d=0;d<a.length-1;d++)
            {
                if(a[d]<a[d+1])
                {
                    temp=a[d];
                    a[d]=a[d+1];
                    a[d+1]=temp;
                }
            }
        }
        for(int t=0;t<a.length;t++)
        {
            System.out.print(a[t]+",");
            
        }
        for(int r=0;r<a.length;r++)
        {
            if(a[r]%2==0)
            {
                System.out.print(a[r]+",");
            }
        }
        
        
 
        
        
}
}
