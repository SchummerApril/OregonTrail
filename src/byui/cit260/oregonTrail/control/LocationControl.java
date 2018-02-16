package byui.cit260.oregonTrail.control;

/**
 *
 * @author Nastia, Marci, aschummer
 *          Main Author, Classmate, Classmate
 */
public class LocationControl {

    static int calcMilesTraveled(int startingPosition, int currentPosition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

  
    
        if (startingPosition < 0){
            return -1;
        }
        if (currentPosition > 0 && currentPosition > 2500){
            return -1;
        }
        
        int totalMilesTraveled = startingPosition + currentPosition;
        
        return totalMilesTraveled;
}
