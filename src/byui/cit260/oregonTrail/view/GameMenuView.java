package byui.cit260.oregonTrail.view;
import java.io.IOException;


/**
 *
 * @author Nastia and the gang
 */

public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "*****************************************************\n"
                + "GAME MENU\n"
                + "*****************************************************\n"
                + "S - Move the player\n"
                + "D - Calculate the max weight of the container\n"
                + "C - Add item to inventory \n"
                + "E - Exit \n"
                + "*****************************************************\n");
    }
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));

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
        AddInventoryView view = new AddInventoryView();
        view.display(); 
    }

    private static void displayGameMenuView() {
        
    }
    
    
}
    

