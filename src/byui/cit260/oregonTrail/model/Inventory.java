package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Nastia
 */

public class Inventory implements Serializable{
    private ArrayList<Item> contents; //maybe change this to array not ArrayList
    private int quantityInStock; //TODO move to Item class
    private int requiredAmount; //TODO move to Item class

    public Inventory() {
    }

    public ArrayList<Item> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Item> contents) {
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
    
    public void addItem(Item itemToAdd){
        this.contents.add(itemToAdd); // this stays here :)
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
        return "Inventory{" + "items=" + contents + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
      
    
}