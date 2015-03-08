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
public abstract class View implements ViewInterface {

    private String promptMessage;
    @Override
    public void display() {
        String value = "";
        boolean done = false;

        do {
            System.out.println(this.promptMessage);
            value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }

    //@Override
    public String getInput() {

        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);

        
            while (!valid) {
                selection = this.keyboard.readLine();
            }
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("You must enter a value.");
            }
        
        
        /**
         * while (!valid) {
         *
         * System.out.println("Enter Command");
         *
         * selection = keyboard.nextLine(); selection = selection.trim();
         *
         * if (selection.length() != 1) { System.out.println("Invalid Input");
         *
         * continue; }
         *
         * break; }
         *
         * return selection;
         *
         * }
         */
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
}
