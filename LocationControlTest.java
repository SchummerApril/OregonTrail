package byui.cit260.oregonTrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author aschummer
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcMilesTraveled method, of class LocationControl.
     */
    @Test //test 1, valid
    public void testCalcMilesTraveled() {
        System.out.println("calcMilesTraveled");
        int startingPosition = 0;
        int currentPosition = 50;
        int expResult = 50;
        int result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    //test 2, invalid number one       
        System.out.println("invalid1 TotalMilesTraveled");
        startingPosition = 30;
        currentPosition = 50;
        expResult = 80;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    //test 3, invalid number two
        System.out.println("invalid2 TotalMilesTraveled");
        startingPosition = -5;
        currentPosition = 200;
        expResult = -195;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    
     //test 4, invalid number three 
        System.out.println("invalid3 TotalMilesTraveled");
        startingPosition = 0;
        currentPosition = 3000;
        expResult = 3000;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    
     //test 5, boundary number one      
        System.out.println("boundary1 TotalMilesTraveled");
        startingPosition = 0;
        currentPosition = 2;
        expResult = 2;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
     //test 6, boundary number two     
        System.out.println("boundary2 TotalMilesTraveled");
        startingPosition = 0;
        currentPosition = 1500;
        expResult = 1500;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
     //test 7, boundary number three      
        System.out.println("boundary3 TotalMilesTraveled");
        startingPosition = 0;
        currentPosition = 2500;
        expResult = 2500;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }

    private void assertEquals(int expResult, int result, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

