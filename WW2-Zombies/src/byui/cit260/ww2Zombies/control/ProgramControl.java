/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

import byui.cit260.ww2Zombies.model.Player;
import ww2.zombies.main.WW2Zombies;

/**
 *
 * @author SilentMan
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        //saves the player
        WW2Zombies.setPlayer(player);
        
        return player;
    }
    
}
