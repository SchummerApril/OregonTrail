/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author Marci
 */
public enum ScenicStop {
    
    location1("Name 1","Here are some interesting facts!"),
    location2("Name 2","Here are some interesting facts!"),
    location3("Name 3","Here are some interesting facts!"),
    location4("Name 4","Here are some interesting facts!"),
    location5("Name 5","Here are some interesting facts!"),
    location6("Name 6","Here are some interesting facts!");
    
     //Class Instance Variables
    private String nameOfStop;
    private String aboutStop;
    
        //might have to add location with Point
    
    ScenicStop(String nameOfStop, String aboutStop) {
    this.nameOfStop = nameOfStop;
    this.aboutStop = aboutStop;
    
}
    //Getters
    public String getAboutStop() {
        return aboutStop;
    }

    public String getNameOfStop() {
        return nameOfStop;
    }

    //toString
    @Override
    public String toString() {
        return "ScenicStop{" + "aboutStop=" + aboutStop + ", nameOfStop=" + nameOfStop + '}';
    }
    
    

}//closing tag
