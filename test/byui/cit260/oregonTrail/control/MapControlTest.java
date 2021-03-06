package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.CityStop;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;
import byui.cit260.oregonTrail.model.RiverCrossingStop;
import byui.cit260.oregonTrail.model.ScenicStop;
import byui.cit260.oregonTrail.model.Stop;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marci
 */
public class MapControlTest {
    /**
     * Test of isValidPoint method, of class MapControl.
     */
    @Test //Test 1, Valid1
    public void testIsValidPoint() {
        Map testMap = new Map();
        
        //List of Locations
        Point startingPoint = new Point(0, 0);
        ScenicStop startingStop = new ScenicStop("");
        Location startingLocation = new Location("Starting Point",startingStop);
        startingLocation.setVisitText("starting Location");
        
        Point endPoint = new Point(1, 25);
        ScenicStop endStop = new ScenicStop("");
        Location endLocation = new Location("End Point", endStop);
        endLocation.setVisitText("End Location");
        
        Point fortNoxPoint = new Point(1, 20);
        ScenicStop fortNoxStop = new ScenicStop("");
        Location fortNoxLocation = new Location("Fort Nox Stop",fortNoxStop);
        fortNoxLocation.setVisitText("Fort Nox Location");
        
        Point mississippiRiverPoint = new Point(1, 23);
        RiverCrossingStop mississippiRiverStop = new RiverCrossingStop();
        Location mississippiRiverLocation = new Location("Mississippi", mississippiRiverStop);
        mississippiRiverLocation.setVisitText("Mississippi Location");
        
        
        //adds the location
        testMap.addLocation(startingLocation, startingPoint);
        testMap.addLocation(endLocation, endPoint);
        testMap.addLocation(fortNoxLocation, fortNoxPoint);
        testMap.addLocation(mississippiRiverLocation, mississippiRiverPoint);

        
        //Test 1, Valid       
        boolean expResult = true;
        boolean result = MapControl.isValidPoint(testMap, startingPoint);
        assertEquals(expResult, result);
        System.out.println("test Is Valid Point #1");
        
        //Test 2, Invalid 1
        expResult = false;
        result = MapControl.isValidPoint(testMap, new Point(1, 1));
        assertEquals(expResult, result);
        System.out.println("is not Valid Point #1");
        
      //Test 3, Invalid 2
        expResult = false;
        result = MapControl.isValidPoint(testMap, new Point(2, 1));
        assertEquals(expResult, result);
        System.out.println("is not Valid Point #2");
        
        //Test 4, Invalid 3
        expResult = false;
        result = MapControl.isValidPoint(testMap, new Point(3, 5));
        assertEquals(expResult, result);
        System.out.println("is not ValidPoint #1");
        
        //Test 5, Valid Boundary 1
        expResult = true;
        result = MapControl.isValidPoint(testMap, new Point(1, 25));
        assertEquals(expResult, result);
        System.out.println("is Valid Point #2");
        
        //Test 6, Valid Boundary 2
        expResult = true;
        result = MapControl.isValidPoint(testMap, new Point(1, 20));
        assertEquals(expResult, result);
        System.out.println("is Valid Point #3");
        
        //Test 7, Valid Boundary 3
        expResult = true;
        result = MapControl.isValidPoint(testMap, new Point(1, 23));
        assertEquals(expResult, result);
        System.out.println("is Valid Point #3");
            
    }

    /**
     * Test of movePlayer method, of class MapControl.
     */
    @Test //test 1, valid
    public void testMovePlayer() {
        
        Map testMap = new Map();
        
        //List of Locations
        
        Point endPoint = new Point(1, 25);
        ScenicStop endStop = new ScenicStop("");
        Location endLocation = new Location("end stop", endStop);
        endLocation.setVisitText("End Location");
        
        Point fortNoxPoint = new Point(1, 20);
        ScenicStop fortNoxStop = new ScenicStop("");
        Location fortNoxLocation = new Location("Fort Nox Stop", fortNoxStop);
        fortNoxLocation.setVisitText("Fort Nox Location");
        
        Point mississippiRiverPoint = new Point(1, 23);
        RiverCrossingStop mississippiRiverStop = new RiverCrossingStop();
        Location mississippiRiverLocation = new Location("Mississippi", mississippiRiverStop);
        mississippiRiverLocation.setVisitText("Mississippi Location");
        
        
        //adds the location
        testMap.addLocation(endLocation, endPoint);
        testMap.addLocation(fortNoxLocation, fortNoxPoint);
        testMap.addLocation(mississippiRiverLocation, mississippiRiverPoint);
 
        
       //Test 1, Valid 1
        boolean expResult = true;
        boolean result = MapControl.movePlayer(testMap, new Point(1, 23));
        assertEquals(expResult, result);
        System.out.println("movePlayer valid 1");
        
        //Test 2, invalid 1   
        expResult = false;
        result = MapControl.movePlayer(testMap, new Point(3, 5));
        assertEquals(expResult, result);
        System.out.println("move Player, invalid 1");
        
        //Test 3, invalid 2   
        expResult = false;
        result = MapControl.movePlayer(testMap, new Point(2, 5));
        assertEquals(expResult, result);
        System.out.println("move Player, invalid 2");
        
        //Test 4, invalid 3   
        expResult = false;
        result = MapControl.movePlayer(testMap, new Point(10, 5));
        assertEquals(expResult, result);
        System.out.println("move Player, Invalid 3");
        
       //Test 5, Boundary 1  
        expResult = false;
        result = MapControl.movePlayer(testMap, new Point(100, 50));
        assertEquals(expResult, result);
        System.out.println("move Player, boundary 1"); 
        
        //Test 6, Boundary 2   
        expResult = false;
        result = MapControl.movePlayer(testMap, new Point(1, 2));
        assertEquals(expResult, result);
        System.out.println("move Player Boundary 2");
        
       //Test 7, Boundary 3   
        expResult = false;
        result = MapControl.movePlayer(testMap, new Point(0, 5));
        assertEquals(expResult, result);
        System.out.println("move Player Boundary 3"); 
    }

    /**
     * Test of distancePlayerToPoint method, of class MapControl.
     */
    @Test //Test 1, Valid 1
    public void testDistancePlayerToPoint() {
        System.out.println("distancePlayerToPoint");
        Map map = new Map();
        Point p2 = new Point();
        
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(p2);
        
        double expResult = 0.0;
        double result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0);
       
        
    //Test 2, Invalid 1 can't be a string
       System.out.println("distancePlayerToPoint");
        map = new Map();
        p2 = new Point(1,1);
        
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(p2);
        
        expResult = 0;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0);
      
        
    //Test 3, Invalid 2 player can't be in negative position
       System.out.println("distancePlayerToPoint");
        map = new Map();
        p2 = new Point(1,1);
        
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(new Point (-1,0));
        
        expResult =  2.2361;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result,  0.0001);
       
        
    //Test 4, Invalid 3, 3,3 is not a vaild point on map
       System.out.println("distancePlayerToPoint");
        map = new Map();
        p2 = new Point(3,3);
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(new Point (0,0));
        expResult = 4.2426;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 0.0001);
        
        
    //Test 5, Boundary 1 (other invalid options)
       System.out.println("distancePlayerToPoint");
        map = new Map();
        p2 = new Point(1,15);
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(new Point (1,10));
        expResult = 5;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 1);
        
        
    //Test 6, Boundary 2 (other invalid options)
       System.out.println("distancePlayerToPoint");
        map = new Map();
        p2 = new Point(1,25);
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(new Point (1,15));
        expResult = 10;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 1);
         
        
    //Test 7, Boundary 3 (other invalid options)
       System.out.println("distancePlayerToPoint");
        map = new Map();
        p2 = new Point(1,25);
        map.addLocation(new Location("",new ScenicStop()), p2);
        map.setPlayerLocation(new Point (1,1));
        expResult = 24;
        result = MapControl.distancePlayerToPoint(map, p2);
        assertEquals(expResult, result, 1);
        
    
}
}