package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Player;

/**
 *
 * @author Nastia
 */
public abstract class PlayerControl {
    public static Player createPlayer(String name){
        return new Player(name);
    }
}
