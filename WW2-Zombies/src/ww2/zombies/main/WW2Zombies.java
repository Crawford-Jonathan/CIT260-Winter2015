/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww2.zombies.main;

//import byui.cit260.ww2Zombies.model.Map;
import byui.cit260.ww2Zombies.model.Player;
//import byui.cit260.ww2Zombies.model.Actors;
//import byui.cit260.ww2Zombies.model.Animals;
import byui.cit260.ww2Zombies.model.Game;
//import byui.cit260.ww2Zombies.model.Locations;
import byui.cit260.ww2Zombies.view.StartProgramView;
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
    
    //PrintWrtier and BufferedREader classes
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
        
        StartProgramView startProgramView = new StartProgramView();
            
            try{
                startProgramView.display();
            } catch (Throwable te){
            System.out.println(te.getMessage());
                te.printStackTrace();
                startProgramView.display();
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
        /**finally {
            try {
                WW2Zombies.inFile.close();
                WW2Zombies.outFile.close();
            } catch (IOException ex) {
                Logger.getLogger(WW2Zombies.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        */
        //closes the in and outFiles, handles error exceptions
        finally {
            try{
                if(WW2Zombies.inFile != null)
                    WW2Zombies.inFile.close();
                
                if (WW2Zombies.outFile != null)
                    WW2Zombies.outFile.close();
                
                if (WW2Zombies.logFile != null)
                    WW2Zombies.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        //StartProgramView display;
        //display = new StartProgramView("") {

            

            //@Override
            // boolean doAction(Object obj) {
            //    throw new UnsupportedOperationException();
           // };
        //};
        //display.display();

        /*
        
         //calls the Player class
         Player playerOne = new Player();
        
         playerOne.setName("Fred Flintstone");
        
         String playerInfo = playerOne.toString();
         System.out.println(playerInfo);
        
         //calls Map class
         Map islandOne = new Map();
        
         islandOne.setRowCount(5);
         islandOne.setColumnCount(5);
         islandOne.setAreaDiscovered(10);
        
         String mapInfo = islandOne.toString();
         System.out.println(mapInfo);
        
         //calls Locations class
         Locations roomOne = new Locations();    
        
         roomOne.setAnimals("deer");
         roomOne.setEnemies("zombies");
         roomOne.setItems("snake antivenom");
         roomOne.setWeapons("M1 Garand");
         roomOne.setLocationColumnCount(5);
         roomOne.setLocationRowCount(5);
        
         String locationsInfo = roomOne.toString();
         System.out.println(locationsInfo);
        
         //calls Animals class
         Animals islandAnimals = new Animals();
        
         islandAnimals.setDeer("deer");
         islandAnimals.setMonkey("monkey");
         islandAnimals.setPheasent("pheasent");
        
         String animalsInfo = islandAnimals.toString();
         System.out.println(animalsInfo);
        
         //Calls Game Class
         Game newGame=new Game();
        
         //Calls Actors Class
         //Actors character=new Actors();
         //character.setActor(1);
         //character.setActor(2);
         //character.setActor(3);
         //character.setActor(4);
        
         */
    }

    public static PrintWriter getoutFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**private static class startProgramView {
            
        //private static void display() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //}

        public startProgramView() {
        }
    }
*/
    
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
