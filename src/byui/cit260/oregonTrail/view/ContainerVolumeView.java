package byui.cit260.oregonTrail.view;
import byui.cit260.oregonTrail.control.ContainerControl;
import java.io.IOException;

/**
 *
 * @author aschummer
 */
public class ContainerVolumeView {
    static void display(){       
        Output.println(" D - enter the dimensions \n E - exit");
        boolean endOfView = false;
        
        do { 
        String[] inputs = getInputs();
        if (inputs.length < 1 || inputs[0] ==null)
            return;
         endOfView = doAction(inputs);
        }
       while (endOfView != true);
    
    }
    
    private static String[] getInputs() {
        //1 is the length of the array, holds one string
        String[] inputs = new String[1];
        //try/catch wraps the input to catch a possible error
        try {
            inputs[0] = Input.getString("Please select one of the following options: ");
        } catch (IOException ex) {}
        return inputs;
       }
    
     private static boolean doAction(String[] inputs) {
            //convert array of strings into a single character
            //convert all characters to upper case
            char choice = Character.toUpperCase(inputs[0].charAt(0));
            
            switch (choice) {
                case 'D': 
                    enterDimensions();
                    break;
                case 'E':                    
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
     }

    private static void enterDimensions() {
        try { double height = (double) Input.getInt("Enter height...");
        double diameter = (double) Input.getInt("Enter diameter...");
        double result = ContainerControl.calcVolumeOfContainer(height, diameter);
        Output.println("the result is " + result);
        }
        catch (IOException ex) {}
        
    }
     
}
