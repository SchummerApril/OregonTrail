package byui.cit260.oregonTrail.model;

import java.io.Serializable;
/**
 *          Main Author, Classmate, Classmate
 * @author Nastia, Marci, aschummer
 */
public class Weather extends Condition {
    @Override
    public void execute() {
    System.out.println("Weather condition");
    }

    public Weather() {
    }
    
}