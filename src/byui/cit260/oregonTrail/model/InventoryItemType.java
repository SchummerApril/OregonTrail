package byui.cit260.oregonTrail.model;
/**
 * //defines all the items i have in my game
 * @author Nastia
 * contains the list of all items we have in the game
 */

    public enum InventoryItemType {
     
    bullets(2), clothing(5), ox (40), firewood(1), berries(5), food(1), wagonWheel(10), wagonAxle(8), wagonTongue(7); // <-- all the items our inventory has
     
    public final int itemCost; 

    private InventoryItemType(int itemCost) {
        this.itemCost = itemCost;
    }

   
     
 }

