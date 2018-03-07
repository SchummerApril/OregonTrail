package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Container;

/**
 *
 * @author aschummer
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
   public static int calculateTotalWeight(Container container){
       return container.getWeight() + InventoryControl.calculateTotalWeight(container.getContents());
   }
       public static Container[] sort(Container[] arr) {       
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (calculateTotalWeight(arr[j]) > calculateTotalWeight(arr[j + 1])) {
                    Container temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        return arr;
    }

}