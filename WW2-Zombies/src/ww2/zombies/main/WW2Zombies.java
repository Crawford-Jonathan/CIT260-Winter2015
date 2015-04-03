/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww2.zombies.main;

import byui.cit260.ww2Zombies.model.Player;
import byui.cit260.ww2Zombies.model.Game;
import byui.cit260.ww2Zombies.view.StartProgramView;
import byui.cit260.ww2Zombies.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SilentMan
 */
public class WW2Zombies {

    private static Game currentGame = null;
    private static Player player = null;
    
    //PrintWriter and BufferedReader classes
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        WW2Zombies.logFile = logFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        WW2Zombies.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        WW2Zombies.player = player;
    }

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView("");
            
            try{
                startProgramView.display();
                //View.display();
            } catch (Throwable te){
            System.out.println(te.getMessage());
                te.printStackTrace();
                startProgramView.display();
                //View.display();
            }
        
        
        try {
            WW2Zombies.inFile = new BufferedReader(new InputStreamReader(System.in));
            WW2Zombies.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            WW2Zombies.logFile = new PrintWriter(filePath);
        } catch (Exception e) {
            System.out.println(
                    "Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
        }
        
        //closes the in and outFiles, handles error exceptions
        finally {
            try{
                if(WW2Zombies.inFile != null)
                    WW2Zombies.inFile.close();
                
                if (WW2Zombies.outFile != null)
                    WW2Zombies.outFile.close();
                
                if (WW2Zombies.logFile != null)
                    WW2Zombies.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }

    }
    
    //getter and setter function for PrintWriter and BufferedReader
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        WW2Zombies.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        WW2Zombies.inFile = inFile;
    }

}
