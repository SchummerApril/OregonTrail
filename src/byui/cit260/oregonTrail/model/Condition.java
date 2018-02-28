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

    public Condition(String message, int quanity, InventoryItemType type) {
        this.message = message;
        this.quanity = quanity;
        this.type = type;
    }

    
    public Condition() {
        
    }
    
    
}