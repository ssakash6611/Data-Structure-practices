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
public class Firstcome {
    int m1,m2,d1,d2;
      public  Firstcome(int a,int a1){
             m1=a;
             d1=a1;
    
}
      public void setSecond(int a,int a1){
          m2=a;
          d2=a1;
          
      }
      public toString(){
          if(m1>m2){
              System.out.println("true");
          }
          else if(m1==m2){
              if(d1>d2){
                  System.out.println("true");
              }
              else{
                  
                 System.out.println("false");
              }             
          }
         
      }
    
}
