/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.util.Scanner;

/**
 *
 * @author SilentMan
 */
public class HelpMenuView {
    private final String MENU = "\n"
            + "\n--------------------------------"
            + "\n| Help Menu                    |"
            + "\n--------------------------------"
            + "\nD - Game Description"
            + "\nL - Look Around"
            //+ "\nW - Move North"
            //+ "\nS - Move South"
            //+ "\nA - Move East"
            //+ "\nD - Move West"
            + "\nM - View Map"
            + "\nV - View Inventory"
            + "\nR - Return to Previous Menu"
            + "\n--------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do {
            System.out.println(MENU);//display Help Menu
            String input = this.getInput();//get users selection
            selection =input.charAt(0);//get first character of string
            this.doAction(selection);//do action base off selection
        } 
        while (selection != 'R');//selecton is not "R"
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'D':
                this.gameDescription();
                break;
            case 'L':
                this.lookAround();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'V':
                this.viewInventory();
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
    }
    
        private void gameDescription() {
            System.out.println("place game description here");
        }
        
        private void lookAround() {
            System.out.println("you see stuff");
        }
        
        private void viewMap() {
            System.out.println("shows the map");
        }
        
        private void viewInventory() {
            System.out.println("view your stuff");
        }

    private String getInput() {
        //get the Player name, if new name than create new Player account
    
        //indicates if player name has been retreived
        boolean valid = false;
        String keyboardInput = null;
        //gets input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //asks for input
            System.out.println("Enter Command");
            
            //gets input from the keyboard and trims off the blanks
            keyboardInput = keyboard.nextLine();
            keyboardInput = keyboardInput.trim();
            //selection = Character.toUpperCase(selection);
            
            //invalid cases
            if (keyboardInput.length() != 1) {
                System.out.println("Invalid Input");
                //repeats
                continue;
            }
            
            //breaks out of the repetition
            break;
        }
        //return the keyboardInput
        return keyboardInput;
        
    }
}
        