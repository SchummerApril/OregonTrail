package oregontrail;

import byui.cit260.oregonTrail.model.Shop;
import byui.cit260.oregonTrail.view.StartProgramView;

/**
 *
 * @author Connor
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StartProgramView.displayStartProgramView();
        
        Shop myShop = new Shop();
        System.out.println(myShop);
        
        //!!!print something for each class you created in this document
    }
  
}
