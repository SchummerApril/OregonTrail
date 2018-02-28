package byui.cit260.oregonTrail.model;

import java.io.Serializable;
/**
 *         
 * @author Nastia
 */
public class BearAttack implements Serializable{
    private boolean complete; 

    public BearAttack() {
    }
    

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.complete ? 1 : 0);
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
        final BearAttack other = (BearAttack) obj;
        if (this.complete != other.complete) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BearAttack{" + "complete=" + complete + '}';
    }
    
    
}