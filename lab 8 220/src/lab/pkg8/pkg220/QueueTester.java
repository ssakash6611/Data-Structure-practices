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
public class QueueTester {

    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        ArrayQueue a = new ArrayQueue();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);

        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.dequeue());
        System.out.println(a.peek());
        System.out.println(a.toString());
        System.out.println(a.search(80));

        ListQueue b = new ListQueue();
        b.enqueue("A");
        b.enqueue("B");
        b.enqueue("C");

        System.out.println(b.isEmpty());
        System.out.println(b.size());
        System.out.println(b.dequeue());
        System.out.println(b.peek());
        System.out.println(b.toString());
        System.out.println(b.search("B"));
    }

}
