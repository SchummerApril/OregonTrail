package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *   
 * @author Marci (week 7) and Nastia (week 8)
 */
public class HelpMenuView {

    static void displayHelpMenuView() {
        Output.println(" G - What is the goal of the game? \n M - How to move the player? \n E - Estimate required resources \n H - What does it mean to 'harvest resources'? \n D - Get item information \n Q - Quit");
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
                    Output.println("What is the goal of the game? \n" + " We don't know!");
                    break;
                case 'M':
                    Output.println("How to move the player? \n" + " You have legs, figure it out");
                    break;
                case 'E':
                    Output.println("Estimate required resources \n" + "To succeed in this game you will need to retain minimum of resources. Here is the list of items you will wnat to closely monitor while playing: clothing - keeps you warm and protects from natural elements, such as, wind or sun; firewood - keeps you warm at night and is used to prepare food; wagon wheel - integral part of moving your supplies from one location to another."); 
                    break;
                case 'H':
                    Output.println("What does it mean to 'harvest resources' \n?" + "You are able to add firewood and berries in certain locations in the game. You will be notified of these opportunities as you move from one location to another.");
                    break;
                case 'D':
                    Output.println("Get item information \n" + "Please review the information about the items available in the game: clothing - to keep you warm and clean; firewood - for warmth and for cooking; ox - to help you carry your supplies; berries - fresh berries are a treat on the way; wagon axle - holds the wagon together; wagon wheel - to help you travel. \n Remember, the maximum number of each item you can buy at one time is 10.");
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
