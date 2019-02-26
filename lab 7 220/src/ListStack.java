/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ListStack implements Stack{
    
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size(){
        return size;
    }
        public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    public void push(Object e){
        Node n=new Node(e,null);
        n.next=top;
        top=n;
        size++;
        
    }
    public Object pop() throws StackUnderflowException{
        if(top==null){
            throw new StackUnderflowException();
        }
        else{
        Node n=top;
        top=top.next;
        Object t=n.val;
        n.val=null;
        n.next=null;
        size--;
        return t;
         
        }
    }
    public Object peek() throws StackUnderflowException{
        if(top==null){
              throw new StackUnderflowException();
          }
          else{
              return top.val;
          }
    }
    public String toString(){
        String a="[";
        for(Node tail=top;tail!=null;tail=tail.next){
            a=a+" "+tail.val;
        }
        a=a+" ]";
        return a;
                
    }
    public Object[] toArray(){
          Object a[]=new Object[size];
          int v=0;
          for(Node tail=top;tail!=null;tail=tail.next){
              a[v]=tail.val;
              v++;
          }
          return a;
      }
          public int search(Object e){
          int offset=0;
          for(Node tail=top;tail!=null;tail=tail.next){
              if(tail.val.equals(e)){
               return offset;
                         }
              offset++;
          
      }
          return -1;
      }
    
    }
   

    


