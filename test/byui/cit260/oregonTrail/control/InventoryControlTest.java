package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.InventoryItemType;
import byui.cit260.oregonTrail.model.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nastia
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
    public void testaddToInventory() {
        
        //test 1, valid test
        System.out.println("Here is what you added to your inventory");
        Item[] contents = InventoryItemType.contents;
        int num = 1;
        int itemCost = 10;
        int totalCost = 10;
        int accountInfo = 0;
        int result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, 0);
        fail("The test case is a prototype.");
        
        //test 2, invalid number one
        System.out.println("Here is what you added to your inventory");
        contents = InventoryItemType.contents;
        num = -1;
        itemCost = 10;
        totalCost = -1;
        accountInfo = 0;
        result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, -1);
        fail("The test case is a prototype.");
        
        //test 3, invalid number two
        System.out.println("Here is what you added to your inventory");
        contents = InventoryItemType.contents;
        num = 11;
        itemCost = 10;
        totalCost = 110;
        accountInfo = 0;
        result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, -1);
        fail("The test case is a prototype.");
        
        //test 4, invalid number three
        System.out.println("Here is what you added to your inventory");
        contents = InventoryItemType.contents;
        num = 10;
        itemCost = 100;
        totalCost = 1000;
        accountInfo = 0;
        result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, -1);
        fail("The test case is a prototype.");
        
        //test 5, boundary number one
        System.out.println("Here is what you added to your inventory");
        contents = InventoryItemType.contents;
        num = 1;
        itemCost = 1;
        totalCost = 1;
        accountInfo = 0;
        result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, 0);
        fail("The test case is a prototype.");
        
        //test 6, boundary number two
        System.out.println("Here is what you added to your inventory");
        contents = InventoryItemType.contents;
        num = 10;
        itemCost = 5;
        totalCost = 50;
        accountInfo = 0;
        result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, 0);
        fail("The test case is a prototype.");
        
        //test 7, boundary number three
        System.out.println("Here is what you added to your inventory");
        contents = InventoryItemType.contents;
        num = 1;
        itemCost = 300;
        totalCost = 300;
        accountInfo = 0;
        result = InventoryControl.testaddToInventory(contents, num, itemCost);
        assertEquals(totalCost, result, 0);
        fail("The test case is a prototype.");
    }
    
}
