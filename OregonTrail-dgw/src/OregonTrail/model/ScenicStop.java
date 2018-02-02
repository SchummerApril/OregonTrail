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
public class ScenicStop implements Serializable {
    
     //Class Instance Variables
    private String aboutStop;
    private String nameOfStop;
    
    //Constructor

    public ScenicStop() {
    }   
    
    
    //Getter & Setter
    public String getAboutStop() {
        return aboutStop;
    }

    public void setAboutStop(String aboutStop) {
        this.aboutStop = aboutStop;
    }

    public String getNameOfStop() {
        return nameOfStop;
    }

    public void setNameOfStop(String nameOfStop) {
        this.nameOfStop = nameOfStop;
    }
    
    
    //equals & Hascode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.aboutStop);
        hash = 67 * hash + Objects.hashCode(this.nameOfStop);
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
        final ScenicStop other = (ScenicStop) obj;
        if (!Objects.equals(this.aboutStop, other.aboutStop)) {
            return false;
        }
        if (!Objects.equals(this.nameOfStop, other.nameOfStop)) {
            return false;
        }
        return true;
    }
    
         
    //toString
    @Override
    public String toString() {
        return "ScenicStop{" + "aboutStop=" + aboutStop + ", nameOfStop=" + nameOfStop + '}';
    }
    
    
}//closing tag
