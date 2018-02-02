package cit260.OregonTrail.model;
import java.io.Serializable;
import java.util.Objects;

/*
 *
 * @author Nastia
 */

    public enum Actor {
        
        Wesley(new Inventory(), "Wesley", "He is the first person you meet"),
        Spencer(new Inventory(), "Spencer", "He is the second person you meet"),
        Karl(new Inventory(), "Karl", "He is the thirst person you meet");
        
        private Inventory shopInventory;
        private String name;
        private String description;
      
    
        Actor(Inventory inventory, String name, String description){
            this.shopInventory = inventory;
            this.name = name;
            this.description = description;           
}

    public Inventory getInventory() {
        return shopInventory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Actor{" + "shopInventory=" + shopInventory + ", name=" + name + ", description=" + description + '}';
    }
        
    }
    
    
