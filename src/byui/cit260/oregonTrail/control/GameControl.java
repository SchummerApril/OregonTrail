package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Player;
/**
 *          Main Author, Classmate, Classmate
 * @author aschummer, Nastia, Marci
 */
public abstract class GameControl {
    public static Player createNewPlayer(String name){
        return new Player(name);
}
    //makes a new game (Player - calls on the class, player - calls on variable)
    public static Game createNewGame(Player player) {
        Game newGame = new Game();
        newGame.setPlayer(player);
        //every time we set a game we have a map from MapControl
        newGame.setMap(MapControl.createNewMap());
        newGame.setWagon(WagonControl.createNewWagon());
        return newGame;
    }
    
    
}

