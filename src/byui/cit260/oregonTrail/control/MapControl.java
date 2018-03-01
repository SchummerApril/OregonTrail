package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.CityStop;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;
import byui.cit260.oregonTrail.model.RiverCrossingStop;
import byui.cit260.oregonTrail.model.ScenicStop;
import byui.cit260.oregonTrail.model.Stop;

/**
 *          Main Author, Classmate, Classmate
 * @author Marci, Nastia, aschummer
 */
public class MapControl {
    
    //How to move the player Part 1
    public static boolean isValidPoint(Map map, Point p) {
            for (Point existing : map.getContents().keySet()) {
                if (existing.getY() == p.getY() && existing.getX() == p.getX()) {
                    return true;
                }
             }

            return false;
        }


        //How to move the player Part 2
        public static boolean movePlayer(Map map, Point destination) {
            if (MapControl.isValidPoint(map, destination)) {
                map.setPlayerLocation(destination);
                return true;
            }

            return false;
        }


        // How you get the distance between the Player and Stop
        public static double distancePlayerToPoint(Map map, Point p2) {
            if (!MapControl.isValidPoint(map, p2)) {
                return -1.0;
            }

            Point p1 = map.getPlayerLocation();
            int x1 = p1.getX();
            int y1 = p1.getY();
            
            int x2 = p2.getX();
            int y2 = p2.getY();
            // calculate distance using distance formula
            double distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));

            // return result
            return distance;
        }
        
        public static Map createNewMap(){
            Map newMap  = new Map();
            //Start of Game Location - good example of a City Stop
            Stop cityStopOne = new CityStop();
            //different actos for each stop here EX. Actor actorOne = new Actor();
            //names location
            Location startingLocation = new Location("Starting Point", cityStopOne);
            //assigns point to locations
            Point startingPoint = new Point(1, 1);
            newMap.addLocation(startingLocation, startingPoint);
            
            //2 Location on the map - good example of a riverCrossing
            Stop riverCrossingOne = new RiverCrossingStop();
            Location kansasRiverCrossingLocation = new Location("Kansas River Crossing", riverCrossingOne);
            
            Point kansasRiverCrossingPoint = new Point(1, 2);
            newMap.addLocation(kansasRiverCrossingLocation, kansasRiverCrossingPoint);
            
            //3 Location on the map - Good Example of ScenicStop
            Location minorParkLocation = new Location("Minor Park", new ScenicStop ("add description here"));
            Point minorParkPoint = new Point(1, 3);
            newMap.addLocation(minorParkLocation, minorParkPoint);
           
            //4 Location on the map
            Stop riverCrossingTwo = new RiverCrossingStop();
            Location littleBlueRiverLocation = new Location ("Little Blue River", riverCrossingTwo);
            Point littleBlueRiverPoint = new Point(1, 4);
            newMap.addLocation(littleBlueRiverLocation, littleBlueRiverPoint);
            
            //5 Location on the map
            //Gives it the type of Stop
            Stop cityStopTwo = new CityStop();
            //different actors for each stop here
            //Names the Location
            Location fortKearneyLocation = new Location("Fort Kearney", cityStopTwo);
            //assigns point to locations
            Point fortKearneyPoint = new Point(1, 5);
            newMap.addLocation(fortKearneyLocation, fortKearneyPoint);
            
            //6 Location on the map
            Location grandIslandLocation = new Location("Grand Island", new ScenicStop ("add description here"));
            Point grandIslandPoint = new Point(1, 6);
            newMap.addLocation(grandIslandLocation, grandIslandPoint);
            
            //7 Location on the map
            Stop riverCrossingThree = new RiverCrossingStop();
            Location platteRiverCrossingLocation = new Location("Platte River Crossing", riverCrossingThree);
            Point platteRiverCrossingPoint = new Point(1, 7);
            newMap.addLocation(platteRiverCrossingLocation, platteRiverCrossingPoint);
            
            //8 Location on the map
            Location chimneyRockLocation = new Location ("Chimney Rock", new ScenicStop ("add description here"));
            Point chimneyRockPoint = new Point(1, 8);
            newMap.addLocation(chimneyRockLocation, chimneyRockPoint);
            
            //9 Location on the map
            //Gives it the type of Stop
            Stop cityStopThree = new CityStop();
            //different actors for each stop here Actor actorOne = new Actor();
            //Names the Location
            Location fortCasperLocation = new Location("Fort Caspar", cityStopThree);
            //assigns point to the locations
            Point fortCasperPoint = new Point(1, 9);
            newMap.addLocation(fortCasperLocation, fortCasperPoint);
            
            //10 Location on the map
            Location splitrockLocation = new Location ("Splitrock", new ScenicStop ("add description here"));
            Point splitrockPoint = new Point(1, 10);
            newMap.addLocation(splitrockLocation, splitrockPoint);
            
            //11 Location on the map
            Stop riverCrossingFour = new RiverCrossingStop();
            Location greenRiverLocation = new Location("Green River", riverCrossingFour);
            Point greenRiverPoint = new Point(1, 11);
            newMap.addLocation(greenRiverLocation, greenRiverPoint);
            
            //12 Location on the map
            Location sodaSpringsLocation = new Location("Soda Springs", new ScenicStop ("add description here"));
            Point sodaSpringsPoint = new Point(1, 12);
            newMap.addLocation(sodaSpringsLocation, sodaSpringsPoint);
            
            //13 Location on the map
            //Gives it the type of Stop
            Stop cityStopFour = new CityStop();
            //different actors for each stop here Actor actorOne = new Actor();
            //Names the Location
            Location fortWallaWallaLocation = new Location("Fort Walla Walla", cityStopFour);
            //assigns a point to location
            Point fortWallaWallaPoint = new Point(1, 13);
            newMap.addLocation(fortWallaWallaLocation, fortWallaWallaPoint);
            
            //14 Location on the map
            Stop riverCrossingFive = new RiverCrossingStop();
            Location bearRiverLocation = new Location("Bear River", riverCrossingFive);
            Point bearRiverPoint = new Point(1, 14);
            newMap.addLocation(bearRiverLocation, bearRiverPoint);
            
            //15 Location on the map
            Location salmonFallsLocation = new Location("Salmon Falls", new ScenicStop ("add description here"));
            Point salmonFallsPoint = new Point(1, 15);
            newMap.addLocation(salmonFallsLocation, salmonFallsPoint);
            
            //16 Location on the map
            Location snakeRiverLocation = new Location("Snake River", new ScenicStop ("add description here"));
            Point snakeRiverPoint = new Point(1, 16);
            newMap.addLocation(snakeRiverLocation, snakeRiverPoint);
            
            //17 Location on the map
            //Gives it the type of Stop
            Stop cityStopFive = new CityStop();
            //different actors for each stop here Actor actorOne = new Actor();
            //Names the Location
            Location fortBoiseLocation = new Location("Fort Boise", cityStopFive);
            //assigns a point to location
            Point fortBoisePoint = new Point(1, 17);
            newMap.addLocation(fortBoiseLocation, fortBoisePoint);
            
            //18 Location on the map
            Location flagstaffHillLocation = new Location("Flagstaff Hill", new ScenicStop ("add description here"));
            Point flagstaffHillPoint = new Point(1, 18);
            newMap.addLocation(flagstaffHillLocation, flagstaffHillPoint);
            
            //19 Location on the map
            Location blueMountainsLocation = new Location ("Blue Mountains", new ScenicStop ("add description here"));
            Point blueMountainsPoint = new Point(1, 19);
            newMap.addLocation(blueMountainsLocation, blueMountainsPoint);
            
            //20 Location on the map
            Stop riverCrossingSix = new RiverCrossingStop();
            Location deschutesRiverLocation = new Location("Deschutes River", riverCrossingSix);
            Point deschutesRiverPoint = new Point(1, 20);
            newMap.addLocation(deschutesRiverLocation, deschutesRiverPoint);
            
            //21 Location on the map
            Location columbiaRiverLocation = new Location("Columbia River", new ScenicStop ("add description here"));
            Point columbiaRiverPoint = new Point(1, 21);
            newMap.addLocation(columbiaRiverLocation, columbiaRiverPoint);
            
            //22 Location on the map
            //Gives it the type of Stop
            Stop cityStopSix = new CityStop();
            //different actors for each stop here Actor actorOne = new Actor();
            //Names the Location
            Location theDallesLocation = new Location("The Dalles", cityStopSix);
            //assigns a point to the location
            Point theDallesPoint = new Point(1, 22);
            newMap.addLocation(theDallesLocation, theDallesPoint);
            
            //23 Location on the map
            Location willametteRiverLocation = new Location("Willamette River", new ScenicStop ("add description here"));
            Point willametteRiverPoint = new Point(1, 23);
            newMap.addLocation(willametteRiverLocation, willametteRiverPoint);
            
            //24 Location on the map
            Location cityOverLookLocation = new Location("Oregon City Over Look", new ScenicStop ("add description here"));
            Point cityOverLookPoint = new Point(1, 24);
            newMap.addLocation(cityOverLookLocation, cityOverLookPoint);
            
            //Last Location on the Game, End of the Game
            Location endingLocation = new Location("Ending Point", new ScenicStop ("add description here"));
            Point endingPoint = new Point(1, 25);
            newMap.addLocation(endingLocation, endingPoint);
            
            return newMap;
            
    }
}
