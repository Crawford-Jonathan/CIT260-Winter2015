/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ww2.zombies.main.WW2Zombies;

/**
 *
 * @author Jonathan
 */
public abstract class View implements ViewInterface {

    private String promptMessage;
    
    protected final BufferedReader keyboard = WW2Zombies.getInFile();
    protected final PrintWriter console = WW2Zombies.getoutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        String value;

        do {
            
            this.console.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);
        } while (!value.equals("Q"));
    }

    @Override
    public String getInput() {
        
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        //Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("\t\nEnter your selection:");

            try {
                selection = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
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
