package byui.cit260.oregonTrail.model;

import java.util.HashMap;
import java.io.Serializable;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
public class Map implements Serializable{
    private HashMap<Point, Location> contents = new HashMap<Point,Location>(); //List that maps(connects) points to location
    
    private String location;
    private int rowCount; //Check for another way of doing this....LATER
    private int columnCount;
    
    Point playerLocation;

    public HashMap<Point, Location> getContents() {
        return contents;
    }

    public void setContents(HashMap<Point, Location> contents) {
        this.contents = contents;
    }

    
    public Point getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Point playerLocation) {
        this.playerLocation = playerLocation;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.location);
        hash = 71 * hash + this.rowCount;
        hash = 71 * hash + this.columnCount;
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
 
    
    
}