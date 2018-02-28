package byui.cit260.oregonTrail.model;

//import Serializable
import java.io.Serializable;
import java.util.Objects;

/**
 *          Main Author, Classmate, Classmate
 * @author Marci, Nastia, aschummer
 */

//Implement Serializable in order for import to work
public abstract class Stop implements Serializable {
    
    //Class Instance Variables
    private Condition condition;
    private boolean canRest;
    private int travelTime;

   // public abstract void visit();

        
    public Stop() {
    }
    
    //Constructor
    public Condition getCondition() {
        
        return condition;
    }
    
    //Getters and Setters
    public void setCondition(Condition condition) {
        
        this.condition = condition;
    }

    public boolean getCanRest() {
        return canRest;
    }

    public void setCanRest(boolean canRest) {
        this.canRest = canRest;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
    
    // hashCode, equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.condition);
        hash = 23 * hash + Objects.hashCode(this.canRest);
        hash = 23 * hash + this.travelTime;
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
        final Stop other = (Stop) obj;
        if (this.travelTime != other.travelTime) {
            return false;
        }
        if (!Objects.equals(this.condition, other.condition)) {
            return false;
        }
        return Objects.equals(this.canRest, other.canRest);
       
    }
    //toString
    @Override
    public String toString() {
        return "Stop{" + "condition=" + condition + ", canRest=" + canRest + ", travelTime=" + travelTime + '}';
    }
    
            
}//closing tag
