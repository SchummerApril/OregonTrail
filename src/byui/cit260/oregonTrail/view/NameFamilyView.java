package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.model.Player;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author Nastia
 */
public class NameFamilyView extends View {
    public NameFamilyView() {
        super("\n"
            + "*******************************\n"
            + "Please enter names of your family and friends who are traveling with you.\n"
            + "You can have up to four people travel with you:\n"    
            + "*******************************\n");
        this.prompt = "";
    }
    
    @Override
    public boolean doAction(String value) {
        String name = value;
        Player player = PlayerControl.createPlayer(name);
   
            if (player == null){
                Output.println("Could not create the player, " + "Enter a different name.");
                return false;
               }
        
        OregonTrail.setPlayer(player); 
        Output.println("Thank you for entering " + player.getName());
        //makes the next menu display
        StartingPointView view = new StartingPointView();
        view.display();
        return true;
    }
    
  
    //We don't want to put it in the parent bc we only it used in this view for now. 
    //new override to accept the view display of family members names loop over and over while input ! = quit
}
