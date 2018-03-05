package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Inventory;
import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Item;
import byui.cit260.oregonTrail.model.Player;

/**
 *      
 * @author Nastia
 */
public abstract class InventoryControl {
    
    //Player currentPlayer - represents an instance of the Player class
    //changed the add to and subtract from inventory so it keeps track of number and weight of inventory AS.
    public static void addToInventory(Item[] contents, InventoryItemType type, int num){
        Item target = contents[type.ordinal()];
        target.setQuantity(target.getQuantity() + num ); 
    }
    public static void removeFromInventory(Item[] contents, InventoryItemType type, int num){
        Item target = contents[type.ordinal()];
        int newQuantity = target.getQuantity() - num;
        if(newQuantity < 0) {
            newQuantity = 0;
        }
        target.setQuantity(newQuantity);
    }
    //this calc the weight and quantity of inventory and sets a boundary for hasAtLeast (4 wagon wheels)AS
   public static int calculateTotalWeight(Inventory inventory){
        int result = 0;
            for(Item current: inventory.getContents()){
            
            result+= current.getWeight() * current.getQuantity();            }
             
        return result;
   }
   //this now connects to the wagonControl and is able to calc weight of contents and wagon AS
    public static boolean hasAtLeast(Inventory inventory, InventoryItemType type, int num){
        return inventory.getContents()[type.ordinal()].getQuantity()
 >= num;    
    }
}
 
    

