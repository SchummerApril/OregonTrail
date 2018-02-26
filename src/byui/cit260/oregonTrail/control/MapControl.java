package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;
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
            Location startingLocation = new Location(new ScenicStop ("Starting Point"));
            Point startingPoint = new Point(1, 1);
            newMap.addLocation(startingLocation, startingPoint);
            
            Location endingLocation = new Location(new ScenicStop ("Ending Point"));
            Point endingPoint = new Point(1, 25);
            newMap.addLocation(endingLocation, endingPoint);
            
            return newMap;
            
    }
}