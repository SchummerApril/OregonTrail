package byui.cit260.oregonTrail.model;

import java.io.Serializable;
/**
 *      Main Author, Classmate, Classmate
 * @author Nastia, aschummer, Marci
 */
public class BuffaloStampede extends Condition implements Serializable{
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