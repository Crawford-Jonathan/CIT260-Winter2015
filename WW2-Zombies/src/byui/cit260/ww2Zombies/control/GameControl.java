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
import byui.cit260.ww2Zombies.model.Inventory.Item;
import byui.cit260.ww2Zombies.model.Locations;
import byui.cit260.ww2Zombies.model.Map;
//import byui.cit260.ww2Zombies.control.MapControl;

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
    
    public static Inventory[] createInventoryList() {
        //System.out.println("called createInventoryList() in GameControl");
        //return null;
        
        
        
        //sets inventory size
        Inventory[] inventory = new Inventory[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        Inventory medpack = new Inventory();
        medpack.setDescription("Medpack");
        medpack.setQuantityInStock(0);
        inventory[Item.medpack.ordinal()] = medpack;
        
        Inventory ammo = new Inventory();
        ammo.setDescription("Ammunition");
        ammo.setQuantityInStock(0);
        inventory[Item.ammo.ordinal()] = ammo;
        
        Inventory grenade = new Inventory();
        grenade.setDescription("Grenade");
        grenade.setQuantityInStock(0);
        inventory[Item.grenade.ordinal()] = grenade;
        
        Inventory hideoutKey = new Inventory();
        hideoutKey.setDescription("Key to the Enemy Base");
        hideoutKey.setQuantityInStock(0);
        inventory[Item.hideoutKey.ordinal()] = hideoutKey;
        
        Inventory bombParts = new Inventory();
        bombParts.setDescription("Material to build a bomb");
        bombParts.setQuantityInStock(0);
        inventory[Item.bombParts.ordinal()] = bombParts;
        
        return inventory;
    }

    static void assignLocationsToMap(Map map, Locations[] locations) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Inventory[] getSortedInventoryList() {
        System.out.println("getSortedInventoryList called from GameControl");
        return null;
    }
}
