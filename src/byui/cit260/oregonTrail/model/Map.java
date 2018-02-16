package byui.cit260.oregonTrail.model;

import java.util.HashMap;
import java.io.Serializable;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
public class Map implements Serializable{
    private HashMap<Point, Location> map = new HashMap<Point,Location>(); //List that maps(connects) points to location
    private Point playerLocation;
    
    private String location; //change this LATER...we may not need it.
    
    //tells us which point the player is
   public void setPlayerLocation(Point p) {
        this.playerLocation = new Point(p.getX(), p.getY());
    }

   //finds the player for the player
   public Point getPlayerLocation() {
        return playerLocation;
    }
   
   //adds the locations and point together to be placed on the map, instead of column and row
   public void addLocation(Location l, Point p) {
        this.map.put(p, l);
    }
   //
    public HashMap<Point, Location> getContents() {
        return this.map;
    }

    //
    public void setMap(HashMap<Point, Location> map) {
        this.map = map;
    }
    
    //see row 14 - may not need it
    public String getLocation() {
        return location;
    }
    //see row 14 - may not need it
    public void setLocation(String location) {
        this.location = location;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.map);
        hash = 79 * hash + Objects.hashCode(this.playerLocation);
        hash = 79 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "Map{" + "map=" + map + ", playerLocation=" + playerLocation + ", location=" + location + '}';
    }
    
    
}//closing