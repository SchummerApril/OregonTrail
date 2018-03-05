package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *
 * @author aschummer
 */
public class RestartGameView extends View {

    public RestartGameView() {
        super("\n"
                + "**********************************\n"
                + "CHOOSE ONE OF THE FOLLOWING OPTIONS \n"
                + "************************************\n"
                + "R - Resume\n "
                + "S - Restart Game\n"
                + "H - Help\n"
                + "E - Exit Menu\n"
                + "*************************************\n");
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch (choice) {
            case 'R':
                resumeGame("Would you like to resume a previous game?");
                break;
            case 'S':
                restartGame("Would you like to restart a game?");
                break;
            case 'H':
                getHelp("What can I help you with?");
                break;
            case 'E':
                return true;
            default:
                Output.println("Invalid menu item");
        }
        return false;
    }

    private static void resumeGame(String text) {
        Output.println(text);
    }

    private static void restartGame(String text) {
        Output.println(text);
    }

    private static void getHelp(String text) {
        Output.println(text);
    }

}
