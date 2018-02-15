package byui.cit260.oregonTrail.control;

/**
 *
 * @author Marci
 */
public class MapControl {
    
    //How to move the player Part 1
    public static boolean isValidPoint(MapControl map, Point p) {
            for (Point existing : map.getContents().keySet()) {
                if (existing.getY() == p.getY() && existing.getX() == p.getX()) {
                    return true;
                }
            }

            return false;
        }


        //How to move the player Part 2
        public static boolean movePlayer(MapControl map, Point destination) {
            if (GameMapControl.isValidPoint(map, destination)) {
                map.setPlayerLocation(destination);
                return true;
            }

            return false;
        }


        // How you get the distance between the Player and Stop
        public static double distancePlayerToPoint(MapControl map, Point p2) {
            if (!MapControl.isValidPoint(map, p2)) {
                return -1.0;
            }

            Point p1 = map.getPlayerLocation();

            // calculate distance using distance formula
            double distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));

            // return result
            return distance;
        }


        //Location of Stop
        public static void visitCurrentLocation(MapControl map) {
            Point currentPoint = map.getPlayerLocation();
            Location currentLocation = map.getContents().get(currentPoint);
            currentLocation.visit();
        }

        //The Current Location of Player
        // Superfluous: just use map.getPlayerLocation() outside the control layer!
        public static Point getPlayerLocation(MapControl map) {
            return map.getPlayerLocation();
        }
}
