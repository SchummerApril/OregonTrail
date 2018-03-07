package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author aschummer, Nastia, Marci
 */
public class Wagon implements Serializable{
    private Container[] containers;
    private int maxNumberContainers;
   private int height;
   private int length;
   private int width;
   private int maxCarryWeight;
   private int weight;

    public Wagon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Container[] getContainers() {
        return containers;
    }

    public void setContainers(Container[] containers) {
        this.containers = containers;
    }



    public int getMaxNumberContainers() {
        return maxNumberContainers;
    }

    public void setMaxNumberContainers(int maxNumberContainers) {
        this.maxNumberContainers = maxNumberContainers;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public void setMaxCarryWeight(int maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    

    public Wagon(int maxNumberContainers) {
        this.containers = new Container[maxNumberContainers];
        this.maxNumberContainers = maxNumberContainers;
        
    }

    @Override
    public String toString() {
        return "Wagon{" + "containers=" + containers + ", maxNumberContainers=" + maxNumberContainers + ", height=" + height + ", length=" + length + ", width=" + width + ", maxCarryWeight=" + maxCarryWeight + ", weight=" + weight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Arrays.deepHashCode(this.containers);
        hash = 71 * hash + this.maxNumberContainers;
        hash = 71 * hash + this.height;
        hash = 71 * hash + this.length;
        hash = 71 * hash + this.width;
        hash = 71 * hash + this.maxCarryWeight;
        hash = 71 * hash + this.weight;
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
        if (this.maxCarryWeight != other.maxCarryWeight) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (!Arrays.deepEquals(this.containers, other.containers)) {
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