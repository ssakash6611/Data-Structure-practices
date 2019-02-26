/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.pkg220;

/**
 *
 * @author jscomputer
 */
public class DoublyList {
     public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }

    /**
     *
     * @param a1
     */
    
    /**
     *
     * @param 
     */

    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
        int i=0;
        Node tail=null;
        for(tail=head.next;tail!=head;tail=tail.next){
            i++;
        }
        
        return i; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO 
        Node tail=null;
        for(tail=head.next;tail!=head;tail=tail.next){
            System.out.print(tail.element+"  ");
        }
        System.out.println();
    }
    
    public void backwardprint(){
        // TO DO     
        Node tail=null;
        for(tail=head.prev;tail!=head;tail=tail.prev){
            System.out.print(tail.element+"  ");
        }
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        Node tail=head.next;
        if(idx<0){
            System.out.println("index out of bouund");
        }
        else{
        for(int i=0;i<idx;i++){
            
            if(tail.next==head){
                break;
            }
            else{
            tail=tail.next;
            }
            
        }
    }
      if(tail.next==head){
            return null;
           }
        else{
        return tail;
    }
    }
    
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
        Node tail=null;
        int i=0;
        for(tail=head.next;tail!=head;tail=tail.next){
            if(tail.element.equals(elem)){
                
                
                break;
            }
            i++;
        }
        if(i==0){
            return -1;
        }
        else{
        
        return i; // please remove this line!
    }
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        Node mn=new Node(elem,null,null);
        if(idx==0){
            Node r=head.next;
            mn.next=head.next;
            head.next=mn;
            mn.prev=head;
            r.prev=mn;
            
        }
        else{
            int q=countNode();
            if(idx==q){               
               Node pred=head.prev;
               mn.next=head;
               mn.prev=head.prev;
               head.prev=mn;
               pred.next=mn;
               
            }
            else{
            Node pred=nodeAt(idx-1);
            Node sucs=pred.next;
            mn.next=sucs;
            mn.prev=pred;
            pred.next=mn;           
            sucs.prev=mn;
        }
        
    }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Node r=nodeAt(index);
        Object a=r.element;
        
        if(index==0){

            Node sucs=nodeAt(index+1);
            head.next=sucs;
            sucs.prev=head;
        }
        else{
           
            int q=countNode();
            if(q==index){
            Node pred=nodeAt(index-1);
            pred.next=head;
            head.prev=pred;
            
        }
            else{
                
                
                Node pred=nodeAt(index-1);
                Node sucs=nodeAt(index+1);
                pred.next=sucs;
                sucs.prev=pred;
            }
        }
        r.element=null;
        r.next=null;
        r.prev=null;
        return a;
    }
        
        
    
}
