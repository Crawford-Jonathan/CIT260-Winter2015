/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class BlastCalcView {
    private int power;
    private int diameter;
    private int heat;
    
    
    private String getInput(){
        
        Boolean goodInput1 = false;
        Boolean goodInput2 = false;
        Boolean goodInput3 = false;
        
        int inputPower;
        int inputDiameter;
        int inputHeat;
        
        while (goodInput1 == false){
            //get input from command line
            inputPower = this.getInput();//get users selection
            
            if (inputPower >19 && inputPower <61){
                goodInput1 = true;
            }
            
                    
           
        }
        
    }
    
    private int getInput() {
        //get the Player name, if new name than create new Player account
    
        //indicates if player name has been retreived
        boolean valid = false;
        String keyboardInput = null;
        int returnValue;
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
            if (keyboardInput.length() != 2) {
                System.out.println("Invalid Input");
                //repeats
                continue;
            }
            //convert from string to int
            
            //breaks out of the repetition
            break;
        }
        //return the keyboardInput
        return returnValue;
    }
    
}
