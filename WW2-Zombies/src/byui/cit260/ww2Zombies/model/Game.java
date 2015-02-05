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
 * @author Jonathan
 */
public class Game implements Serializable{
   
    //constructor
    public Game(String name) {
        this.name = name;
    }
 
//Class instance variable
    private String name;
    public Game(){
    };
    
    
    // Getter and Setter
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Hashcode
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }
    //equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    //toString
    @Override
    public String toString() {
        return "Game{" + "name=" + name + '}';
    }

   

    

   
}
