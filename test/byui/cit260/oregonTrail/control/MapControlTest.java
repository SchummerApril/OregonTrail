package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marci
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of isValidPoint method, of class MapControl.
     */
    @Test //Test 1, Valid1
    public void testIsValidPoint() {
        System.out.println("isValidPoint");
        Map map = null;
        Point p = null;
        boolean expResult = false;
        boolean result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    //Test 2, Invalid 1
        System.out.println("is not ValidPoint");
        map = null;
        p = null;
        expResult = false;
        result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    //Test 3, Invalid 2
        System.out.println("is not ValidPoint");
        map = null;
        p = null;
        expResult = false;
        result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   
        
    //Test 4, Invalid 3
        System.out.println("is not ValidPoint");
        map = null;
        p = null;
        expResult = false;
        result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");    
        
    //Test 5, Boundary 1
        System.out.println("is Boundary 1 ValidPoint");
        map = null;
        p = null;
        expResult = false;
        result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");        
        
    //Test 6, Boundary 2
        System.out.println("is boundary 2ValidPoint");
        map = null;
        p = null;
        expResult = false;
        result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); 
        
    //Test 7, Boundary 3
        System.out.println("is boundary 3ValidPoint");
        map = null;
        p = null;
        expResult = false;
        result = MapControl.isValidPoint(map, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");     
    }

    /**
     * Test of movePlayer method, of class MapControl.
     */
    @Test //test 1, valid
    public void testMovePlayer() {
        System.out.println("movePlayer");
        Map map = null;
        Point destination = null;
        boolean expResult = false;
        boolean result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
   //test 2, invalid  1    
        System.out.println("movePlayer");
        map = null;
        destination = null;
        expResult = false;
        result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
   //test 3, invalid  2    
        System.out.println("movePlayer");
        map = null;
        destination = null;
        expResult = false;
        result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   
        
   //test 4, invalid  3    
        System.out.println("movePlayer");
        map = null;
        destination = null;
        expResult = false;
        result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   
        
   //test 5, additional Valid test  1    
        System.out.println("movePlayer");
        map = null;
        destination = null;
        expResult = false;
        result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   
             
   //test 6, additional Valid test  2    
        System.out.println("movePlayer");
        map = null;
        destination = null;
        expResult = false;
        result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");        
        
    //test 7, additional Valid test  3    
        System.out.println("movePlayer");
        map = null;
        destination = null;
        expResult = false;
        result = MapControl.movePlayer(map, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   
        
    }

    /**
     * Test of distancePlayerToPoint method, of class MapControl.
     */
    @Test //Test 1, Valid 1
    public void testDistancePlayerToPoint() {
        System.out.println("distancePlayerToPoint");
        Map map = null;
        Point p2 = null;
        double expResult = 0.0;
        double result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    //Test 2, Invalid 1
       System.out.println("distancePlayerToPoint");
        map = null;
        p2 = null;
        expResult = 0.0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); 
        
    //Test 3, Invalid 2
       System.out.println("distancePlayerToPoint");
        map = null;
        p2 = null;
        expResult = 0.0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");     
        
    //Test 4, Invalid 3
       System.out.println("distancePlayerToPoint");
        map = null;
        p2 = null;
        expResult = 0.0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");  
        
    //Test 5, Boundary 1 (other invalid options)
       System.out.println("distancePlayerToPoint");
        map = null;
        p2 = null;
        expResult = 0.0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");    
        
    //Test 6, Boundary 2 (other invalid options)
       System.out.println("distancePlayerToPoint");
        map = null;
        p2 = null;
        expResult = 0.0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");     
        
    //Test 7, Boundary 3 (other invalid options)
       System.out.println("distancePlayerToPoint");
        map = null;
        p2 = null;
        expResult = 0.0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");      
    }
    
}
