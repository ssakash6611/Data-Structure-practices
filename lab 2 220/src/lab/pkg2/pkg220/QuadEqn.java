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
public class QuadEqn {
    int a,b,c;
    public QuadEqn(int b1,int b2,int b3){
        a=b1;
        b=b2;
        c=b3;
        
    }
    public double root(){
        return (-(-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
    }
    
    
}
