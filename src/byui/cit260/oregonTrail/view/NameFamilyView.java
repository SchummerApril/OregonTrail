package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.model.Player;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author Nastia
 */
public class NameFamilyView {
    static void display() {
        
        
        boolean endOfView = false;
        
        do { 
            Output.println("Please enter names of your family and friends who are traveling with you.");
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
        Output.println("Thank you for enterring " + player.getName());
        //makes the next menu display
        StartingPointView.display();
         return true;
    } 
    
     
}
