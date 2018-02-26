package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;
import java.io.IOException;
import java.util.HashMap;
import oregontrail.OregonTrail;
import java.util.Map.Entry;

/**
 *
 * @author Marci
 */
public class MovePlayerView {
    static void display(){
        
        Output.println(" R - list locations \n  T - move the player \n E - exit");
        boolean endOfView = false;
        
        do { 
        String[] inputs = getInputs();
        if (inputs.length < 1 || inputs[0] ==null)
            return;
         endOfView = doAction(inputs);
        }
       while (endOfView != true);
    
    }
    
     private static String[] getInputs() {
        //1 is the length of the array, holds one string
        String[] inputs = new String[1];
        //try/catch wraps the input to catch a possible error
        try {
            inputs[0] = Input.getString("Please select one of the following options: ");
        } catch (IOException ex) {}
        return inputs;
       }
     
     private static boolean doAction(String[] inputs) {
            //convert array of strings into a single character
            //convert all characters to upper case
            char choice = Character.toUpperCase(inputs[0].charAt(0));
            
            switch (choice) {
                case 'R': 
                    listLocations();
                    break;
                case 'T':
                    movePlayer();
                    break;
                case 'E':                    
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
     }

    private static void listLocations() {
        HashMap<Point, Location> map = OregonTrail.getCurrentGame().getMap().getContents();
        for (Entry <Point, Location> each : map.entrySet()) {
            Point p = each.getKey();
            Location l =each.getValue();
            Output.println(p.getX() + ", " + p.getY());
        }
    }

    private static void movePlayer() {
        //checks for the validity of the points
        HashMap<Point, Location> Map;
    }
}
