package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author Marci, aschummer, Nastia
 */
import java.io.Serializable;

public class ScenicStop extends Stop implements Serializable {
    @Override public void visit() {
        System.out.println("ScenicStop");
    }    
}