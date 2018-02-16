package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *      Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
public class Location implements Serializable{
     private String visitText;

    public String getVisitText() {
        return visitText;
    }

    public void setVisitText(String visitText) {
        this.visitText = visitText;
    }
    
    public void visit() {
        System.out.println(visitText);
    }
    
}