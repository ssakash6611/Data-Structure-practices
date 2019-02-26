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
public class Task9 {
    public static void main(String[]args){
       Scanner j=new Scanner(System.in);
       int a[]={1,4,8,16,25,36,49,64,81,100};
       System.out.println("give me ur position");
       int s=j.nextInt();
       
       System.out.println("the right side rotation:");
       for(int c=s;c<a.length;c++){
           System.out.print(a[c]+", ");
       }
       for(int d=0;d<s;d++){
           System.out.print(a[d]+", ");
       }
       System.out.println();
       System.out.println("the left side rotation:");
       int f=a.length-s;
       for(int e=f;e<a.length;e++){
           System.out.print(a[e]+" ,");
       }
       for(int g=0;g<f;g++){
           System.out.print(a[g]+" ,");
       }
       
           
               
               
        
    }
    
}
