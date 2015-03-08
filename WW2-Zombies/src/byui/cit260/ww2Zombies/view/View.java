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
        String value;
        
        do {
            System.out.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);
        }while(!value.equals("Q"));
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);

        
            while (!valid) {
            System.out.println("\t\nEnter your selection:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            break;
            }
        return selection;
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

