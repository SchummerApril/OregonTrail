package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nastia
 */
public class Shop implements Serializable{
     private Inventory shopInventory;

    public Shop() {
    }
     

    public Inventory getShopInventory() {
        return shopInventory;
    }

    public void setShopInventory(Inventory shopInventory) {
        this.shopInventory = shopInventory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.shopInventory);
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
        final Shop other = (Shop) obj;
        if (!Objects.equals(this.shopInventory, other.shopInventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shop{" + "shopInventory=" + shopInventory + '}';
    }
     
     
}