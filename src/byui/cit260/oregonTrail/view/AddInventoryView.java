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
public abstract class AddInventoryView extends View {
    public AddInventoryView(){
       super("\n"
            + "****************************************\n"
            + "Inventory Options \n"
            + "****************************************\n"
            + "B - Buy item \n "
            + "E - Exit \n"
            + "*****************************************\n");
    
    }
    @Override  
     private static boolean doAction(String[] inputs) {
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

