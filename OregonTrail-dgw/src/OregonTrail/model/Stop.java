/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

//import Serializable
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Marci
 */

//Implement Serializable in order for import to work
public class Stop implements Serializable {
    
    //Class Instance Variables
    private String condition;
    private String canRest;
    private int travelTime;

    //class attribute variable
        private ScenicStop scenicStop;
        private RiverCrossingStop rvierCrossingStop;
        private Condition conditions;
    
    
    public Stop() {
    }
    
    
    //Constructor
    public String getCondition() {
        return condition;
    }
    
    //Getters and Setters for Class Attributes

    public ScenicStop getScenicStop() {
        return scenicStop;
    }

    public void setScenicStop(ScenicStop scenicStop) {
        this.scenicStop = scenicStop;
    }

    public RiverCrossingStop getRvierCrossingStop() {
        return rvierCrossingStop;
    }

    public void setRvierCrossingStop(RiverCrossingStop rvierCrossingStop) {
        this.rvierCrossingStop = rvierCrossingStop;
    }

    public Condition getConditions() {
        return conditions;
    }

    public void setConditions(Condition conditions) {
        this.conditions = conditions;
    }
    
    
    //Getters and Setters
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCanRest() {
        return canRest;
    }

    public void setCanRest(String canRest) {
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
        if (!Objects.equals(this.canRest, other.canRest)) {
            return false;
        }
        return true;
       
    }
    //toString
    @Override
    public String toString() {
        return "Stop{" + "condition=" + condition + ", canRest=" + canRest + ", travelTime=" + travelTime + '}';
    }
    
            
}//closing tag
