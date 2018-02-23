package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *
 * @author Marci
 */
public class HelpMenuView {

    static void displayHelpMenuView() {
        Output.println(" G - What is the goal of the game? Answer: we don't know either. \n M - How to move \n E - Estimate the number of resources \n H - Harvest resources \n D - Get item information \n Q - Quit");
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
                case 'G': 
                    Output.println("What is the goal of the game");
                    break;
                case 'M':
                    Output.println("How to move");
                    break;
                case 'E':
                    Output.println("Estimate the number of resources");
                    break;
                case 'H':
                    Output.println("Harvest resources");
                    break;
                case 'D':
                    Output.println("Get item information");
                    break;
                case 'Q':
                    return true;   
                default: Output.println("Invalid menu item");    
            }
            return false;
    
    }
    
    public HelpMenuView() {
    }
    
}
