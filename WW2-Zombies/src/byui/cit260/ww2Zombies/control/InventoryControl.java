/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

/**
 *
 * @author SilentMan and Jonathan Crawford
 */
public class InventoryControl {
    
    public double upgradeCarrySpace(double height, double width, double depth) {
        
         //check for invalid values
    if (height <= 0) {
        return -1;
        }
    
    if (width <= 0) {
        return -1;
        }
    
    if (depth <= 0) {
        return -1;
        }

    if (height > 36) {
        return -1;
        }
    
    if (width > 24) {
        return -1;
        }

    if (depth > 12) {
        return -1;
        }
    
    //actual mathy part
    double volume = height * width * depth;

    return volume;
    }
        public double calcBlast(double power, double diameter, double heat){
        if (power < 20 || power > 60){
            return -1;
        }
        if (diameter < 20 || diameter > 60){
            return -1;
        }
        if (heat < 20 || heat > 60){
            return -1;
        }
        double blast = power * diameter *heat;
            return blast;
    } 
}
