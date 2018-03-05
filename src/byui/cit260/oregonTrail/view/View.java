package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *
 * @author Nastia
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected String prompt = "Please select one of the following options: ";
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean endOfView = false;
        do {
            String value = this.getInput(); 
            if (value == null || value.length() < 1 )
                return;
            endOfView = this.doAction(value);          
    }
        while (!endOfView);
}   
    @Override
    public String getInput() {
        
        /*boolean valid = false;*/
        String value = null;
        Output.println("\n" + this.displayMessage);
            try {
            value = Input.getString(this.prompt);
            } catch (IOException ex) {} 
        return value;
        }
        
    }

