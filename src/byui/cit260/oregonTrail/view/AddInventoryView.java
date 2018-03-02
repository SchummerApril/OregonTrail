package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Player;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author Nastia
 */
public class AddInventoryView {
    static void display(){
        
        
        boolean endOfView = false;
        
        do { 
            Output.println(" B- Buy item \n E - Exit");
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
                case 'B': 
                    buyItem();
                    break;
                case 'E':                    
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
     }

    private static void buyItem() {
        //uses Input class
       try {
       Player player = OregonTrail.getCurrentGame().getPlayer();
       
       //displaying all the items from the inventory 
       for (InventoryItemType type: InventoryItemType.values()) {
           //ordinal - unique identifyer of the items inside the inventory list
           //type - should specifically type out the actual name of the item
           Output.println(type.ordinal() + ": " + type);
       }
       
       int type = Input.getInt("Please enter a number that corresponds to the desired item: ");
       int num = Input.getInt("Please enter the number of items you would like: ");
       //calling the canBuy function from PlayerControl
         if (PlayerControl.canBuyItem(player, InventoryItemType.values()[type], num)) {
             //if the player can buy the item, the program moves on to the buyItem function
             PlayerControl.buyItem(player, InventoryItemType.values()[type], num);
             Output.println("Thank you for shopping with us");
             //checking to see if the inventory actually changes after the purchase
             Output.println(player.getInventory());
             
             //take the player to the YourSuppliesView screen
             YourSuppliesView.display();
    
         }
         else {
             Output.println("Sorry, the desired item is unavailable. Try again");
         }
       }
        catch (Exception e){
            e.printStackTrace();
        }
       
    }
       
       
    }

