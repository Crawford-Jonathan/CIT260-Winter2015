/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import ww2.zombies.main.WW2Zombies;

/**
 *
 * @author Jonathan
 */
public abstract class View implements ViewInterface {

    private String promptMessage;
    
    protected final BufferedReader keyboard = WW2Zombies.getInFile();
    protected final PrintWriter console = WW2Zombies.getOutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        String value;
        boolean done = false;
        
        do {  
            //throwing NullPointException Error, console is getting null
            this.console.println(this.promptMessage);
            value = this.getInput();
            done = this.doAction(value);
        } while (!done); //while (!value.equals("E"));
    }

    @Override
    public String getInput() {
        
        boolean valid = false;
        String selection = null;

        try {
        //while there is no valid name retrieved
        while (!valid) {
            //System.out.println("\t\nEnter your selection:");

            
                selection = this.keyboard.readLine();
                selection = selection.trim();
            
        if (selection.length() < 1) {
                //System.out.println("You must enter a value.");
                ErrorView.display(this.getClass().getName(), "You must enter a value");
                continue;
            }
            break;
        }
        
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            //System.out.println("Error reading input: " + e.getMessage());
            //return null;
            }
            
        //returns name    
        return selection;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
