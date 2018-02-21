package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 * //main class for inventory in the game
 * @author Nastia
 */

public class Inventory implements Serializable{
    private int inventorySize = 9; 
    private Item[] contents; //
    private int quantityInStock; //TODO move to Item class
    private int requiredAmount; //TODO move to Item class

    public Inventory() {
        this.contents = new Item[this.inventorySize]; 
        // this needs to move to Control layer
        for (InventoryItemType type : InventoryItemType.values()){
            Item each = new Item(); 
            this.contents[type.ordinal()] = each;
        }
    }

    public Item[] getContents() {
        return contents;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    
    public void setContents(Item[] contents) {
        this.contents = contents;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    
    public void addItem(Item item, int index){
        this.contents[index] = item; // this stays here :)
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.contents);
        hash = 79 * hash + this.quantityInStock;
        hash = 79 * hash + this.requiredAmount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.contents, other.contents)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "contents=" + contents + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    
      
    
}
