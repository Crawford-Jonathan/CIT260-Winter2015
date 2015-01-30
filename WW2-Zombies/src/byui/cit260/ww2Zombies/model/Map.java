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
public class Map  implements Serializable{
    
    //class instance variables
    double rowCount;
    double columnCount;
    double areaDiscovered;

    //constructor
    public Map() {
    }
    
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
