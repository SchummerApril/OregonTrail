package byui.cit260.oregonTrail.view;

/**
 *
 * @author Nastia
 */
public class YourSuppliesView extends View {
    public YourSuppliesView(){
        super("Here is the list of the items in your Inventory");
    }
    @Override  
     public boolean doAction(String value) {
        return true;
     }
    
}
