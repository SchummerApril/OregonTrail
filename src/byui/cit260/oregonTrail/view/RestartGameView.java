
package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *
 * @author aschummer
 */

public class RestartGameView {
     public static void display(){
        
        boolean endOfView = false;
        
        do { 
            Output.println("\n"
                    + "**********************************\n"
                    + "CHOOSE ONE OF THE FOLLOWING OPTIONS \n"
                    + "************************************\n"
                    + "R - Resume \n "
                    + "S - Restart Game \n "
                    + "E - End Game"
                    + "*************************************\n");
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
            char choice = Character.toUpperCase(inputs[0].charAt(0));
            switch (choice) {
                case 'N': 
                    startNewGame("Would you like to start a new game?"); 
                    break;
                case 'R':
                    restartGame("Would you like to restart a previous game?");
                    break;
                case 'H':
                    getHelp("What can I help you with?");
                    break;
                case 'E':
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
        }

    private static void startNewGame(String text) {
       Output.println(text);
    }

    private static void restartGame(String text) {
      Output.println(text);
    }

    private static void getHelp(String text) {
      Output.println(text);
    }

}
