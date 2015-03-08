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
public abstract class BlastCalcView extends View {

    private int power;
    private int diameter;
    private int heat;

    //Im not sure what the error is, it's pulling the correct types from the view superclass
    public BlastCalcView(String promptMessage) {

    }

    //@Override
    public int getInput() {

        Boolean goodInput1 = false;
        Boolean goodInput2 = false;
        Boolean goodInput3 = false;

        int inputPower;
        int inputDiameter;
        int inputHeat;

        while (goodInput1 == false) {
            //get input from command line
            inputPower = this.getInput();//get users selection

            if (inputPower > 19 && inputPower < 61) {
                goodInput1 = true;
            }

        }
        while (goodInput2 == false) {
            //get input from command line
            inputDiameter = this.getInput();//get users selection

            if (inputDiameter > 19 && inputDiameter < 61) {
                goodInput2 = true;
            }
        }
        while (goodInput3 == false) {
            //get input from command line
            inputHeat = this.getInput();//get users selection

            if (inputHeat > 19 && inputHeat < 61) {
                goodInput3 = true;
            }
        }
        //get the Player name, if new name than create new Player account

        //indicates if player name has been retreived
        boolean valid = false;
        String keyboardInput = null;
        int returnValue = 56;
        //gets input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
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

            //breaks out of the repetition
            break;
        }
        //return the keyboardInput
        return returnValue;
    }

    public double calcBlast(double power, double diameter, double heat) {
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

    //@Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
