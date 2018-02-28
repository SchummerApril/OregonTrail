package byui.cit260.oregonTrail.model;
/**
 * 
 * @author Nastia
 * 
 */

    public enum InventoryItemType {
    //below are all the items we have across inventories (for actor, for player, for shop)
        
    bullets(2), 
    clothingSet(5), 
    ox (40), 
    firewood(1), 
    berries(5), 
    foodPounds(1), 
    wagonWheel(10), 
    wagonAxle(8), 
    wagonTongue(7); 
     
    public final int itemCost; 

    private InventoryItemType(int itemCost) {
        this.itemCost = itemCost;
    }
 }

