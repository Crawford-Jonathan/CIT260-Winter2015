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
            case 'C':
                this.calcInvSpace();
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
        System.out.println("+1 item");
    }

    private void calcInvSpace() {
        //find out the total backpack space
        System.out.println("Everyone in the squad has a backpack. You need to "
                + "find out how much total space is available.  "
                + "\n dimensions are in feet - x, y, z"
                + "\n Sarge - 2, 1, 2 "
                + "\n 3 Rifleman - 2, 1, 3"
                + "\n Grendier - 2, 2, 3");
        int total = 192;
        if (total == 192) {
            System.out.println("Correct");
            
        } else {
              System.out.println("Incorrect, try again");
            }      
    
    }
    
    private void viewInventory() {
        System.out.println("See list of Inventory");
    }
}
