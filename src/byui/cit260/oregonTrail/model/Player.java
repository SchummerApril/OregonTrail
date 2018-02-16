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
    private String inventory;
    private String playerCharacter;
    private String familyMembers;
    private int bestTime;
    private ArrayList<Game> games = new ArrayList<Game>();

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    
    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.inventory);
        hash = 67 * hash + Objects.hashCode(this.playerCharacter);
        hash = 67 * hash + Objects.hashCode(this.familyMembers);
        hash = 67 * hash + this.bestTime;
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
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.playerCharacter, other.playerCharacter)) {
            return false;
        }
        if (!Objects.equals(this.familyMembers, other.familyMembers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "inventory=" + inventory + ", playerCharacter=" + playerCharacter + ", familyMembers=" + familyMembers + ", bestTime=" + bestTime + '}';
    }
    
    
}