package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import byui.cit260.oregonTrail.model.Inventory;
import static org.junit.Assert.*;

/**
 *
 * @author Nastia
 * 
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testcanBuyItem() {
        Inventory testInventory = new Inventory();
        //test 1, valid test
        System.out.println("Here is what you added to your inventory");
        Item[] contents = testInventory.getContents();
        int num = 1;
        InventoryItemType type = InventoryItemType.berries; 
        InventoryControl.addToInventory(contents, type, num);
        int actualResult = contents[type.ordinal()].getQuantity(); 
        assertEquals(num, actualResult, 0);
        
        //test 2, invalid number one
        System.out.println("Here is what you added to your inventory");
        contents = testInventory.getContents();
        num = -1;
        InventoryControl.addToInventory(contents, type, num);
        assertEquals(num, actualResult, -1);
        
        //test 3, invalid number two
        System.out.println("Here is what you added to your inventory");
        contents = testInventory.getContents();
        num = 11;
        InventoryControl.addToInventory(contents, type, num);
        assertEquals(num, actualResult, -1);

        
        //test 4, invalid number three
        System.out.println("Here is what you added to your inventory");
        contents = testInventory.getContents();
        num = 9;
        InventoryControl.addToInventory(contents, type, num);
        assertEquals(num, actualResult, -1);
        
        //test 5, boundary number one
        System.out.println("Here is what you added to your inventory");
        contents = testInventory.getContents();
        num = 1;
        InventoryControl.addToInventory(contents, type, num);
        assertEquals(num, actualResult, 0);
        
        //test 6, boundary number two
        System.out.println("Here is what you added to your inventory");
        contents = testInventory.getContents();
        num = 10;
        InventoryControl.addToInventory(contents, type, num);
        assertEquals(num, actualResult, 0);
        
        //test 7, boundary number three
        System.out.println("Here is what you added to your inventory");
        contents = testInventory.getContents();
        num = 1;
        InventoryControl.addToInventory(contents, type, num);
        assertEquals(num, actualResult, 0);
    }
    
}
