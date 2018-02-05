package byui.cit260.oregonTrail.model;

import java.io.Serializable;
/**
 *
 * @author Nastia
 */
public class Weather extends Condition {
    @Override
    public void execute() {
    System.out.println("Weather condition");
    }

    public Weather() {
    }
    
}