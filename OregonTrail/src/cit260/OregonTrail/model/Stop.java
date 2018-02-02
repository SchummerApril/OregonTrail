package cit260.OregonTrail.model;
import java.io.Serializable;
import java.util.Objects;
/**
 * 
 * @author Nastia
 */
public class Stop implements Serializable{
    private final Condition condition;
    private boolean canRest;

    public boolean isCanRest() {
        return canRest;
    }

    public void setCanRest(boolean canRest) {
        this.canRest = canRest;
    }
    
    Stop(Condition condition) {
        this.condition = condition;
    }
    
    public void visit() {
        this.condition.execute();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.condition);
        hash = 11 * hash + (this.canRest ? 1 : 0);
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
        if (this.canRest != other.canRest) {
            return false;
        }
        if (!Objects.equals(this.condition, other.condition)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stop{" + "condition=" + condition + ", canRest=" + canRest + '}';
    }
    
    
}
