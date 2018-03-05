package byui.cit260.oregonTrail.view;
import byui.cit260.oregonTrail.control.ContainerControl;
import java.io.IOException;

/**
 *
 * @author aschummer
 */
public class ContainerVolumeView extends View{
    public ContainerVolumeView(){       
       
            super("\n"
                    + "**************************************\n"
                    + "D - Enter the dimensions\n"
                    + "E - Exit\n"
                    + "**************************************\n");  
    }
    
    @Override
    public boolean doAction(String inputs) {
            //convert array of strings into a single character
            //convert all characters to upper case
        char choice = Character.toUpperCase(inputs.charAt(0));
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
