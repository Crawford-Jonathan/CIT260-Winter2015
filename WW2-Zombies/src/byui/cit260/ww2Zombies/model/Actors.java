/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jonathan
 */
public enum Actors implements Serializable {

    FireTeamLeader("leading the team to victory!"),
    Rifleman("extra firepower is always welcome"),
    autoRifleman("bullet hose"),
    Grendier("making things go BOOM since 1943");

    private final String description;
    private final Point coordinates;
    
    Actors(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
  
}
