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
public class VehicleUser {
    public static void main(String[]args){
                Vehicle car = new Vehicle();
                System.out.println(car.toString());
                car.moveUp();
                System.out.println(car.toString());
                car.moveLeft();
                System.out.println(car.toString());
                car.moveDown();
                System.out.println(car.toString());
                car.moveRight();
                System.out.println(car.toString());
                System.out.println(car); 


    }
    
}
