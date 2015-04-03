/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

//import byui.cit260.ww2Zombies.control.UpgradeCarrySpace;
import byui.cit260.ww2Zombies.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public abstract class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n|      Inventory Menu               |"
                + "\n-------------------------------------"
                + "\nP - Pick up Item"
                + "\nD - Drop Item"
                + "]nV - View Inventory"
                + "\nR - Return to Previous Menu"
                + "\n-------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'P':
                this.pickUpItem();
                break;
            case 'D':
                this.dropItem();
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

    private void pickUpItem() {
        System.out.println("Picks up item.");
    }

    private void dropItem() {
        System.out.println("Drops item on the ground.");
    }
    
    private void viewInventory() {
        System.out.println("See list of Inventory");
    }
}
