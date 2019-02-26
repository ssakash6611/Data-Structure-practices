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
public class AddRecords {
  Scanner x=new Scanner(System.in);
  Scanner forint=new Scanner(System.in);
  Book2[]a=new Book2[5];
  int size=0;
 
  public void setArray(String [] s){
       int t=0;
      String [] v = s;
    if(size<=a.length){
      
      
      a[size]=new Book2();
      a[size].Name=s[t];
      a[size].ID=s[++t];
      a[size].Author=s[++t];
      a[size].Publisher=s[++t];
      size++;
    }
    else{
      a=reSize();
      setArray(v);
      
    }
    
  }
  public Book2 [] reSize(){
    Book2[]b=new Book2[a.length*2];
    for(int f=0;f<a.length;f++){
      b[f]=a[f];
    }
    return b;
  }
  
  public void printing(){
    try{
      File f=new File("G://Book2.txt");
      PrintWriter p=new PrintWriter(f);
      for(int c=0;c<=size;c++){
          p.write(a[c].Name+" ");
          p.write(a[c].ID+" ");
          p.write(a[c].Author+" ");
          p.write(a[c].Publisher);
        }
          p.close();
        
      }
      
    catch(Exception e){
      System.out.println(e);
      
    }
    
    
  }

    
}
