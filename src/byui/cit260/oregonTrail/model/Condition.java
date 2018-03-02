package byui.cit260.oregonTrail.model;

import java.io.Serializable;

/**
 *      Main Author, Classmate, Classmate
 * @author Nastia, aschummer, Marci
 */
public class Condition implements Serializable{
    
    private String message;
    private int quanity;
    private InventoryItemType type;
    private boolean complete; 

    public Condition(String message, int quanity, InventoryItemType type) {
        this.message = message;
        this.quanity = quanity;
        this.type = type;
        this.complete = false;
        
    }

    
    //getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public InventoryItemType getType() {
        return type;
    }

    public void setType(InventoryItemType type) {
        this.type = type;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    
    public Condition() {
        
    }

    @Override
    public String toString() {
        return "Condition{" + "message=" + message + ", quanity=" + quanity + ", type=" + type + ", complete=" + complete + '}';
    }
    
    
}