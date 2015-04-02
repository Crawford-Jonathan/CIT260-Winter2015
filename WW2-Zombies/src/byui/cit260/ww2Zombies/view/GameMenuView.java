/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import byui.cit260.ww2Zombies.control.GameControl;
import byui.cit260.ww2Zombies.model.Inventory;

/**
 *
 * @author SilentMan
 */
public class GameMenuView extends View{
    public GameMenuView() {

    super("\n + "
                + "\n--------------------------------"
                + "\n|         Help Menu            |"
                + "\n--------------------------------"
                + "\nM - View Map"
                + "\nW - Move North"
                + "\nS - Move South"
                + "\nA - Move East"
                + "\nD - Move West"
                + "\nV - View Inventory"
                + "\nR - Return to Previous Menu"
                + "\n-------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'M':
                this.viewMap();
                break;
            case 'L':
                this.lookAround();
                break;
            case 'W':
                this.moveNorth();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'A':
                this.moveWest();
                break;
            case 'D':
                this.moveEast();
                break;
            case 'V':
                this.viewInventory();
                break;
            case 'R':
                return false;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
        return false;
    }
    
    private void viewMap() {
        System.out.println("shows the map");
    }
    
    private void lookAround() {
        System.out.println("you see nothing but jungle.  Best get moving.");
    }
    
    private void moveNorth() {
        System.out.println("code to move north");
    }
    
    private void moveSouth() {
        System.out.println("code to move south");
    }
    
    private void moveEast() {
        System.out.println("code to move east");
    }
    
    private void moveWest() {
        System.out.println("code to move west");
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

