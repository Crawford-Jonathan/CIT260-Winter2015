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
public abstract class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
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
                + "\n--------------------------------");
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

    //@Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
