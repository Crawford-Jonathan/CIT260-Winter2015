/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author SilentMan
 */
public class Enemies implements Serializable{
    
    //class instance variables
    private String zombies;
    
    //constructor
    public Enemies() {
    }

    //getter and setter functions
    public String getZombies() {
        return zombies;
    }

    public void setZombies(String zombies) {
        this.zombies = zombies;
    }

    //toString
    @Override
    public String toString() {
        return "Enemies{" + "zombies=" + zombies + '}';
    }

    //hashCode and equals functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.zombies);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enemies other = (Enemies) obj;
        if (!Objects.equals(this.zombies, other.zombies)) {
            return false;
        }
        return true;
    }
    
    
    
}
