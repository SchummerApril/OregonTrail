package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author aschummer
 */
public class Wagon implements Serializable{
    private String containers;
    private int maxNumberContainers;
   private int height;
   private int length;
   private int width;
   

    public String getContianers() {
        return containers;
    }

    public void setContainers(String containers) {
        this.containers = containers;
    }

    public int getMaxNumberContainers() {
        return maxNumberContainers;
    }

    public void setMaxNumberContainers(int maxNumberContainers) {
        this.maxNumberContainers = maxNumberContainers;
    }

    

    public Wagon(String containers, int maxNumberContainers) {
        this.containers = containers;
        this.maxNumberContainers = maxNumberContainers;
        
    }

    @Override
    public String toString() {
        return "Wagon{" + "containers=" + containers + ", maxNumberContainers=" + maxNumberContainers + ", height=" + height + ", length=" + length + ", width=" + width + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.containers);
        hash = 79 * hash + this.maxNumberContainers;
        hash = 79 * hash + this.height;
        hash = 79 * hash + this.length;
        hash = 79 * hash + this.width;
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
        final Wagon other = (Wagon) obj;
        if (this.maxNumberContainers != other.maxNumberContainers) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (!Objects.equals(this.containers, other.containers)) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}