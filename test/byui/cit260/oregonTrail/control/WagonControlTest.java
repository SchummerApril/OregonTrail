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
        int height = 5;
        int length = 9;
        int width = 12;
        int expResult = 540;
        int result = WagonControl.calcWagonVolume(height,length, width);
        assertEquals(expResult, result, 0.0);
    
        
        System.out.println("invalid1 calcWagonVolume");
        height = 11;
        length = 7;
        width = 12;
        expResult = -1;
        result = WagonControl.calcWagonVolume(height,length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("invalid2 calcWagonVolume");
        height = 5;
        length = 20;
        width = 12;
        expResult = -1;
        result = WagonControl.calcWagonVolume(height,length, width);
        assertEquals(expResult, result, 0.0);
       
        System.out.println("invalid3 calcWagonVolume");
        height = 5;
        length = 7;
        width = 15;
        expResult = -1;
        result = WagonControl.calcWagonVolume(height,length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("boundary1");
        height = 5;
        length = 7;
        width = 12;
        expResult = 420;
        result = WagonControl.calcWagonVolume(height,length, width);
        assertEquals(expResult, result, 0.0);
   
    }
        
}
