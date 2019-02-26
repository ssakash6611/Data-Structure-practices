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
public class AllDigitsOdd {
            boolean f=true;
    public AllDigitsOdd(int a){
        int v=a;
        int n=0;
           for(int c=0;a>0;c++)
           {
              a=a/10; 
              n=n+1;
           }
           int q[]=new int[n];
           for(int d=0;d<n;d++)
           {
               q[d]=v%10;
               v=v/10;
           }
           for(int e=0;e<n;e++)
           {
               if(q[e]%2==0)
               {
                   f=false;
                   break;
               }
           }
           
        
    }
            public boolean toSting(){
               return f;
        }
    
}
