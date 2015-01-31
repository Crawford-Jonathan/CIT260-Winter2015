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
public class Animals {
    
    private String pheasent;
    private String monkey;
    private String deer;

    //getter and setter functions
    public String getPheasent() {
        return pheasent;
    }

    public void setPheasent(String pheasent) {
        this.pheasent = pheasent;
    }

    public String getMonkey() {
        return monkey;
    }

    public void setMonkey(String monkey) {
        this.monkey = monkey;
    }

    public String getDeer() {
        return deer;
    }

    public void setDeer(String deer) {
        this.deer = deer;
    }
    
    //constructor
    public Animals() {
    }

    //toString
    @Override
    public String toString() {
        return "Animals{" + "pheasent=" + pheasent + ", monkey=" + monkey + ", deer=" + deer + '}';
    }

    //equals and hashCode functions
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.pheasent);
        hash = 11 * hash + Objects.hashCode(this.monkey);
        hash = 11 * hash + Objects.hashCode(this.deer);
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
        final Animals other = (Animals) obj;
        if (!Objects.equals(this.pheasent, other.pheasent)) {
            return false;
        }
        if (!Objects.equals(this.monkey, other.monkey)) {
            return false;
        }
        if (!Objects.equals(this.deer, other.deer)) {
            return false;
        }
        return true;
    }
    
    
    
}
