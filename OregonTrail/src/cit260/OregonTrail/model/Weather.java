package cit260.OregonTrail.model;
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
