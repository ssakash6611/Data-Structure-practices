/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.pkg220;

/**
 *
 * @author Akash
 */
public class Test {
    
      public static int [] removeOdd (int [] input){
          int n=0;
	 for(int c=0;c<input.length;c++){
             if(input[c]%2==0){
                 n=n+1;
             }
             else{
                 input[c]=0;
             }
         }
         int a[]=new int[n];
         int m=0;
         for(int b=0;b<input.length;b++){
             if(input[b]==0){
                 
             }
             else{
                 a[m]=input[b];
                  m=m+1;       
             }
         }
         return a;
         
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}

    

