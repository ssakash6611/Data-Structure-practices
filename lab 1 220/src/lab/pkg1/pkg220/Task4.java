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
public class Task4 {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        int[]a=new int[10];
            System.out.println("give me ur number");
            a[0]=j.nextInt();
        for(int c=1;c<a.length;c++)
        {
            System.out.println("give me ur number");
            a[c]=j.nextInt();
            for(int b=0;b<c;b++)
            {
                if(a[c]==a[b])
                {
                    System.out.println("duplicate;give me unique number");
                }
            }
            
            
        }
    }
    
}
