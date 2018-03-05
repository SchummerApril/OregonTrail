package byui.cit260.oregonTrail.view;

/**
 *
 * @author Nastia
 */
public class YourSuppliesView extends View {
    public YourSuppliesView(){
        super("\n"
            + "*************************************************\n"
            + "Here is the list of the items in your Inventory: \n"
            + "*************************************************\n");
    }
    @Override  
     public boolean doAction(String value) {
        return true;
     }
    
}
