/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1.pkg220;

/**
 *
 * @author Akash
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        int[]a=new int[10];
        System.out.println("give me ur numbers");
        a[0]=j.nextInt();
        int max=a[0];
        int min=a[0];
        int location1=0;
        int location2=0;
        for(int c=1;c<a.length;c++)
        {
            a[c]=j.nextInt();
            if(a[c]>max)
            {
                max=a[c];
                location1=c;
            }
        }
               
        for(int d=1;d<a.length;d++)
        {
            a[d]=j.nextInt();
            if(a[d]<min)
            {
                min=a[d];
                location2=d;
            }
        }
        int temp=a[location2];
        a[location2]=a[location1];
        a[location1]=temp;
        
        for(int f=0;f<a.length;f++)
        {
            System.out.println(a[f]);
        }
        
        
        
        
        
    
}
}
