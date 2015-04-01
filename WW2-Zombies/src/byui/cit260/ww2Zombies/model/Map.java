/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.model;

import byui.cit260.ww2Zombies.control.GameControl;
import javafx.scene.Scene;
import java.io.Serializable;

/**
 *
 * @author SilentMan
 */
public class Map  implements Serializable{

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //class instance variables
    private double rowCount;
    private double columnCount;
    private double areaDiscovered;
    private Location[][] locations;

    private static Map createMap() {
        //create map
        Map map = new Map(5,5);
        
        //create scenes
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    //constructor
    public Map() {
    }
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("0 rows/columns isn't a map");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        //create 2D array for Location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                //create new location
                Location location1 = new Location();
                //create a new location in each aray slot.
                
                //Assign location1 to Array grid 1,1
               
            }
        }
    }

    //public Map(int i, int i0) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    //getter and setter functions
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    public double getAreaDiscovered() {
        return areaDiscovered;
    }

    public void setAreaDiscovered(double areaDiscovered) {
        this.areaDiscovered = areaDiscovered;
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    //toString()
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", areaDiscovered=" + areaDiscovered + '}';
    }
    
    //equals() and hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.areaDiscovered) ^ (Double.doubleToLongBits(this.areaDiscovered) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.areaDiscovered) != Double.doubleToLongBits(other.areaDiscovered)) {
            return false;
        }
        return true;
    }
    
}
