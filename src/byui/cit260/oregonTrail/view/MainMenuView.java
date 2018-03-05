package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Game;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *    
 * @author Nastia
 */
public abstract class MainMenuView extends View {
   
    public MainMenuView(){
        super("\n"
            + "***************************************\n"
            + "MAIN MENU\n"
            + "***************************************\n"
            + "N - Start new game \n"
            + "R - Restart existing game \n"
            + "H - Get help on how to play the game \n"
            + "E - Exit \n"
            + "****************************************\n");
    }
    
    @Override
    public boolean doAction(String value) {
      
        char choice = Character.toUpperCase(input[0].charAt(0));
            
        switch (choice) {
            case 'N': 
                startNewGame();
                break;
            case 'R':
                restartGame();
                break;
            case 'H':
                getHelp();
                break;
            case 'E':
                return true; 
            default: Output.println("Invalid menu item");    
            }
            return false;
        }

    private static void startNewGame() {
        Output.println("Create New Game");        
        Game newGame = GameControl.createNewGame(OregonTrail.getPlayer());
        OregonTrail.setCurrentGame(newGame);
        GameMenuView.display();
    }

    private static void restartGame() {
        Output.println("Loading...");
        Game newGame = GameControl.createNewGame(OregonTrail.getPlayer());
        OregonTrail.setCurrentGame(newGame);
        GameMenuView.display();
    }

    public void getHelp() {
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.display();  
        }
        
}
