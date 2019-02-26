/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4.pkg220;

/**
 *
 * @author Akash
 */
public class CircularArray {
      
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
      start=st;
      cir=lin;
      size=sz;
     Object[]a=new Object[cir.length];
      int k=start;
      for(int c=0;c<a.length;c++){
          a[k]=cir[c];
          k=(k+1)%a.length;
      }
      cir=a;
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
        //TO DO

       for(int i=0;i<cir.length;i++){
          System.out.println(cir[i]);
  }
      System.out.println();
  }
    
    
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    //To DO
      int k=start;
       for(int s=0;s<size;s++){
           System.out.println(cir[k]);
           k=(k+1)%cir.length;
       }
       System.out.println();
  }
  
  
  public void printBackward(){
   //TO DO
      int k=(start+size-1)%cir.length;
      for(int i=0;i<size;i++){
          System.out.println(cir[k]);
          k--;
          if(k<0){
              k=cir.length-1;
          }
      }
      System.out.println();
      
  }
  
  // With no null cells
  public void linearize(){
    //TO DO
      int k=start;
      Object[]a=new Object[size];
      for(int i=0;i<size;i++){
          a[i]=cir[k];
          k=(k+1)%cir.length;
          
      }
      cir=a;
      System.out.println();
  }
  
  // Do not change the Start index
  public Object[] resizeStartUnchanged(int newcapacity){
    //TO DO
      Object []a= new Object[newcapacity];
      int p=start;
      int k=start;
      for(int i=0;i<size;i++){
          a[p]=cir[k];
          k=(k+1)%cir.length;
          p=(p+1)%a.length;
      }
      cir=a;
      return cir;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
      Object []a= new Object[newcapacity];
      
      int k=start;
      for(int i=0;i<size;i++){
          a[i]=cir[k];
          k=(k+1)%cir.length;
      }
      cir=a;
  }
      
  
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    //TO DO
      cir=resizeStartUnchanged(size+3);
      int nsh=size-pos;
      int from=(start+size-1)%cir.length;
      int to=(from+1)%cir.length;
     for(int i=0;i<nsh;i++){
         cir[to] =cir[from];
         to=from;
         from--;
        if(from<0){
            from=cir.length-1;
        }
      
   }
     int index=start+pos;
     cir[index]=elem;
     size++;
  }
  
  public void insertByLeftShift(Object elem, int pos){
    //TO DO
      if(size==cir.length){
          cir=resizeStartUnchanged(size+3);
      }
      else{
          int nsh=pos+1;
          int from=start;
          int to=from-1;
          if(to<0){
              to=cir.length-1;
          }
          for(int i=0;i<nsh;i++){
              cir[to]=cir[from];
              to=from;
              from=(from+1)%cir.length;
          }
          int index=(start+pos)%cir.length;
          cir[index]=elem;
          size++;
          start--;
          
      }
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    //TO DO
      int nsh=size-(pos+1);
      int to=(start+pos)%cir.length;
      int from=(to+1)%cir.length;
      for(int i=0;i<nsh;i++){
          cir[to]=cir[from];
          to=from;
          from=(from+1)%cir.length;
      }
     int index=(start+size-1)%cir.length;
     cir[index]=null;
     size--;
     
      
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    //TO DO
      int nsh=pos+1;
      int to=(start+pos)%cir.length;
      int from=(to-1);
      if(to<0){
          to=cir.length-1;
      }
      for(int i=0;i<nsh;i++){
          cir[to]=cir[from];
          to=from;
          from=(from-1);
          if(from<0){
          from=cir.length-1;
      }
      }
     cir[start]=null;
     size--;
     start++;
  }
    
}
