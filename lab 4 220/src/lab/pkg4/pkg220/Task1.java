/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4.pkg220;
import java.util.Scanner;
/**
 *
 * @author Akash
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner j=new Scanner(System.in);
                Scanner forint=new Scanner(System.in);
        BookRecords r=new BookRecords();
        String s;
        do{
            System.out.println("enter 1 to AddRecord");
            System.out.println("enter 2 to PrintRecord");
            System.out.println("enter 3 to DeleteRecord");
            System.out.println("enter 4 to Edit Record");
            int i=forint.nextInt();
            if(i==1){
                r.AddRecords();
            }
            else if(i==2){
                r.Printrecords();
            }
            else if(i==3){
                r.DeleteRecord();
            }
            else if(i==4){
                r.EditRecord();
            }
            System.out.println("do u want to continue");
             s=j.nextLine();
        }
        while(s.equals("yes"));
        
 

        
        
        
        
        
    }
    }
    

