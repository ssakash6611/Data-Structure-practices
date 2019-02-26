/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Stacktester {
    public static void main(String[]args)throws StackOverflowException, StackUnderflowException{
         ArrayStack a=new ArrayStack();
        a.push(10);
        a.push(20);
        a.push(30);
        
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.pop());
        System.out.println(a.peek());
        System.out.println(a.toString());
        System.out.println(a.search(80));
        
        ListStack b=new ListStack();
        b.push("A");
        b.push("B");
        b.push("C");
        
        System.out.println(b.isEmpty());
        System.out.println(b.size());
        System.out.println(b.pop());
        System.out.println(b.peek());
        System.out.println(b.toString());
        System.out.println(b.search("B"));
    }
    
}
