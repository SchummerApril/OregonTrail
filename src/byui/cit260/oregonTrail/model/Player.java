package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;


/**
 *I am testing 
 *          //Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
public class Player implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Inventory inventory;
    private String playerCharacter; //profession
    private String familyMembers;
    private int bestTime;
    private int amountofMoney;
    private ArrayList<Game> games = new ArrayList<Game>();

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public int getAmountofMoney() {
        return amountofMoney;
    }

    public void setAmountofMoney(int amountofMoney) {
        this.amountofMoney = amountofMoney;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
   

    public String getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(String playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public String getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(String familyMembers) {
        this.familyMembers = familyMembers;
    }

    public int getBestTime() {
        return bestTime;
    }

    public void setBestTime(int bestTime) {
        this.bestTime = bestTime;
    }

    public Player() {
    }
    
    public Player(String name) {
        this.name = name;
}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.inventory);
        hash = 29 * hash + Objects.hashCode(this.playerCharacter);
        hash = 29 * hash + Objects.hashCode(this.familyMembers);
        hash = 29 * hash + this.bestTime;
        hash = 29 * hash + this.amountofMoney;
        hash = 29 * hash + Objects.hashCode(this.games);
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
        final Player other = (Player) obj;
        if (this.bestTime != other.bestTime) {
            return false;
        }
        if (this.amountofMoney != other.amountofMoney) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.playerCharacter, other.playerCharacter)) {
            return false;
        }
        if (!Objects.equals(this.familyMembers, other.familyMembers)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        return true;
        
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", inventory=" + inventory + ", playerCharacter=" + playerCharacter + ", familyMembers=" + familyMembers + ", bestTime=" + bestTime + ", amountofMoney=" + amountofMoney + ", games=" + games + '}';
    }
    
    
}
