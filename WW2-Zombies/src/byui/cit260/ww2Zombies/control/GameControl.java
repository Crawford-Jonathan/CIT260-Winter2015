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
//import byui.cit260.ww2Zombies.control.MapControl;

/**
 *
 * @author Jonathan
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControl.MapControlException {
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
    
    public static Inventory[] createInventoryList() {
        //System.out.println("called createInventoryList() in GameControl");
        //return null;
        
        //sets inventory size
        Inventory[] inventory = new Inventory[5];
        
        Inventory medpack = new Inventory();
        medpack.setDescription("Medpack");
        medpack.setQuantityInStock(0);
        inventory[0] = medpack;
        
        Inventory ammo = new Inventory();
        ammo.setDescription("Ammunition");
        ammo.setQuantityInStock(0);
        inventory[1] = ammo;
        
        Inventory grenade = new Inventory();
        grenade.setDescription("Grenade");
        grenade.setQuantityInStock(0);
        inventory[2] = grenade;
        
        Inventory hideoutKey = new Inventory();
        hideoutKey.setDescription("Key to the Enemy Base");
        hideoutKey.setQuantityInStock(0);
        inventory[3] = hideoutKey;
        
        Inventory bombParts = new Inventory();
        bombParts.setDescription("Material to build a bomb");
        bombParts.setQuantityInStock(0);
        inventory[4] = bombParts;
        
        return inventory;
    }
}
