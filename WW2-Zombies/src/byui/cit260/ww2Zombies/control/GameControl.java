/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

import byui.cit260.ww2Zombies.model.Bomb;
import byui.cit260.ww2Zombies.model.Enemies;
import byui.cit260.ww2Zombies.model.Game;
import byui.cit260.ww2Zombies.model.Player;
import ww2.zombies.main.WW2Zombies;
import byui.cit260.ww2Zombies.model.Inventory;
import byui.cit260.ww2Zombies.model.Map;

/**
 *
 * @author Jonathan
 */
public class GameControl {

    public static void createNewGame(Player player) {
        //System.out.println("createNewGame in GameControl called");
        
        //create new game
        Game game = new Game();
        WW2Zombies.setCurrentGame(game);
        
        //save player in Game
        game.setPlayer(player);
        
        //create the inventory list and save in the game
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Bomb bomb = new Bomb();
        game.setBomb(bomb);
        
        Enemies enemies = new Enemies();
        game.setEnemies(enemies);
                
        Map map = MapControl.createMap();
        game.setMap(map);
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
        
    }
    
}
