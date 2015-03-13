/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.model;

import java.io.Serializable;

/**
 *
 * @author SilentMan
 */
public class Bomb implements Serializable{
    
    private String description;
    private double explosives;
    private double casing;
    
    public Bomb() {
        this.description = "\nCreate and deploy the explosive in the enemy "
                         + "\nbase to stop the flood of zombies.";
        
        this.explosives = 0;
        this.casing = 0;
    }
}
