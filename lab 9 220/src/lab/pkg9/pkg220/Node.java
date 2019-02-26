/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.pkg220;

/**
 *
 * @author User
 */
public class Node{
   Patient pat;
    Node next;
    
    public Node(Patient v, Node n){
         pat = v;
        next = n;
    }
}

