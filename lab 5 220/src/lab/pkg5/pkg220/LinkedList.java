/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5.pkg220;

/**
 *
 * @author Akash
 */
public class LinkedList {
      public Node head;
      public Node tail;
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
     Node n=new Node(a[0],null);
     head=n;
     tail=n;
     for(int i=1;i<a.length;i++){
         Node n1=new Node(a[i],null);
         tail.next=n1;
         tail=tail.next;
     }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
      head=h;
      tail=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
      int c=0;
      for(tail=head;tail!=null;tail=tail.next){
          c++;
      }
    return c; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO  
      for(tail=head;tail!=null;tail=tail.next){
          System.out.print(tail.element+", ");
      }
      System.out.println();
     
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
      tail=head;
      if(idx<0){
          System.out.println("nullPointerException");
          return null;
      }
      else{
          
          for(int i=0;i<idx;i++){
              if(tail!=null){
                  tail=tail.next;
              }
              else{
                  break;
              }
          }
      }
    return tail; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
      Node t=nodeAt(idx);
      
    return t.element; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
      Node t=nodeAt(idx);
      if(t==null){
          return null;
      }
      else{
      Object r=t.element;
      t.element=elem;
      
    return r; // please remove this line!
  }
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
      int c=0;
      for(tail=head;tail.element!=elem;tail=tail.next){
          c++;
      }
          if(tail==null){
              return -1;
      }
          else{
    return c; // please remove this line!
  }
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
      int c=0;
      for(tail=head;tail!=null;tail=tail.next){
          if(tail.element.equals(elem)){
           return true;  
          }
      }
      return false;
            

      
    
}
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
      Node chead=null;
      Node ctail=null;
      for(tail=head;tail!=null;tail=tail.next){
          Node n2=new Node(tail.element,null);
          if(chead==null){
              chead=n2;
              ctail=n2;
          }
          else{
              ctail.next=n2;
              ctail=ctail.next;
          }
      }
    return chead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
      Node rhead=null;
      for(tail=head;tail!=null;tail=tail.next){
          Node r=new Node(tail.element,null);
          r.next=rhead;
          rhead=r;
          
      }
    return rhead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
      Node mn=new Node (elem,null);
      
      if(idx==0){
          mn.next=head;
          head=mn;
      }
      else{
          Node pred=nodeAt(idx-1);
          mn.next=pred.next;
          pred.next=mn;
      }
      
      
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
      Node remove=null;
      if(index==0){
          remove=head;
          head=head.next;
      }
      else{
          Node pred=nodeAt(index-1);
          remove=pred.next;
          pred.next=remove.next;
          remove.next=null;
      }
    return remove.element; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
      for(tail=head;tail.next!=null;tail=tail.next){
      }
      
      Node r=head;
      head=head.next;
      tail.next=r;
      r.next=null;
      
      
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
      Node ptail=null;
      for(ptail=head;ptail.next.next!=null;ptail=ptail.next){
         
      }
      ptail.next.next=head;
      head=ptail.next;
      ptail.next=null;
  }
    
}
