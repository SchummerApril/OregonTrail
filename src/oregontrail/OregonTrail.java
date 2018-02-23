package oregontrail;

import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Shop;
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
        StartProgramView.displayStartProgramView();
        
    }
  
}
