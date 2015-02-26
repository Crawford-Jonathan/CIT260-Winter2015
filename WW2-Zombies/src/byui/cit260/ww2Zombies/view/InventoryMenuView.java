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
public class InventoryMenuView {
    private final String MENU = "\n"
            +"\n-------------------------------------"
            +"\n| Inventory Menu                    |"
            +"\n-------------------------------------"
            +"\nP - Pick up Item"
            +"\nD - Drop Item"
            +"\nU - Use Item"
            +"\nE - Equip Item"
            +"\nM - Veiw Map"
            +"\nR - Return to Previous Menu"
            +"\n-------------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do {
            System.out.println(MENU);//display Help Menu
            String input = this.getInput();//get users selection
            selection =input.charAt(0);//get first character of string
            this.doAction(selection);//do action base off selection
        } 
        while (selection != 'R');
    }
    private void doAction(char choice){
        switch (choice){
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
        private void pickUpItem(){
            System.out.println("Picks up item.");
            //UpgradeCarrySpace gameMenu = new UpgradeCarrySpace();
            //gameMenu.displayMenu();
        }
        private void dropItem(){
            System.out.println("Drops item on the ground.");
        }
        private void useItem(){
            System.out.println("Uses item.");
        }
        private void equipItem(){
            System.out.println("Equips Item.");
        }
        private void viewMap(){
            System.out.println("Looks at map.");
        }
    private String getInput() {
        //get the Player name, if new name than create new Player account
    
        //indicates if player name has been retreived
        boolean valid = false;
        String keyboardInput = null;
        //gets input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //asks for input
            System.out.println("Enter Command");
            
            //gets input from the keyboard and trims off the blanks
            keyboardInput = keyboard.nextLine();
            keyboardInput = keyboardInput.trim();
            //input.CharAt(0) = Character.toUpperCase(input.CharAt(0));
            
            //invalid cases
            if (keyboardInput.length() != 1) {
                System.out.println("Invalid Input");
                //repeats
                continue;
            }
            
            //breaks out of the repetition
            break;
        }
        //return the keyboardInput
        return keyboardInput;
    }
}
