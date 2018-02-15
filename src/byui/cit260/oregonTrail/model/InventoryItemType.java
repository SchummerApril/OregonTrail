package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nastia
 */

    public enum InventoryItemType {
     
     bullets(0.02), clothing(5), ox (40), firewood(1), berries(0.05); // <-- all the items our inventory has
     
     private double itemCost; 

    private InventoryItemType(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getItemCost() {
        return itemCost;
    }
     
 }

