package byui.cit260.oregonTrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
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
    @Test
    public void testCalcMilesTraveled() {
        System.out.println("calcMilesTraveled");
        int startingPosition = 0;
        int currentPosition = 50;
        double expResult = 50.00;
        double result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
            
        System.out.println("invalid1 TotalMilesTraveled");
        startingPosition = 30;
        currentPosition = 50;
        expResult = 80.00;
        result = LocationControl.calcMilesTraveled(startingPosition, currentPosition);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }
    
}
