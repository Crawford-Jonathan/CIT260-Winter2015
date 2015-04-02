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
                + "\n|         Game Menu            |"
                + "\n--------------------------------"
                + "\nM - View Map"
                + "\nL - Look Around"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West"
                + "\nV - View Inventory"
                + "\nB - Bomb Calculations"
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
            case 'B':
                this.bombCalc();
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
        System.out.println("You see nothing but jungle.  You hear the low moaning of zombies.  "
                + "\nBest get moving before they find you.");
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
    
    private void bombCalc() {
        BlastCalcView bombCalc = new BlastCalcView(""); 
        bombCalc.display();
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

