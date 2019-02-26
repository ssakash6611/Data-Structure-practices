/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ArrayStack implements Stack{
    
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
        data = new Object[5];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
     public void push(Object e) throws StackOverflowException{
         if(size==data.length){
         throw new StackOverflowException(); 
     }
         else{
         top++;
         data[top]=e;
         size++;
         }
         
     }
      public Object pop() throws StackUnderflowException{
          if(top==-1){
              throw new StackUnderflowException();
          }
          else{
              Object t=data[top];
              data[top]=null;
              top--;
              size--;
              return t;
          }
          
      }
      public Object peek() throws StackUnderflowException{
          if(top==-1){
              throw new StackUnderflowException();
          }
          else{
              return data[top];
          }
      }
      public String toString(){
          String a="[";
          for(int c=top;c>=0;c--){
              a=a+" "+data[c];
          }
          a=a+" ]";
      return a;
      }
      public Object[] toArray(){
          Object a[]=new Object[size];
          int v=0;
          for(int c=top;c>=0;c--){
              a[v]=data[c];
              v++;
          }
          return a;
      }
      public int search(Object e){
          int offset=0;
          for(int c=top;c>=0;c--){
              if(data[c].equals(e)){
               return offset;
          }
              offset++;
          
      }
          return -1;
      }
}
