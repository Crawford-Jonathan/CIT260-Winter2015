/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

import java.util.Scanner;

/**I'm really not quite sure how to get the inputs to redirect to a variable
 * that can be put into a math formula.
 * Once I know how to do that, all I have to do is get the code from the InventoryControl
 * and put it in.
 */
public class upgradeCarrySpace {
 
    private final String MENU = "\n"
            + "\n--------------------------------"
            + "\n| Upgrading Your Backpack                    |"
            + "\n--------------------------------"
            + "\nW - Enter the Width of the Backpack"
            + "\nH - Enter the Height of the Backpack"
            + "\nD - Enter the Depth of the Backpack"
            //+ "\nD - Enter Backpack Dimensions"
            + "\nR - Return to Previous Menu"
            + "\n--------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do {
            System.out.println(MENU);//display Help Menu
            String input = this.getInput();//get users selection
            selection =input.charAt(0);//get first character of string
            this.doAction(selection);//do action base off selection
        } 
        while (selection != 'R');//selecton is not "R"
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'W':
                //double width = this.width();
                this.width();
                break;
            case 'H':
                this.height();
                break;
            case 'D':
                this.depth();
                break;
               
            //case 'D':
            //     this.backpackDimensions();
            //    break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
    }
        
        private void width() {
            System.out.println("");
        }
        
        private void height() {
            System.out.println("");
        }
        
        private void depth() {
            System.out.println("");
        }
        
        //private void backpackDimensions() {}
            
        

    private String getInput() {    
        
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
            //selection = Character.toUpperCase(selection);
            
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
        


    
  