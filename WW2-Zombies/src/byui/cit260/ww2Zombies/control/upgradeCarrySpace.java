/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

/**
 *
 * @author SilentMan
 */
//public class upgradeCarrySpace {}
upgradeCarrySpace(height, width, depth) {
BEGIN
    
    //check for invalid values
    IF (height, width, depth <= 0) THEN
        RETURN -1

    IF (height >= 37) THEN
        RETURN -1
    
    IF (width >= 25) THEN
        RETURN -1

    IF (depth >= 13) THEN
        RETURN -1

    //actual mathy part
    volume = height * width * depth

    RETURN volume

END
}
    

