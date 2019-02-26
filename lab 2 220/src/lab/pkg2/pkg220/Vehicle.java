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
public class Vehicle {
    int x,y;
    public void moveUp(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveDown(){
        y--;
    }
    public void moveRight(){
        x++;
    }
    public String toString(){
        return"("+x+","+y+")";
    }
    
}
