package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *   
 * @author Nastia 
 */
public class HelpMenuView extends View {

    public HelpMenuView() { 
        super("\n"
            + "*************************************************\n"
            + "HELP MENU\n"
            + "*************************************************\n"
            + "G - What is the goal of the game?\n"
            + "M - How to move the player?\n"
            + "E - Estimate required resources.\n"
            + "H - What does it mean to 'harvest resources'?\n"
            + "D - Get information about inventory items in this game.\n"
            + "Q - Quit\n"
            + "**************************************************\n");
    }
    
    @Override 
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
            
            switch (choice) {
                case 'G': 
                    Output.println("What is the goal of the game? \n" + " We don't know!");
                    break;
                case 'M':
                    Output.println("How to move the player? \n" + " You have legs, figure it out");
                    break;
                case 'E':
                    Output.println("Estimate required resources "
                            + "\n" + "To succeed in this game you will need to retain minimum of resources. "
                            + "Here is the list of items you will wnat to closely monitor while playing: "
                            + "clothing - keeps you warm and protects from natural elements, "
                            + "such as, wind or sun; firewood - keeps you warm at night and "
                            + "is used to prepare food; wagon wheel - integral part of moving "
                            + "your supplies from one location to another."); 
                    break;
                case 'H':
                    Output.println("What does it mean to 'harvest resources' \n?" + 
                            "You are able to add firewood and berries in certain "
                            + "locations in the game. You will be notified of "
                            + "these opportunities as you move from one location to another.");
                    break;
                case 'D':
                    Output.println("Get item information \n" + 
                            "Please review the information about "
                            + "the items available in the game: "
                            + "\n clothing - to keep you warm and clean; "
                            + "\n firewood - for warmth and for cooking; "
                            + "\n ox - to help you carry your supplies; "
                            + "\n berries - fresh berries are a treat on the way; "
                            + "\n wagon axle - holds the wagon together; "
                            + "\n wagon wheel - to help you travel. "
                            + "\n Remember, the maximum number of each item you can buy at one time is 10.");
                    break;
                case 'Q':
                    return true;   
                default: Output.println("Invalid menu item");    
            }
            return false;  
    }   
}
