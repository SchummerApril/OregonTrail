package byui.cit260.oregonTrail.control;

/**
 *
 * @author Marci
 */
public class MapControl {
    
    //
    public static boolean isValidPoint(MapControl map, Point p) {
            for (Point existing : map.getContents().keySet()) {
                if (existing.getY() == p.getY() && existing.getX() == p.getX()) {
                    return true;
                }
            }

            return false;
        }


        //How to move the player
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
            double distance = Math.hypot(x1-x2, y1-y2);

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
