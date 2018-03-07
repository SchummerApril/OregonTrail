package byui.cit260.oregonTrail.view;
import java.io.IOException;

/**
 *
 * @author Marci
 */
public class StartingPointView extends View {
    
        //this is what is displayed on the screen for the player
    public StartingPointView() {
        super("\n"
              + "********************************************\n"
              +"Welcome to the begining of the Oregon Trail located in Independence, Missouri.\n"
              + "*********************************************\n"
              + "We see that you are getting ready to travel and settle West in Oregon City.\n"
              + "Please stay here and prepare for the Oregon Trail.\n"
              + "*********************************************\n"
              + "S - Shop\n"
              + "T - Trade\n"
              + "R - Rest\n"
              + "C - Start the Trail\n"
              + "E - Exit to Game Menu\n"
              + "W - Container Weight\n");
    }
    
    @Override
    public boolean doAction(String value) {
            //convert array of strings into a single character
            //convert all characters to upper case
            char choice = Character.toUpperCase(value.charAt(0));
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
                case 'W':
                    Weight();
                    break;
                default: Output.println("Invalid menu item");    
            }
            return false;
    }
    
    private static void exitMenu() {
       Output.println("What would you like to do with your Game?");
       GameMenuView view = new GameMenuView();
       view.display();
    }

    private static void Shop() {
       Output.println("Welcome to the Store");
       ShopView view = new ShopView();
       view.display();
    }
   private static void Weight(){
        ContainerWeightView view = new ContainerWeightView();
        view.display();
   }
}
