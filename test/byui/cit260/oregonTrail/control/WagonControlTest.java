package byui.cit260.oregonTrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aschummer
 */
public class WagonControlTest {
    
    public WagonControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcWagonVolume method, of class WagonControl.
     */
    @Test
    public void testCalcWagonVolume() {
        System.out.println("calcWagonVolume");
        double height = 12.0;
        double diameter = 15.0;
        double radius = 7.0;
        double expResult = 1260;
        double result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("invalid Test Case1");
        height = 12.5;
        diameter = 20.0;
        radius = 8.0;
        expResult= -1;
        result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("invalid Test Case2");
        height = 12.5;
        diameter = 15.0;
        radius = 8.0;
        expResult= -1;
        result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
      
        System.out.println("invalid Test Case3");
        height = 12.5;
        diameter = 20.0;
        radius = 8.0;
        expResult= -1;
        result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("boundary Test Case1");
        height = 0.0;
        diameter = 36.0;
        radius = 0.0;
        expResult= 0.00;
        result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("boundary Test Case2");
        height = 24.0;
        diameter = 0.0;
        radius = 8.0;
        expResult= -1;
        result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("boundary Test Case3");
        height = 24.0;
        diameter = 36.0;
        radius = 0.0;
        expResult= -1;
        result = WagonControl.calcWagonVolume(height, diameter);
        assertEquals(expResult, result, 0.0001);
        
    }
        
}
