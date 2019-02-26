/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.pkg220;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tester {
       public static void main (String[] args) throws QueueOverflowException,QueueUnderflowException{
           Scanner j=new Scanner(System.in);
           Scanner js=new Scanner(System.in);
        ListQueue pq=new ListQueue();
        String s;
           
        try{
            do{
            System.out.println("Press ur desire digit");    
            System.out.println("1: Admit Patient");
            System.out.println("2: Served Patient");
            System.out.println("3: Can Doctor go Home? ");
            System.out.println("4: Show all Patient");
               int a=j.nextInt();
              if(a==1){
                  System.out.println("what is Patient's name?");
                  String k=js.nextLine();
                  pq.RegisterPatient(k);
              }
              else if(a==2){
                  pq.ServePatient();
              }
              else if(a==3){
                  if(pq.CanDoctorGoHome()==true){
                      System.out.println("Yes, Doctor can go home");
                  }
                  else{
                      System.out.println("No, more Patients are waiting");
                  }
                  
              }
              else if(a==4){
                  pq.ShowAllPatient();
              }
                  System.out.println("do u want to continue?");
                  s=js.nextLine();
            }
            while(s.equals("yes"));

        
        }
        
        catch(QueueUnderflowException e){
            System.out.println(e);
        }
        }


        


    }
    


