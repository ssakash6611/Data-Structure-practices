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
public class Task12 {
     public static void printDetail(Team t){
    System.out.println("----Printing Detail-----");
    System.out.println(t);
  }
  public static void main(String [] args){
    FootBallTeam f = new FootBallTeam("Brazil");
    CricketTeam c = new CricketTeam("India");
    printDetail(f);
    printDetail(c);
  }

    
}
