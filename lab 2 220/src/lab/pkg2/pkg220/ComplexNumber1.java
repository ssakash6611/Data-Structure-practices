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
public class ComplexNumber1 extends RealNumber{
    double r;double i=1.0;
    public ComplexNumber1(){
        super.setRealValue(1.0);
        System.out.println(super.toString());
    }
    public ComplexNumber1(int a,int b){
        r=a;i=b;
        super.setRealValue(r);
        System.out.println(super.toString());
        
    }
    public String toString(){
        
        return "ImajinaryPart:"+i;
    }
    public void check(){
        System.out.println("I'm in ComplexNumber class");
        ping();
        System.out.println("Checking ended");
    }
    
    
}
