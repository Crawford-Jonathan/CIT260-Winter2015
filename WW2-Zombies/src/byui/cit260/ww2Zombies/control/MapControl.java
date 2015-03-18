/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

import byui.cit260.ww2Zombies.model.Locations;
import byui.cit260.ww2Zombies.model.Map;
//import byui.cit260.ww2Zombies.model.Locations;

/**
 *
 * @author Jonathan
 */
public class MapControl {
    
    public static Map createMap() {
        //System.out.println(" called createMap from mapControl ");
        //return null;
        
        Map map = new Map(5,5);
        
        Locations[] locations = createLocations();
        
        GameControl.assignLocationsToMap(map, locations);
        
        return map;
    }
    
    
    public static void moveActorsToStartingLocation(Map map) {
        System.out.println(" called moveActorsToStartingLocation from mapControl ");
    }

    private static Locations[] createLocations() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
