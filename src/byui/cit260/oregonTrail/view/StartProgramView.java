package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.model.Player;
import java.io.IOException;
import oregontrail.OregonTrail;


/**
 *          Main Author, Classmate, Classmate
 * @author aschummer, Nastia, Marci
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
    //the function/method below is displaying what the end user sees.
    public static void displayStartProgramView(){ 
              
       //controls the loop for this menu
        boolean endOfView = false;
        do {  
            Output.println("Welcome to the CIT260 Oregon Trail");
            Output.println("******************************************************\n"
                           +"This game will allow you to travel the Oregon\n" 
                           +"Trail making stops at cities, scenic areas, and river crossings.\n"
                           +"You will learn about the hardships that the settlers had to overcome\n"
                           +"as they moved from Independence to Oregon City."
                           +"******************************************************\n"
                           +"Please enter your name before continuing.");   
            
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
            inputs[0] = Input.getString("Enter name: ");
        } catch (IOException ex) {}
        return inputs;
    }
    
    //used to check if you're finished with the current view
    private static boolean doAction(String[] inputs) {
        String name = inputs[0];
        //uses control layer to make a new player
        Player player = PlayerControl.createPlayer(name);
        
        if (player == null){
                Output.println("Could not create the player, " + "Enter a different name.");
                return false;
           }
        //sets the player for the rest of the game
        OregonTrail.setPlayer(player); 
        Output.println("Welcome to the game, " + player.getName() + ". Have fun!");
        //makes the next menu display
        StartExistingGameView.displayStartGameView();
         return true;
    }     
   
}

