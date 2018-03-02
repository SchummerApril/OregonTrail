package byui.cit260.oregonTrail.model;

import java.io.Serializable;
/**
 *      Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
import java.io.Serializable;

public class Location implements Serializable {
    private String visitText;
    private Stop stop;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public Location(String name, Stop stop) {
        this.name = name;
        this.stop = stop;
    }

    public String getVisitText() {
        return visitText;
    }

    public void setVisitText(String visitText) {
        this.visitText = visitText;
    }
    
    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }
    
   /* public void visit() {
        System.out.println("Visiting Location");
        System.out.println(visitText);
        this.stop.visit();
    }*/

    @Override
    public String toString() {
        return "Location{" + "visitText=" + visitText + ", stop=" + stop + ", name=" + name + '}';
    }
}