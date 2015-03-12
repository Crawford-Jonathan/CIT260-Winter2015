/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

import byui.cit260.ww2Zombies.model.Map;

/**
 *
 * @author Jonathan
 */
public class MapControl {
    
    public static Map createMap() throws MapControlException {
        System.out.println(" called createMap() ");
        return null;
    }
    
    public static void movedActorsToStartingLocation(Map map) {
        System.out.println(" called moveActorsToStartingLocation() ");
    }

    private static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
}
