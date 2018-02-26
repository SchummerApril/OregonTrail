package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *
 * @author aschummer
 */

//April, I commented this section out so that it doesn't show errors
//When  you're ready to work here, remove comments and change the switch statements! :)

//imagine what the Restart Game screen does and write it out, change the words, switch statement
public class RestartGameView {
    /* public static void displayMainMenuView(){
        //!!!!!!!!change the printed lines, different option for the player
        Output.println(" R - Resume \n S - Restart Game \n E - End Game");
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
            //!!!!!!change the switch options
            switch (choice) {
                case 'N': 
                    startNewGame(); //!!!! this is a string
                    break;
                case 'R':
                    restartGame();
                    break;
                case 'H':
                    getHelp();
                    break;
                case 'E':
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
        }*/
}
