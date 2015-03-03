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
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Main Menu                    |"
                + "\n--------------------------------"
                + "\nG - Start New Game"
                + "\nC - Continue Saved Game"
                + "\nH - Get Help On How to Play The Game"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n--------------------------------");
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
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveCurrentGame() {
        System.out.println("save game function called");
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
