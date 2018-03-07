package byui.cit260.oregonTrail.view;
import byui.cit260.oregonTrail.control.ContainerControl;
import byui.cit260.oregonTrail.model.Container;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author aschummer
 */
public class ContainerWeightView extends View{
    public ContainerWeightView(){       
       
            super("\n"
                    + "**************************************\n"
                    + "D - Display Containers\n"
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
                displayContainers();
                break;
            case 'E':                    
                return true; 
            default: Output.println("Invalid menu item");    
        }
     
        return false;
     }
    public void displayContainers(){
        int max = OregonTrail.getCurrentGame().getWagon().getMaxNumberContainers(); 
        for(int i = 0; i < max; i++){
        Container current = OregonTrail.getCurrentGame().getWagon().getContainers()[i];
        Output.println("#" + i + ":" + ContainerControl.calculateTotalWeight(current));
    }
    
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
