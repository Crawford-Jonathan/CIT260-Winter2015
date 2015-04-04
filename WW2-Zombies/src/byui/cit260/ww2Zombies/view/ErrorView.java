/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import ww2.zombies.main.WW2Zombies;
import java.io.PrintWriter;


/**
 *
 * @author SilentMan
 */
public class ErrorView {
    
    //PrintWriter gets the outfile from the main
    private static final PrintWriter errorFile = WW2Zombies.getOutFile();
    private static final PrintWriter logFile = WW2Zombies.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "-------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n-----------------------------------------------");
        //Log the Error
        logFile.println(className + " - " + errorMessage);
    }
    
}
