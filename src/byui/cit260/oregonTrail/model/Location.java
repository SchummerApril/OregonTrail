package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author aschummer
 */
public class Location implements Serializable{
    private String name;
    private String description;
    private boolean stop;
    private int row;
    private int column;
    private int milesRemaining;
    private Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getMilesRemaining() {
        return milesRemaining;
    }

    public void setMilesRemaining(int milesRemaining) {
        this.milesRemaining = milesRemaining;
    }

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", description=" + description + ", stop=" + stop + ", row=" + row + ", column=" + column + ", milesRemaining=" + milesRemaining + ", point=" + point + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (this.stop ? 1 : 0);
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + this.milesRemaining;
        hash = 97 * hash + Objects.hashCode(this.point);
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
        final Location other = (Location) obj;
        if (this.stop != other.stop) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.milesRemaining != other.milesRemaining) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.point, other.point)) {
            return false;
        }
        return true;
    }
}