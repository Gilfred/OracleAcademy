/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundation;

import java.util.Scanner;

/**
 *
 * @author gilfred
 */
public class Foundation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "";
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Hello, and welcome to my console application.\nThis is only a test to ensure things have been set up nicely\nWhat is your name?");
        name = userInput.nextLine();
        System.out.println("Hello " + name + "\nIt is a pleasure to meet you!");
    }
    
}
