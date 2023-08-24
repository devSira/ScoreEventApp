/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreeventapp;

import java.util.Scanner;

/**
 *
 * @author Siraphob.B
 */
public class ScoreEventApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource s1 = new ScoreSource();
        Subscriber r1 = new Subscriber();
        Subscriber r2 = new Subscriber();
        s1.addMyListener(r1);
        s1.addMyListener(r2);
        Scanner sc = new Scanner(System.in);
        String score = "";
        while(true) {
            System.out.print("Enter score: ");
            score = sc.nextLine();
            if(score.equals("")) {
                return;
            }
            s1.setScoreLine(score);
        }        
    }
    
}
