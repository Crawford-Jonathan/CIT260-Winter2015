/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww2.zombies.main;

import byui.cit260.ww2Zombies.model.Player;

/**
 *
 * @author SilentMan
 */
public class WW2Zombies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
