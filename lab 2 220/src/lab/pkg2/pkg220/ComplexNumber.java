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
public class ComplexNumber {
    int x,y;
    public ComplexNumber(int a,int b){
       x=a;
       y=b;
        
    }
    public void increaseValue(){
        x=x+2;
        y=y+2;
    }
    public String toString(){
        return x+"+ i"+y;
    }
    public double polarRadius() {
          return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    
}
