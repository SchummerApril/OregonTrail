/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.OregonTrail.model;

import java.io.Serializable;
/**
 *
 * @author Nastia
 */
public class Stop implements Serializable{
    private int condition;
    private boolean canRest;

    public Stop() {
    }
    
    

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public boolean isCanRest() {
        return canRest;
    }

    public void setCanRest(boolean canRest) {
        this.canRest = canRest;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.condition;
        hash = 19 * hash + (this.canRest ? 1 : 0);
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
        if (this.condition != other.condition) {
            return false;
        }
        if (this.canRest != other.canRest) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stop{" + "condition=" + condition + ", canRest=" + canRest + '}';
    }
     
    
}
