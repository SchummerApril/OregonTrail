package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;

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


        /*Location of Stop //Reference how to do it
        *public static void visitCurrentLocation(Map map) {
        *    Point currentPoint = map.getPlayerLocation();
        *   Location currentLocation = map.getContents().get(currentPoint);
        *    currentLocation.visit();
        }
           */

}