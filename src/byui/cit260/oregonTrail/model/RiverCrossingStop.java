package byui.cit260.oregonTrail.model;

//import Serializable
import java.io.Serializable;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author Marci, Nastia, aschummer
 */

public class RiverCrossingStop  extends Stop implements Serializable {

    //Class Instance Variables
    private int depth;
    private int ferryCost;
    private int amountAvailable; //should this be a string
    
    
    //Constructor
    public RiverCrossingStop() {
        this.depth = 10;
        this.ferryCost = 100;
    }   
    
    //Getters & Setters
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getFerryCost() {
        return ferryCost;
    }

    public void setFerryCost(int ferryCost) {
        this.ferryCost = ferryCost;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }
    
    //hasCode & Equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.depth;
        hash = 59 * hash + this.ferryCost;
        hash = 59 * hash + Objects.hashCode(this.amountAvailable);
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
        final RiverCrossingStop other = (RiverCrossingStop) obj;
        if (this.depth != other.depth) {
            return false;
        }
        if (this.ferryCost != other.ferryCost) {
            return false;
        }
        return Objects.equals(this.amountAvailable, other.amountAvailable);
    }
    
    //toString

    @Override
    public String toString() {
        return "RiverCrossingStop{" + "depth=" + depth + ", ferryCost=" + ferryCost + ", amountAvailable=" + amountAvailable + '}';
    }

    @Override
    public void visit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}//closing tag
