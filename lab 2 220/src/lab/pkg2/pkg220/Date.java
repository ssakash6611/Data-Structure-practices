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
public class Date {
    int m,d,y;
    public void setMonth(int a){
        if(a>0||a<13){
        m=a;
        }
    }
    public void setDay(int b){
        if(b>0||b<32)
        d=b;
    }    
    public void setYear(int c){
        if(c>0){
        y=c;
        }
    }
    public void displayDate(){
        System.out.println(m+"/"+d+"/"+y);
    }
    
}
