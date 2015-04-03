/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
public class BlastCalcView extends View {

    public BlastCalcView() {
            super("\n*  To blow up the Nazi's base you will need an extremely precise amount  *"
                + "\n*            of explosives (meaning a lot).  You need to find            *"
                + "\n*        the power of the bomb to know if it will be sufficient.         *"
                + "\n*            P - create the blast power of the bomb                      *"
                + "\n*            D - create the diameter of the bomb                         *"
                + "\n*            E - Return to previous menu                                 *");
    }
    /**
     *
     * @param promptMessage
     */

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            //case 'P':
            //    this.blastPower();
            //    break;
            case 'D':
                this.bombDiameter();
                break;
            case 'E':
                return false;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try Again");
                break;
        }
    return false;
    }
    
    //this calc will find the diameter of the bomb
    //player will have metal in sq. feet, find how big a bomb can be made
    public int bombDiameter() {

        Boolean goodInput1 = false;
        Boolean goodInput2 = false;
        Boolean goodInput3 = false;

        int inputPower;
        int inputDiameter;
        int inputHeat;

        while (goodInput1 == false) {
            //get input from command line
            inputPower = this.bombDiameter();//get users selection

            if (inputPower > 19 && inputPower < 61) {
                goodInput1 = true;
            }

        }
        while (goodInput2 == false) {
            //get input from command line
            inputDiameter = this.bombDiameter();//get users selection

            if (inputDiameter > 19 && inputDiameter < 61) {
                goodInput2 = true;
            }
        }
        while (goodInput3 == false) {
            //get input from command line
            inputHeat = this.bombDiameter();//get users selection

            if (inputHeat > 19 && inputHeat < 61) {
                goodInput3 = true;
            }
        }

    //I dont know why all this code is here
        
        //indicates if player name has been retreived
        boolean valid = false;
        String keyboardInput = null;
        int returnValue = 56;
        //gets input from the keyboard
        //Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            //asks for input
            System.out.println("Enter Command");

            try {
                //gets input from the keyboard and trims off the blanks
                keyboardInput = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(BlastCalcView.class.getName()).log(Level.SEVERE, null, ex);
            }
            keyboardInput = keyboardInput.trim();
            //input.CharAt(0) = Character.toUpperCase(input.CharAt(0));

            //invalid cases
            if (keyboardInput.length() != 2) {
                System.out.println("Invalid Input");
                //repeats
                continue;
            }

            //breaks out of the repetition
            break;
        }
        //return the keyboardInput
        return returnValue;
    }

    //Player gives bomb diameter, find how much explosive can be stuffed in there
    public double blastPower(double power, double diameter, double heat) {
        
        
        
        if (power < 20 || power > 60) {
            return -1;
        }
        if (diameter < 20 || diameter > 60) {
            return -1;
        }
        if (heat < 20 || heat > 60) {
            return -1;
        }
        double blast = power * diameter * heat;
        return blast;
    }

    

}
