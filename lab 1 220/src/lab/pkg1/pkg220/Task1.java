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

public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner j=new Scanner(System.in);
        System.out.println("give me how many numbers?");
        int n=j.nextInt();
        int[]a=new int[n];
        System.out.println("give me ur numbers");
        for(int c=0;c<a.length;c++)
        {
            a[c]=j.nextInt();
        }
        if(a[0]==6||a[n-1]==6)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        
        
                }
    
}
