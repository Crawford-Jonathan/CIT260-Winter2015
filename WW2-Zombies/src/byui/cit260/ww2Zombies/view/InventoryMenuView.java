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
                + "\n| Inventory Menu                    |"
                + "\n-------------------------------------"
                + "\nP - Pick up Item"
                + "\nD - Drop Item"
                + "\nU - Use Item"
                + "\nE - Equip Item"
                + "\nM - Veiw Map"
                + "\nR - Return to Previous Menu"
                + "\n-------------------------------------");
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'P':
                this.pickUpItem();
                break;
            case 'D':
                this.dropItem();
                break;
            case 'U':
                this.useItem();
                break;
            case 'E':
                this.equipItem();
                break;
            case 'V':
                this.viewMap();
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
    }

    private void pickUpItem() {
        System.out.println("Picks up item.");
            //UpgradeCarrySpace gameMenu = new UpgradeCarrySpace();
        //gameMenu.displayMenu();
    }

    private void dropItem() {
        System.out.println("Drops item on the ground.");
    }

    private void useItem() {
        System.out.println("Uses item.");
    }

    private void equipItem() {
        System.out.println("Equips Item.");
    }

    private void viewMap() {
        System.out.println("Looks at map.");
    }

    //@Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
