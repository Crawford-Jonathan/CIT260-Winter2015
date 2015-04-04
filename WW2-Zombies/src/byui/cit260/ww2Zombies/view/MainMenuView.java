/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import byui.cit260.ww2Zombies.control.GameControl;
import byui.cit260.ww2Zombies.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ww2.zombies.main.WW2Zombies;

/**
 *
 * @author SilentMan
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Main Menu                    |"
                + "\n--------------------------------"
                + "\nG - Start New Game"
                + "\nC - Continue From Saved Game"
                + "\nH - Get Help On How to Play The Game"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n--------------------------------");

    }

    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'G':
        {
            try {
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
                return true;
            default:
                ErrorView.display("MainMenuView", " Invalid Selection, Try Again");
                break;
        }
        return false;
    }
    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(WW2Zombies.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void continueSavedGame() {
        System.out.println("Where will the game be saved?");
        
        String filePath = this.getInput();
        
        try {
            //start saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView(); 
        helpMenu.display();
    }

    private void saveCurrentGame() {
        System.out.println("Enter the location where you want to save the game");
        String filePath = this.getInput();
        
        try {
            //save game to file
            GameControl.saveCurrentGame(WW2Zombies.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void exitGame() {
        System.out.println("exit the game function");
    }
}


