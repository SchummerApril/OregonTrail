package byui.cit260.oregonTrail.control;

/**
 *
 * @author Nastia, Marci, aschummer
 *          
 */
public class LocationControl {

    static int calcMilesTraveled(int startingPosition, int currentPosition) {
        if (startingPosition < 0){
            return -1;
        }
        if (currentPosition > 0 && currentPosition > 2500){
            return -1;
        }
        
        int totalMilesTraveled = startingPosition + currentPosition;
        return totalMilesTraveled;

    }
}