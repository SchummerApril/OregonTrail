package byui.cit260.oregonTrail.control;

/**
 *
 * @author Nastia
 */
public class InventoryControl {
    
    int accountInfo; 
    
    public float addToInventory(contents, int num, int itemCost){
        if (itemCost < 0) {
            return -1;
        }
        if(num > 10) {
            return -1;
        }
        
        int totalCost = num * itemCost;
        return totalCost;
        
        if (totalCost < accountInfo){
            playerInventory.addToInventory();
            accountInfo - totalCost;
        }
        if (totalCost > accountInfo) {
            System.out.println("Insufficient funds. Please try again.")
            return -1;
        }

    }
}
