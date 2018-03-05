package byui.cit260.oregonTrail.view;

import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *     
 * @author Nastia
 */

public class StartNewGameView extends View {
    public StartNewGameView(){
    super("\n"
        + "*****************************************\n"
        + "PICK YOUR CHARACTER\n"
        + "******************************************\n"
        + "B - Banker \n"
        + "E - Explorer \n"
        + "F - Fur Trader \n"
        + "C - Carpenter \n"
        + "Q - Quit \n"
        + "******************************************\n");
    }

    @Override
    public boolean doAction(String value) {
            //convert array of strings into a single character
            //convert all characters to upper case
            char choice = Character.toUpperCase(value.charAt(0));
            
            switch (choice) {
                case 'B': 
                    Output.println("Congradulations! You are a Banker! "
                            + "Continue to name your travel buddies!");
                    nameFamilyView();
                    break;
                case 'E':
                    Output.println("Congradulations! You are a Explorer! "
                            + "Continue to name your travel buddies!");
                    nameFamilyView();
                    break;
                case 'F':
                    Output.println("Congradulations! You are a Fur Trader! "
                            + "Continue to name your travel buddies!");
                    nameFamilyView();
                    break;
                case 'C':
                    Output.println("Congradulations! You are a Carpenter! "
                            + "Continue to name your travel buddies!");
                    nameFamilyView();
                    break;
                case 'Q':
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
        }
        
    private static void nameFamilyView() {
        NameFamilyView view = new NameFamilyView();
        view.display();
        }     
    }

