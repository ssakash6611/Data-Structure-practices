/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3.pkg220;

/**
 *
 * @author Akash
 */
public class LinearArray {
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    
    
    
  }
  
  // Prints the contents of the source array
  public static void printArray(int [] source){
    // TO DO
      for(int a=0;a<source.length;a++){
          System.out.println(source[a]);
      }
      
  }
  
  // Prints the contents of the source array in reverse order
  public static void printReverse(int [] source){
    // TO DO
      for(int c=source.length-1;c>=0;c--){
          System.out.println(source[c]);
      }
  }
  
  // creates a copy of the source array and returns the reference of the newly created copy array
  public static int [] copyArray(int [] source, int len){
    // TO DO
      int [] a=new int[len];
       for(int c=0;c<len;c++){
          a[c]=source[c];
      }
      
    return a; // remove this line    
  }
  
  // creates a reversed copy of the source array and returns the reference of the newly created reversed array
  public static void reverseArray(int [] source){
    // TO DO
    int a=source.length/2;
    int temp=0;
    int d=source.length-1;
    for(int c=0;c<a;c++){
        temp=source[c];
        source[c]=source[d];
        source[d]=temp;
        d--;
        
    }
          
      
  }
  
  // Shifts all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] shiftLeft(int [] source, int k){
    // TO DO
      for(int c=k;c<source.length;c++){
          source[c-k]=source[c];
      }
      for(int d=source.length-k;d<source.length;d++){
          source[d]=0;
      }
      
    return source; // remove this line    
  }
  
  // Rotates all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] rotateLeft(int [] source, int k){
    // TO DO
      int a[]=new int[k];
      for(int c=0;c<k;c++){
          a[c]=source[c];
      }
     source=shiftLeft(source,k);
     for(int i=0;i<k;i++){
         source[i+k]=a[i];
     }
     

      
    return source; // remove this line    
  }
  
  // Shifts all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] shiftRight(int [] source, int k){
    // TO DO
      for(int c=source.length-1-k;c>=0;c--){
          source[c+k]=source[c];
          
      }
      for(int d=0;d<k;d++){
          source[d]=0;
      }
      


    return source; // remove this line    
  }
  
  // Rotates all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] rotateRight(int [] source, int k){
      int[]b=new int[k];
      int d=0;
      for(int c=source.length-k;c<source.length;c++){
          b[d]=source[c];
          d++;
      }
       for(int e=source.length-1-k;e>=0;e--){
           source[e+k]=source[e];
       }
       for(int f=0;f<k;f++){
           source[f]=b[f];
       }
      
      
      
    return source; // remove this line    
  }
  
  /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed
    */
  public static boolean insert(int [] arr, int size, int elem, int index){
    // TO DO
      if(size ==arr.length){
          System.out.println("no space left");
          return false;
      }
      else if(index<0||index>(arr.length)){
          System.out.println("Invalid index");
          return false;
      }
      else{
          for(int i=size;i>index;i--){
              arr[i]=arr[i-1];
          }
          arr[index]=elem;
          System.out.println("number of element after incertation  "+(size+1));
          return true;
          
      }
    
  }
  
  /** 
   * removes all the occurences of the given element
   * @param arr the reference to the linear array
   * @param size the number of elements that exists in the array. size<=arr.length
   * @param elem the element to be removed
   * @return true if removal is successful; return false otherwise
   * if removal is successful, print the 'Number of elements after removal' is completed
   */  
  public static boolean removeAll(int [] arr, int size, int elem){
    // TO DO
    boolean n=false;
    for(int c=0;c<size;c++){
        if(arr[c]==elem){
            n=true;
            break;
        }
    }
    if(n==false){
        return false;
    }
    else{
        for(int i=0;i<size;i++){
            if(arr[i]==elem){
                for(int d=i;d<=size-2;d++){
                    arr[d]=arr[d+1];
                }
                arr[size-1]=0;
                size--;
            }
        }
    }
    return true;
  }
  
  
  
  
  
  
  
  
  
  
}
