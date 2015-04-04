/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import byui.cit260.ww2Zombies.control.GameControl;
import byui.cit260.ww2Zombies.model.Inventory;
//import java.util.Scanner;

/**
 *
 * @author SilentMan
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n|         Help Menu            |"
                + "\n--------------------------------"
                + "\nD - Game Description"
                + "\nM - View Map"
                + "\nV - View Inventory"
                + "\nE - Return to Previous Menu"
                + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'D':
                this.gameDescription();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'V':
                this.viewInventory();
                break;
            case 'E':
                return false;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
        return false;
    }

    private void gameDescription() {
        System.out.println("\n*                     Your Mission:                     *"
                         + "\n*      The Nazis have been conducting experiments       *"
                         + "\n*          and created the Zombie Apocalypse.           *"
                         + "\n*          Your squad must create a bomb using          *"
                         + "\n*           native materials and blow the Nazi          *"
                         + "\n*         base into as many pieces as possible.         *");
    }

    private void viewMap() {
        System.out.println("shows the map");
    }

    private void viewInventory() {
        Inventory[]  inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Required" + "\t" + "In Stock");
        
        //for each inventory item
        for (Inventory inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t  " + 
                    inventoryItem.getRequiredAmount() + "\t  " + 
                    inventoryItem.getQuantityInStock());
        }
    }
}
