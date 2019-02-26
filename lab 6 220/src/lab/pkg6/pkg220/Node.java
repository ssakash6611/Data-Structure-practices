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
public class Node {
  public Object element;
  public Node next;
  public Node prev;
  
  public Node(Object e, Node n, Node p){
    element =e ;
    next = n;
    prev =p;
    
  }
  
}
