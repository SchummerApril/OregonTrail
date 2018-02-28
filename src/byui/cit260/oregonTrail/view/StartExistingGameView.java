package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *     
 * @author Nastia
 */

class StartExistingGameView {
    static void displayStartExistingGameView(){
        
        Output.println(" B - Banker \n E - Explorer F - Fur Trader \n C - Carpenter \n Q - Quit");
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
                case 'B': 
                    Output.println("Congradulations! You are a Banker! Continue to name your travel buddies!");
                    break;
                case 'E':
                    Output.println("Congradulations! You are a Explorer! Continue to name your travel buddies!");
                    break;
                case 'F':
                    Output.println("Congradulations! You are a Fur Trader! Continue to name your travel buddies!");
                    break;
                case 'C':
                    Output.println("Congradulations! You are a Carpenter! Continue to name your travel buddies!");
                    break;
                case 'Q':
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
        }
        
    private static void NameFamilyView() {
      NameFamilyView.display();
    }
    
    
        
    }
