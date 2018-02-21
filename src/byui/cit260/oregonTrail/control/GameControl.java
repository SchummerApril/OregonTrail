package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.Player;
/**
 *          Main Author, Classmate, Classmate
 * @author aschummer
 */
public abstract class GameControl {
    public static Player createNewPlayer(String name){
        return new Player(name);
}
}
