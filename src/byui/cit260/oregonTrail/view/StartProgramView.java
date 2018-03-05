package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.model.Player;
import java.io.IOException;
import oregontrail.OregonTrail;


/**
 *          Main Author, Classmate, Classmate
 * @author aschummer, Nastia, Marci
 */
public class StartProgramView extends View {
    public StartProgramView() {
    super("Welcome to the CIT260 Oregon Trail\n"
            +"******************************************************\n"
            +"This game will allow you to travel the Oregon\n" 
            +"Trail making stops at cities, scenic areas, and river crossings.\n"
            +"You will learn about the hardships that the settlers had to overcome\n"
            +"as they moved from Independence to Oregon City.\n"
            +"******************************************************\n"
            +"Please enter your name before continuing.\n");   

    this.prompt = "Enter Your Name: ";
    }

    @Override
    //used to check if you're finished with the current view
    public boolean doAction(String value) {
        String name = value;
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
        StartNewGameView view = new StartNewGameView();
        view.display();
        return true;
    }     
   
}

