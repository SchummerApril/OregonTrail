package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *      Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
public class Location implements Serializable{
        private ArrayList<Item> contents;
        
        public ArrayList<Item> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Item> contents) {
        this.contents = contents;
    }
    
}