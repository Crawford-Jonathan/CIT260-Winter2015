/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.util.Scanner;

/**
 * Class is meant to be called from the Room View The Room View has yet to be
 * created We're working on it
 */
public abstract class AttackMenuView extends View {

    public AttackMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Attack Menu                    |"
                + "\n--------------------------------"
                + "\nA - Attack"
                + "\nG - Throw Grenade"
                //stop attack is the same as retreat to previous menu
                //+ "\nS - Stop Attack"
                + "\nR - Retreat to Previous Menu"
                + "\n--------------------------------");
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
        System.out.println("wait 5 seconds for explosion");
    }

    //@Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
