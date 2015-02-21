/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

/**
 *
 * @author SilentMan
 */
public class MainMenuView {
    private final String MENU = "\n"
            + "\n--------------------------------"
            + "\n| Main Menu                    |"
            + "\n--------------------------------"
            + "\nG - Start Game"
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
        while (selection != 'E');//selecton is not "Exit"    (I do not understand what is wrong with this nor how to change it)
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}