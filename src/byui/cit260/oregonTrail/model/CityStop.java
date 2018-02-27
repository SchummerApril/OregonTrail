package byui.cit260.oregonTrail.model;

//import Serializable
import java.io.Serializable;
import java.util.Objects;

/**
 *      Main Author, Classmate, Classmate
 * @author Marci, aschummer, Nastia
 */
//Implement Serializable in order for import to work
public class CityStop implements Serializable {
    
    //Class Instance Variables
    private String excute;
    private int trade;
    private int amountAvailable;
    
    //class attribute variable
    private Stop stop;
    
    //Constructor
    public CityStop() {
    }
    
    //Getters and Setters for class attribute
    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }
    
    
    //Getters and Setters
    public String getExcute() {
        return excute;
    }

    public void setExcute(String excute) {
        this.excute = excute;
    }

    public int getTrade() {
        return trade;
    }

    public void setTrade(int trade) {
        this.trade = trade;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }
    
     // hashCode, equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.excute);
        hash = 29 * hash + this.trade;
        hash = 29 * hash + this.amountAvailable;
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
        final CityStop other = (CityStop) obj;
        if (this.trade != other.trade) {
            return false;
        }
        if (this.amountAvailable != other.amountAvailable) {
            return false;
        }
        if (!Objects.equals(this.excute, other.excute)) {
            return false;
        }
        return true;
    }
    //toString
    @Override
    public String toString() {
        return "CityStop{" + "excute=" + excute + ", trade=" + trade + ", amountAvailable=" + amountAvailable + '}';
    }
    
    
    
} //closing tag