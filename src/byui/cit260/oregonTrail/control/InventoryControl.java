package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Item;
import byui.cit260.oregonTrail.model.Player;

/**
 *      Main Author, Classmate, Classmate
 * @author Nastia, Marci, aschummer
 */
public abstract class InventoryControl {
    
    //Player currentPlayer - represents an instance of the Player class
    public static void addToInventory(Item[] contents, InventoryItemType type, int num){
        contents[type.ordinal()].setQuantity(num);
        /*if (itemCost < 0) {
            return -1;
        }
        if(num > 10) {
            return -1;
        }
        
        int totalCost = num * itemCost;
        return totalCost; */
        
        /*if (totalCost < currentPlayer.getAmountofMoney()){
            currentPlayer.getInventory().addItem(Item, index); //!!! add whatever the player bought to their inventory
            currentPlayer.setAmountofMoney(currentPlayer.getAmountofMoney() - totalCost); //modifies the amount of money the player has
        }
        if (totalCost > currentPlayer.getAmountofMoney()) {
            System.out.println("Insufficient funds. Please try again.");
            return -1;
        }*/
    }
}

    

