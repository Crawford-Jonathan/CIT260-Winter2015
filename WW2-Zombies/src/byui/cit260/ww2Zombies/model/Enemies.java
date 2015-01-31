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
    private String japaneseSoldier;
    private String jaguar;
    private String snake;
    
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

    public String getJapaneseSoldier() {
        return japaneseSoldier;
    }

    public void setJapaneseSoldier(String japaneseSoldier) {
        this.japaneseSoldier = japaneseSoldier;
    }

    public String getJaguar() {
        return jaguar;
    }

    public void setJaguar(String jaguar) {
        this.jaguar = jaguar;
    }

    public String getSnake() {
        return snake;
    }

    public void setSnake(String snake) {
        this.snake = snake;
    }

    //toString
    @Override
    public String toString() {
        return "Enemies{" + "zombies=" + zombies + ", japaneseSoldier=" + japaneseSoldier + ", jaguar=" + jaguar + ", snake=" + snake + '}';
    }

    //hashCode and equals functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.zombies);
        hash = 59 * hash + Objects.hashCode(this.japaneseSoldier);
        hash = 59 * hash + Objects.hashCode(this.jaguar);
        hash = 59 * hash + Objects.hashCode(this.snake);
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
        if (!Objects.equals(this.japaneseSoldier, other.japaneseSoldier)) {
            return false;
        }
        if (!Objects.equals(this.jaguar, other.jaguar)) {
            return false;
        }
        if (!Objects.equals(this.snake, other.snake)) {
            return false;
        }
        return true;
    }
    
    
    
}
