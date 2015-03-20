/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author SilentMan
 */
public class Location implements Serializable{
    
    //class instance variables
    public ArrayList<Animals> animals = new ArrayList<>();
    public ArrayList<Enemies> enemies = new ArrayList<>();
    public ArrayList<Inventory> items = new ArrayList<>();
    public ArrayList<Inventory> weapons = new ArrayList<>();
    private double locationRowCount;
    private double locationColumnCount;
    private ArrayList<Actors> actors;

    //constructor
    public Location() {
    }
    
    //getter and setter functions
    public ArrayList getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList animals) {
        this.animals = animals;
    }

    public ArrayList getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList enemies) {
        this.enemies = enemies;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public ArrayList getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList weapons) {
        this.weapons = weapons;
    }

    public double getLocationRowCount() {
        return locationRowCount;
    }

    public void setLocationRowCount(double locationRowCount) {
        this.locationRowCount = locationRowCount;
    }

    public double getLocationColumnCount() {
        return locationColumnCount;
    }

    public void setLocationColumnCount(double locationColumnCount) {
        this.locationColumnCount = locationColumnCount;
    }
    
    public ArrayList<Actors> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actors> actors) {
        this.actors = actors;
    }

    //toString
    @Override
    public String toString() {
        return "Locations{" + "animals=" + animals + ", enemies=" + enemies + ", items=" + items + ", weapons=" + weapons + ", locationRowCount=" + locationRowCount + ", locationColumnCount=" + locationColumnCount + '}';
    }

    //equals and hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.animals);
        hash = 53 * hash + Objects.hashCode(this.enemies);
        hash = 53 * hash + Objects.hashCode(this.items);
        hash = 53 * hash + Objects.hashCode(this.weapons);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.locationRowCount) ^ (Double.doubleToLongBits(this.locationRowCount) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.locationColumnCount) ^ (Double.doubleToLongBits(this.locationColumnCount) >>> 32));
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.enemies, other.enemies)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.weapons, other.weapons)) {
            return false;
        }
        if (Double.doubleToLongBits(this.locationRowCount) != Double.doubleToLongBits(other.locationRowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.locationColumnCount) != Double.doubleToLongBits(other.locationColumnCount)) {
            return false;
        }
        return true;
    }

    void setCount(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
