package byui.cit260.oregonTrail.control;

/**
 *      Main Author, Classmate, Classmate
 * @author aschummer, Marci, Nastia
 */
public class ContainerControl {
   public static double calcVolumeOfContainer(double height, double diameter){
       if (height < 0){
       return -1;
       }
       if (diameter < 0 || diameter > 36){
       return -1;
       }
       double radius = diameter / 2;
       double volume = (Math.PI * Math.pow(radius, 2) * height) / 1728;
       //converted cubic inches to cubic feet
       return volume;
   }
           
}
