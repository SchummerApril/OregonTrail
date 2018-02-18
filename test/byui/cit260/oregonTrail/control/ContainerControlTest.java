package byui.cit260.oregonTrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aschummer
 */
public class ContainerControlTest {
    
    public ContainerControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcVolumeOfContainer method, of class ContainerControl.
     */
    @Test
    public void testCalcVolumeOfContainer() {
        System.out.println("calcVolumeOfContainer");
        double height = 24.0;
        double diameter = 12.0;
        double expResult = 1.5708;
        double result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        System.out.println("invalid test case1");
        height = -1.0;
        diameter = 12;
        expResult = -1;
        result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("invalid test case2");
        height = 24.0;
        diameter = -1;
        expResult = -1;
        result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("invalid test case3");
        height = 24.0;
        diameter = 37;
        expResult = -1;
        result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("boundary1 test case");
        height = 0.0;
        diameter = 36;
        expResult = 0.0;
        result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("boundary2 test case");
        height = 24.0;
        diameter = 0.0;
        expResult = 0.0;
        result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("boundary3 test case");
        height = 24.0;
        diameter = 36;
        expResult = 14.1371;
        result = ContainerControl.calcVolumeOfContainer(height, diameter);
        assertEquals(expResult, result, 0.0001);
    }
    
}
