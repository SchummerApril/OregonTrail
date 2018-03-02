package byui.cit260.oregonTrail.view;
import java.io.IOException;


/**
 *
 * @author Nastia and the gang
 */
public class GameMenuView {

    static void display() {
        boolean endOfView = false;
        do {
            Output.println("\n"
                    + "*****************************************************\n"
                    + "GAME MENU\n"
                    + "*****************************************************\n"
                    + "S - Move the player\n"
                    + "D - Calculate the max weight of the container\n"
                    + "C - Add item to inventory \n"
                    + "E - Exit \n"
                    + "*****************************************************\n");
            
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
                case 'S': 
                    movePlayer();
                    break;
                case 'D':
                    calcVolumeOfContainer();
                    break;
                case 'C':
                    addToInventory();
                    break;
                case 'E':
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
    }

    private static void movePlayer() {
        MovePlayerView.display();
    }

    private static void calcVolumeOfContainer() {
        ContainerVolumeView.display();
    }

    private static void addToInventory() {
        AddInventoryView.display();
    }

    static void displayGameMenuView() {
        
    }
    
    
}
    

