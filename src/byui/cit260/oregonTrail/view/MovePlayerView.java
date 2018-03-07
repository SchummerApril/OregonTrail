package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.MapControl;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Point;
import java.io.IOException;
import java.util.HashMap;
import oregontrail.OregonTrail;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *      
 * @author Marci
 */
public class MovePlayerView extends View{
    
    public MovePlayerView(){
        
                super ("\n"
                    + "***************************************\n"
                    + "Move to a New Location"
                    + "***************************************\n"
                    + "L - List locations \n"
                    + "M - Move the player \n"
                    + "E - Exit \n"
                    + "****************************************\n");
            }
    
     
     @Override
     public boolean doAction(String value) {
            //convert array of strings into a single character
            //convert all characters to upper case
            char choice = Character.toUpperCase(value.charAt(0));
            
            switch (choice) {
                case 'L':  
                    listLocations();
                    break;
                case 'M':
                    movePlayer();
                    break;
                case 'E':    
                    exitMenu();
                    return true; 
                    
                default: Output.println("Invalid menu item");    
            }
            return false;
     }

    private static void listLocations() {
        //display locations you are able to choose Locations
        Output.println("Here is the List of all Locations with X,Y coordinates");
        //checks if location is real/correct
        HashMap<Point, Location> map = OregonTrail.getCurrentGame().getMap().getContents();
        for (Entry <Point, Location> each : map.entrySet()) {
            Point p = each.getKey();
            Location l =each.getValue();
            //list all the locations, everything in the map
            Output.println( l.getName()+ ", " + p.getX() + "," + p.getY());
            
            //error message to move player
        }
    }

    private static void movePlayer() {
        
        try {
            //inputs the x Coordinate
            int x = Input.getInt("x Coordinate");
            //inputs the y Coordinate
            int y = Input.getInt("y Coordinate");
            Point p = new Point(x,y);
            //places map in to statement
            Map map = OregonTrail.getCurrentGame().getMap();
            
            if (MapControl.isValidPoint(map, p)){
                //mover player here 
                   MapControl.movePlayer(map, p);
                   Output.println("You have moved to " + map.getContents().get(p).getName());           
            } 
            else{
                Output.println("You cannot move here."); 
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(MovePlayerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static void exitMenu() {
        //Returns to previous screen
    
    }


}
