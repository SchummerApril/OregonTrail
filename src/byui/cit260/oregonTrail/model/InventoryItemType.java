package byui.cit260.oregonTrail.model;
/**
 * @author Nastia
 * contains the list of all items we have in the game
 */

    public enum InventoryItemType {
     
     bullets(2), clothing(5), ox (40), firewood(1), berries(5); // <-- all the items our inventory has
     
     private int itemCost; 
     private Item[] contents;

    private InventoryItemType(int itemCost) {
        this.itemCost = itemCost;
    }

    public double getItemCost() {
        return itemCost;
    }
     
 }

