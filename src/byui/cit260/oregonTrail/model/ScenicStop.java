package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author Marci, aschummer, Nastia
 */
public class ScenicStop extends Stop implements Serializable{
    private String aboutStop;
    
    //we have a condition each one has a different one, none or one
    
    public ScenicStop(String about){
        this.aboutStop = about;
    }

    public String getAboutStop() {
        return aboutStop;
    }
  
    public void setAboutStop(String aboutStop) {
        this.aboutStop = aboutStop;
    }
   
  /*  @Override
    public void visit() {
        //ignore condition
        System.out.println(this.aboutStop);
    }*/
    
 
}//closing tag