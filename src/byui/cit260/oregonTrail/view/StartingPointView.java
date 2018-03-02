package byui.cit260.oregonTrail.view;
import java.io.IOException;

/**
 *
 * @author Marci
 */
public class StartingPointView {
    
        //this is what is displayed on the screen for the player
     static void display(){
         
        boolean endOfView = false;
        
        //converts input into a char
        do { 
            Output.println(" Welcome to the begining of the Oregon located in Independence Missouri."
                     + "We see that you are getting ready to travel and settle West in Oregon City."
                     + "Please stay here and prepare for the trail.");
         
        Output.println(" S - Shop "
                + "\n  T - Trade "
                + "\n  R - Rest "
                + "\n C - Start the Trail "
                + "\n E - Exit to Game Menu");
            
        String[] inputs = getInputs();
        if (inputs.length < 1 || inputs[0] ==null)
            return;
         endOfView = doAction(inputs);
        }
       while (endOfView != true);
    
    }
    
    //allows you to grab inputs
    private static String[] getInputs() {
        //1 is the length of the array, holds one string
        String[] inputs = new String[1];
        //try/catch wraps the input to catch a possible error
        try {
            inputs[0] = Input.getString("What would you like to do? ");
        } catch (IOException ex) {}
        return inputs;
       }
    
    //what will be done in the game
    private static boolean doAction(String[] inputs) {
            //convert array of strings into a single character
            //convert all characters to upper case
            char choice = Character.toUpperCase(inputs[0].charAt(0));
            
            switch (choice) {
                case 'S': 
                    Shop() ;//check to see if needs to be in a separate control layer 
                            // it does need a View Class
                    break;
                    
                case 'T':
                    Output.println("Will you Trade with me?"); 
                    break;
                    
                case 'R':    
                    Output.println("Would you like to Rest?"); 
                    break;
                    
                case 'C':
                    Output.println("Would you like to start traveling on the trail?"); 
                    break;
                    
                case 'E':
                    exitMenu();
                    return true; 
                   
                    
                default: Output.println("Invalid menu item");    
            }
            return false;
     }
    
    
    private static void exitMenu() {
       Output.println("What would you like to do with your Game?");
       GameMenuView.displayGameMenuView();
    }

    private static void Shop() {
        Output.println("Welcome to the Store");
       ShopView.display();
    }
    
    
}
