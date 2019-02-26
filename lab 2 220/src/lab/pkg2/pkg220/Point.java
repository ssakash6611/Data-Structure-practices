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
public class Point {
    double x,y;
    public Point(int a,int b){
        x=a;
        y=b;                
    }
    public double distanceFromOrigin(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
}
