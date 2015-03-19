/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;
import byui.cit260.ww2Zombies.exceptions.MapControlException;
import byui.cit260.ww2Zombies.model.Actors;
import byui.cit260.ww2Zombies.model.Locations;
import byui.cit260.ww2Zombies.model.Map;
import java.awt.Point;
import ww2.zombies.main.WW2Zombies;
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
    //lesson 10 exception handling
    public static void moveActorToLocation(Actors actor, Point coordinates) 
                        throws MapControlException {
        Map map = WW2Zombies.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;
        
        if (newRow < 0 || newRow >= map.getRowCount() || 
            newColumn < 0 || newColumn >= map.getColumnCount()) {
            //return -1;
            throw new MapControlException("Can now move actor to location " + coordinates.x + ", "
                                           + coordinates.y + " because that location is beyond "
                                            + "the borders of the map");
        }
        
        //return 0;
    }
    
    
    public static void moveActorsToStartingLocation(Map map) throws MapControlException {
        //System.out.println(" called moveActorsToStartingLocation from mapControl ");
        Actors[] actors = Actors.values();
        
        for (Actors actor : actors) {
            Point coordinates = actor.getCoordinates();
            //int returnValue = MapControl.moveActorToLocation(actor, coordinates);
            MapControl.moveActorToLocation(actor, coordinates);
            
            /**if (returnValue < 0) {
                return returnValue;
            }
        }
        return 0;
        */
        }
    }

    private static Locations[] createLocations() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
