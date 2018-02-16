package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *          Main Author, Classmate, Classmate
 * @author Marci, aschummer, Nastia
 */
public ScenicStop extends Stop {
    private String aboutStop;
    
    public ScenicStop(String about){
        this.aboutStop = about;
    }

    public String getAboutStop() {
        return aboutStop;
    }
  
    public void setAboutStop(Sting aboutStop) {
        this.aboutStop = aboutStop;
    }
   
    @override
    public void visit() {
        //ignore condition
        System.out.pringln()this.aboutStop);
    }
    
 
}//closing tag