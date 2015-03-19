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

/**
 *
 * @author SilentMan
 */
public class WW2Zombies {
    
    private static Game currentGame = null;
    private static Player player = null;

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
        
        StartProgramView display;
        display = new StartProgramView("") {
            try{
            //startProgramView.display();
            }
            catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
            @Override
            public boolean doAction(Object obj) {
                throw new UnsupportedOperationException();
            }
        };
        display.display();
        
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

    private static class startProgramView {

        private static void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public startProgramView() {
        }
    }
    
}
