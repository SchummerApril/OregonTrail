/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

//import Serializable
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Marci
 */
public class Condition implements Serializable {
    
    //Class Instance Variables
    private String excute;

    //Constructor
    public Condition() {
    }

    
    //Getters & Setters
    public String getExcute() {
        return excute;
    }

    public void setExcute(String excute) {
        this.excute = excute;
    }
    
    
    //equals & Hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.excute);
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
        final Condition other = (Condition) obj;
        if (!Objects.equals(this.excute, other.excute)) {
            return false;
        }
        return true;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Condition{" + "excute=" + excute + '}';
    }
    
    
}//closing tag
