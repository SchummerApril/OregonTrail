package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.CityStop;
import byui.cit260.oregonTrail.model.Condition;
import byui.cit260.oregonTrail.model.InventoryItemType;
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
                /* for (Point existing : map.getContents().keySet()) {
                if (existing.getY() == p.getY() && existing.getX() == p.getX()) {
                    return true;
                }*/
           return (map.getContents().get(p) != null);         
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
            
            //3 Location on the map - Good Example of ScenicStop - ScenicStop 1
           //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition bearAttackOne = new Condition("You are being attacked by Bears!! "
                    + "They have eaten some of your food", -2 ,InventoryItemType.food);
            Stop ScenicStopOne = new ScenicStop("add description here");
            ScenicStopOne.setCondition(bearAttackOne);
            
            Location minorParkLocation = new Location("Minor Park", ScenicStopOne);
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
            
            //6 Location on the map - ScenicStop 2
          //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition peacefulOne = new Condition("And it was peaceful in the land.", 0 ,InventoryItemType.food);
            Stop ScenicStopTwo = new ScenicStop("add description here");
            ScenicStopTwo.setCondition(peacefulOne);
            
            Location grandIslandLocation = new Location("Grand Island", ScenicStopTwo);
            Point grandIslandPoint = new Point(1, 6);
            newMap.addLocation(grandIslandLocation, grandIslandPoint);
            
            //7 Location on the map
            Stop riverCrossingThree = new RiverCrossingStop();
            Location platteRiverCrossingLocation = new Location("Platte River Crossing", riverCrossingThree);
            Point platteRiverCrossingPoint = new Point(1, 7);
            newMap.addLocation(platteRiverCrossingLocation, platteRiverCrossingPoint);
            
            //8 Location on the map - ScenicStop 3
           //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition buffaloAttackOne = new Condition("You are being run over by Buffalo!! "
                    + "One of your wagon wheels have been damaged", -1 ,InventoryItemType.wagonWheel);
            Stop ScenicStopThree = new ScenicStop("add description here");
            ScenicStopThree.setCondition(buffaloAttackOne);
            
            Location chimneyRockLocation = new Location ("Chimney Rock", ScenicStopThree);
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
            
            //10 Location on the map - ScenicStop 4
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition bearAttackTwo = new Condition("The Bears are coming! They have eaten some of your food", -5 ,InventoryItemType.food);
            Stop ScenicStopFour = new ScenicStop("add description here");
            ScenicStopFour.setCondition(bearAttackTwo);
            
            Location splitrockLocation = new Location ("Splitrock", ScenicStopFour);
            Point splitrockPoint = new Point(1, 10);
            newMap.addLocation(splitrockLocation, splitrockPoint);
            
            //11 Location on the map
            Stop riverCrossingFour = new RiverCrossingStop();
            Location greenRiverLocation = new Location("Green River", riverCrossingFour);
            Point greenRiverPoint = new Point(1, 11);
            newMap.addLocation(greenRiverLocation, greenRiverPoint);
            
            //12 Location on the map - ScenicStop 5
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition buffaloAttackTwo = new Condition("Its a stampede!! During the Stampede on of your Axles broke.", -1 ,InventoryItemType.wagonAxle);
            Stop ScenicStopFive = new ScenicStop("add description here");
            ScenicStopFive.setCondition(buffaloAttackTwo);
            
            Location sodaSpringsLocation = new Location("Soda Springs", ScenicStopFive);
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
            
            //15 Location on the map - ScenicStop 6
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition peacefulTwo = new Condition("It was peaceful and you found berries", 5 ,InventoryItemType.berries);
            Stop ScenicStopSix = new ScenicStop("add description here");
            ScenicStopSix.setCondition(peacefulTwo);
            
            Location salmonFallsLocation = new Location("Salmon Falls", ScenicStopSix);
            Point salmonFallsPoint = new Point(1, 15);
            newMap.addLocation(salmonFallsLocation, salmonFallsPoint);
            
            //16 Location on the map - ScenicStop 7
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition bearAttackThree = new Condition("You are being attacked by Bears!! They have eaten one of your Oxen", -1 ,InventoryItemType.ox);
            Stop ScenicStopSeven = new ScenicStop("add description here");
            ScenicStopSeven.setCondition(bearAttackThree);
            
            Location snakeRiverLocation = new Location("Snake River", ScenicStopSeven);
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
            
            //18 Location on the map - ScenicStop 8
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition peacefulThree = new Condition("Everything was calm and you found some firewood", 2 ,InventoryItemType.firewood);
            Stop ScenicStopEight = new ScenicStop("add description here");
            ScenicStopEight.setCondition(peacefulThree);
            
            Location flagstaffHillLocation = new Location("Flagstaff Hill", ScenicStopEight);
            Point flagstaffHillPoint = new Point(1, 18);
            newMap.addLocation(flagstaffHillLocation, flagstaffHillPoint);
            
            //19 Location on the map - ScenicStop 9
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition bearAttackFour = new Condition("You are being attacked by Bears!! They have eaten a lot of your food", -50 ,InventoryItemType.food);
            Stop ScenicStopNine = new ScenicStop("add description here");
            ScenicStopNine.setCondition(bearAttackFour);
            
            Location blueMountainsLocation = new Location ("Blue Mountains", ScenicStopNine);
            Point blueMountainsPoint = new Point(1, 19);
            newMap.addLocation(blueMountainsLocation, blueMountainsPoint);
            
            //20 Location on the map
            Stop riverCrossingSix = new RiverCrossingStop();
            Location deschutesRiverLocation = new Location("Deschutes River", riverCrossingSix);
            Point deschutesRiverPoint = new Point(1, 20);
            newMap.addLocation(deschutesRiverLocation, deschutesRiverPoint);
            
            //21 Location on the map - ScenicStop 10
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition buffaloAttackThree = new Condition("BUFFALO!!!!! They have ruined some of your clothes ", -12 ,InventoryItemType.clothing);
            Stop ScenicStopTen = new ScenicStop("add description here");
            ScenicStopTen.setCondition(buffaloAttackThree);
            
            Location columbiaRiverLocation = new Location("Columbia River", ScenicStopTen);
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
            
            //23 Location on the map - ScenicStop 11
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition buffaloAttackFour = new Condition("The Buffalo were calm so "
                    + "you were able to draw a picture "
                    + "of the herd and pass by safely!!", 0 ,InventoryItemType.food);
            Stop ScenicStopEleven = new ScenicStop("add description here");
            ScenicStopEleven.setCondition(buffaloAttackFour);
            
            Location willametteRiverLocation = new Location("Willamette River", ScenicStopEleven);
            Point willametteRiverPoint = new Point(1, 23);
            newMap.addLocation(willametteRiverLocation, willametteRiverPoint);
            
            //24 Location on the map - ScenicStop 12
            //Allows you to set the condition for the ScenicStop
                                                   //("message", number of items, type of item)
            Condition peacefulFour = new Condition("Enjoy the nice view and take it all in!", 0 ,InventoryItemType.food);
            Stop ScenicStopTwelve = new ScenicStop("You are almost to Oregon City. "
                    + "Once you get over this hill top and down in the valley, "
                    + "you will have made it to the end of your journey");
            ScenicStopTwelve.setCondition(peacefulFour);
            
            Location cityOverLookLocation = new Location("Oregon City Over Look", ScenicStopTwelve);
            Point cityOverLookPoint = new Point(1, 24);
            newMap.addLocation(cityOverLookLocation, cityOverLookPoint);
            
            //Last Location on the Game, End of the Game
            Location endingLocation = new Location("Ending Point", new ScenicStop ("add description here"));
            Point endingPoint = new Point(1, 25);
            newMap.addLocation(endingLocation, endingPoint);
            
            return newMap;
            
    }
}
