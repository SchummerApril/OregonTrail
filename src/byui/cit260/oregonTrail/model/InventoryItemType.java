package byui.cit260.oregonTrail.model;
/**
 * @author Nastia
 * 
 */

    public enum InventoryItemType {
     
    //built in cost and weight
    bullets(2, 1), 
    clothing(5, 2), 
    ox (40, 100), 
    firewood(1, 5), 
    berries(5, 1), 
    food(1, 10), 
    wagonWheel(10, 20), 
    wagonAxle(8, 2), 
    wagonTongue(7, 2); 
// <-- all the items our inventory has its weight if the wagon to carry AS.
// <--we can add more items and now they connect to item cost and weight AS.     
    public final int itemCost; 
    public final int weight;


    private InventoryItemType(int itemCost, int weight) {
        this.itemCost = itemCost;
        this.weight = weight;
    }
 }

