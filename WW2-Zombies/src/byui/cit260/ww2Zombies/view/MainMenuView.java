/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import byui.cit260.ww2Zombies.control.GameControl;
import byui.cit260.ww2Zombies.model.GameMenuView;
import java.util.Scanner;
import ww2.zombies.main.WW2Zombies;

/**
 *
 * @author SilentMan
 */
public class MainMenuView {
    private final String MENU = "\n"
            + "\n--------------------------------"
            + "\n| Main Menu                    |"
            + "\n--------------------------------"
            + "\nG - Start New Game"
            + "\nC - Continue Saved Game"
            + "\nH - Get Help On How to Play The Game"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n--------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do {
            System.out.println(MENU);//display Main Menu
            String input = this.getInput();//get users selection
            selection =input.charAt(0);//get first character of string
            this.doAction(selection);//do action base off selection
        } 
        while (selection != 'E');//selecton is not "Exit"
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'G':
                this.startNewGame();
                break;
            case 'C':
                this.continueSavedGame();
                break;
            case 'H':
                this.helpMenu();
                break;
            case 'S':
                this.saveCurrentGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
    }
    
        private void startNewGame() {
            //System.out.println("startNewGame function called");
            GameControl.createNewGame(WW2Zombies.getPlayer());
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        }
        
        private void continueSavedGame() {
            System.out.println("continue saved game function called");
        }
        
        private void helpMenu() {
            System.out.println("helpMenu called");
        }
        
        private void saveCurrentGame() {
            System.out.println("save game function called");
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
