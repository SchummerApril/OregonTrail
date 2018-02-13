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
    private int sizeOfWagon;

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

    public int getSizeOfWagon() {
        return sizeOfWagon;
    }

    public void setSizeOfWagon(int sizeOfWagon) {
        this.sizeOfWagon = sizeOfWagon;
    }

    public Wagon(String containers, int maxNumberContainers, int sizeOfWagon) {
        this.containers = containers;
        this.maxNumberContainers = maxNumberContainers;
        this.sizeOfWagon = sizeOfWagon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.containers);
        hash = 97 * hash + this.maxNumberContainers;
        hash = 97 * hash + this.sizeOfWagon;
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
        if (this.sizeOfWagon != other.sizeOfWagon) {
            return false;
        }
        if (!Objects.equals(this.containers, other.containers)) {
            return false;
        }
        return true;
    }
    
    
}
