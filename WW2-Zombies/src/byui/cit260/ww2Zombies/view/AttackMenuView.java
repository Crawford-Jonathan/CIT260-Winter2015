/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.util.Scanner;

/**Class is meant to be called from the Map View
 *The map View has yet to be created
 * We're working on it
 */
public class AttackMenuView {
    private final String ATTACKMENU = "\n"
            + "\n--------------------------------"
            + "\n| Attack Menu                    |"
            + "\n--------------------------------"
            + "\nA - Attack"
            + "\nG - Throw Grenade"
            + "\nS - Stop Attack"
            + "\nR - Retreat to Previous Menu"
            + "\n--------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do {
            //display Attack Menu
            System.out.println(ATTACKMENU);
            //get users selection
            String input = this.getInput();
            //get first character of string
            selection =input.charAt(0);
            //do action base off selection
            this.doAction(selection);
        } 
        //selecton is not "R"
        while (selection != 'R');
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'A':
                this.attack();
                break;
            case 'G':
                this.throwGrenade();
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
    }
    
        private void attack() {
            System.out.println("Open Fire!");
        }
        
        private void throwGrenade() {
            System.out.println("wait 5 seconds for results");
        }

    private String getInput() {
        
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

