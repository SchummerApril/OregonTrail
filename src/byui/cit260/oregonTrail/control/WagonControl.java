package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Container;
import byui.cit260.oregonTrail.model.Wagon;

/**
 *
 * @author aschummer
 */
public class WagonControl {
    public static int calcWagonVolume(int height, int length, int width){
           if (width != 12){
           return -1;
           }
           
           if (height < 5 || height > 10){
           return -1;
           }
           
           if (length < 7 || length > 10){
           return -1;
           }
            
           return height * length * width;
    }
    public static boolean canTravel(Wagon wagon){
    //return true if wagon can travel, false if its missing parts.
            return false;
    }
public static int calculateTotalWeight(Wagon wagon){
    int result = wagon.getWeight();
    for (Container each: wagon.getContainers()){
        result += ContainerControl.calculateTotalWeight(each);
    }
    return result;
}
public static boolean canPullWagon(Wagon wagon){
    return calculateTotalWeight(wagon) < wagon.getMaxCarryWeight();
    
}

    static Wagon createNewWagon() {
        return new Wagon(5);
        
    }
}