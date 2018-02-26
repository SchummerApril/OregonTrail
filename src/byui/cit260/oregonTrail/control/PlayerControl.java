package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Player;

/**
 *
 * @author Nastia
 */
public abstract class PlayerControl {
    public static Player createPlayer(String name){
        return new Player(name);
    }
    
    public static boolean canBuyItem(Player player, InventoryItemType type, int num) {
        int totalCost = num * type.itemCost;
            if(totalCost < 0){
                return false;
            }
            else if(num > 10) {
                return false;
            }
            //does the player have enough money?            
            if(player.getAmountofMoney() >= totalCost){
                return true;
            }   
        return false; 
        
    }
    
    public static void buyItem(Player player, InventoryItemType type, int num) {
        int totalCost = num * type.itemCost;
        player.setAmountofMoney(player.getAmountofMoney() - totalCost);
        InventoryControl.addToInventory(player.getInventory().getContents(), type, num);
    }
       
}
