/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.pkg220;

/**
 *
 * @author User
 */
public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    
//TO DO
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(Object o) throws QueueOverflowException{
        if(size==data.length){
            throw new QueueOverflowException();
        }
        else if(size==0){
            front++;            
            rear++;
            data[rear]=o;
            size++;
        }
        else{
            rear=(rear+1)%data.length;
            data[rear]=o;
            size++;
        }
    }
     public Object dequeue() throws QueueUnderflowException{
        Object a=null;
         if(front==-1){
             throw new QueueUnderflowException();
         }
         
         else if(front==rear){
             a=data[front];
             data[front]=null;
             front=-1;
             rear=-1;
             size--;
         }
         else{
             a=data[front];
             data[front]=null;
             front=(front+1)%data.length;
             size--;
         }
         return a;
     }
     public Object peek() throws QueueUnderflowException{
         if(front==-1){
             throw new QueueUnderflowException();
         }
         else{
             return data[front];
         }
     }
     public String toString(){
                 String a="[";
                 int v=front;
          for(int c=0;c<size;c++){
              a=a+" "+data[v];
              v=(v+1)%data.length;
          }
          a=a+" ]";
      return a;
      }

      public Object[] toArray(){
          Object a[]=new Object[size];
          int v=0;
          int k=front;
          for(int c=0;c<size;c++){
              a[v]=data[k];
              v++;
              k=(k+1)%data.length;
          }
          return a;
      }
            public int search(Object e){
          int offset=0;
          int k=front;
          for(int c=0;c<size;c++){
              if(data[k].equals(e)){
                  k=(k+1)%data.length;
               return offset;
          }
              offset++;
          
      }
          return -1;
      }
    
    
}
