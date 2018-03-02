package oregontrail;

import byui.cit260.oregonTrail.control.MapControl;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Point;
import byui.cit260.oregonTrail.model.Shop;
import byui.cit260.oregonTrail.view.Output;
import byui.cit260.oregonTrail.view.StartProgramView;


public class OregonTrail {
    
    //entry point to the rest of the game 
    private static Game currentGame = null; 
    private static Player player = null; 
   

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }
    
    
   
    public static void main(String[] args) {
        //plays the game remove comments later
        //StartProgramView.displayStartProgramView();
        
        //test the model layer because control reaches the model layer
        //makes and instance of your map so it can pull information
        Map testMap = MapControl.createNewMap();
        //prints out what is getting                 What point you want to get
        Output.println(testMap.getContents().get(new Point(2,10)));
        
    }
  
}
