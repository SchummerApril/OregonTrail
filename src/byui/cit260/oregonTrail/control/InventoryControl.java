package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Item;
import byui.cit260.oregonTrail.model.Player;

/**
 *      
 * @author Nastia
 */
public abstract class InventoryControl {
    
    //Player currentPlayer - represents an instance of the Player class
    public static void addToInventory(Item[] contents, InventoryItemType type, int num){
        contents[type.ordinal()].setQuantity(num);
    }
}
 
    

