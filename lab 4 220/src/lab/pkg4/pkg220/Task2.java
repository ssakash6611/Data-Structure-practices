/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4.pkg220;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Akash
 */
public class Task2 {
      public static void main(String[]args){
    AddRecords r=new AddRecords();
    try{
      File f=new File("G://Book.txt");
      Scanner j=new Scanner(f);
      
      while(j.hasNextLine()){
        String s=j.nextLine();
        
        String a []=s.split(",| ");;
        r.setArray(a);
      }
    }
    catch(FileNotFoundException ex){
      
      System.out.println(ex);
    }
    r.printing();    
  }
    
}
