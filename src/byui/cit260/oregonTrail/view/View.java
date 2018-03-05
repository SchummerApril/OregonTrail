package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *
 * @author Nastia
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean endOfView = false;
        do {
            //OUR VERSION FROM HELPMENUVIEW
            /*String[] inputs = getInputs();
            if (inputs.length < 1 || inputs[0] ==null)
            return;
         
        endOfView = doAction(inputs);
        }
        while (endOfView != true);*/
            
            //INSTRUCTIONS VERSION
            String value = this.getInput(); 
            if (value.toUpperCase().equals("E"))
                return;
            
            endOfView = this.doAction(value);          
    }
        while (!endOfView);
}   
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            Output.println("\n" + this.displayMessage);
            
            try {
            Input.getString("Please select one of the following options: ");
            } catch (IOException ex) {}
            break;
            }
        return value;
        }
        
    }

