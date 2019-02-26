/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.pkg220;
import java.util.Scanner;
/**
 *
 * @author Akash
 */
public class DateTest {
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("Give me a month");
        int a=j.nextInt();
        System.out.println("Give me a day");
        int a1=j.nextInt();
        System.out.println("Give me a year");
        int a2=j.nextInt();
        Date d=new Date();
        d.setMonth(a);
        d.setDay(a1);
        d.setYear(a2);
        d.displayDate();
        
    }
    
}
