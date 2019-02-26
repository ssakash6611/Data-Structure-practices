/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.pkg220;

/**
 *
 * @author Akash
 */
public class Task11 {
        public static void main(String[] args) {
        RealNumber rn = new ComplexNumber1();
        System.out.println(rn);
        
        System.out.println("--------------------");
        
        rn = new ComplexNumber1(5, 7);
        System.out.println(rn);
                System.out.println("--------------------");
        ComplexNumber1 cn = new ComplexNumber1();
        cn.check();
    }

}
