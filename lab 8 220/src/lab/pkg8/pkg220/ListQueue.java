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
public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
//TO DO
     public int size(){
        return size;
    }
     public boolean isEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
     public void enqueue(Object o) throws QueueOverflowException{
         Node mn=new Node(o,null);
         if(front==null){
             front=mn;
             rear=mn;
             size++;
         }
         else{
             rear.next=mn;
             rear=mn;
             size++;
         }
     }
     public Object dequeue() throws QueueUnderflowException{
         Object v=null;
         Node o=null;
         if(size==0){
            throw new QueueUnderflowException();
                
            }
         else if(front==rear){
             v=front.val;
             o=front;
             front=null;
             rear=null;
             size--;
     }
         else{
             v=front.val;
             o=front;
             front=front.next;
             size--;
         }
          o.next=null;
          o.val=null;
         return v;
     
}
     
     public Object peek() throws QueueUnderflowException{
         if(front==null){
             throw new QueueUnderflowException();
         }
         else{
             return front.val;
         }
     }
     public String toString(){
         String a="[ ";
         for(Node t=front;t!=null;t=t.next){
             a=a+" "+t.val;
         }
         a=a+" ]";
         return a;
     }
     public Object[] toArray(){
         Object []a=new Object[size];
         int v=0;
         for(Node t=front;t.next!=null;t=t.next){
             a[v]=t.val;
             v++;
         }
         return a;
     }
     public int search(Object e){
         int offset=0;
         for(Node t=front;t.next!=null;t=t.next){
             if(t.val.equals(e)){
                 return offset;
             }
             offset++;
         }
         return -1;
     }
 
     
}     
