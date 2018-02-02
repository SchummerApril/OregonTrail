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
public class BuffaloStampede implements Serializable{
    private boolean complete; 

    public BuffaloStampede() {
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.complete ? 1 : 0);
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
        final BuffaloStampede other = (BuffaloStampede) obj;
        if (this.complete != other.complete) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuffaloStampede{" + "complete=" + complete + '}';
    }
    
    
}
