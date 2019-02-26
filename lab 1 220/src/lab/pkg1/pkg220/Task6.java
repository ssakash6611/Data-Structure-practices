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
public class Task6 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("give me how many numbers?");
        int n=j.nextInt();
        int[]a=new int[n];
        boolean f=true;
        System.out.println("give me ur numbers");
        for(int c=0;c<a.length;c++)
        {
            a[c]=j.nextInt();
        }
        int q=a.length/2;
        int w=a.length-1;
        for(int b=0;b<q;b++)
        {
            if(a[b]==a[w])
            {
              w=w-1;  
            }
            else{
                  f=false;
                 }
        }
        if(f==true)
        {
            System.out.println("palindrome");
        }
        else{
             System.out.println("not palindrome");
            }
        
    }
    
}
