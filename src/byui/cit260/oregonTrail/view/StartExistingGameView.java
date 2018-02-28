package byui.cit260.oregonTrail.view;

/**
 *          Main Author, Classmate, Classmate
 * @author Nastia, Marci, April
 */


//list of things a user can choose from goes here ex. Output.println("")
        
        //Who would you like to be Banker(1,000), Farmer(500), Missionary(300)
                //switch b - Banker, F - Farmer, M - Missionary
        
        //Name your Family
                //inputs
                    //1. name...
                    //2. name...
                    //3. name...
                    //4. name...
                    
        //Coninue to StartingPointView to start the trail/game

class StartExistingGameView {
    static void displayStartExistingGameView(){
        
        Output.println(" N - start new game \n R - Restart existing game \n H - Get help on how to play the game \n E - exit");
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
                case 'N': 
                    startNewGame();
                    break;
                case 'R':
                    restartGame();
                    break;
                case 'H':
                    getHelp();
                    break;
                case 'E':
                    return true; 
                default: Output.println("Invalid menu item");    
            }
            return false;
        }
        
    private static void getHelp() {
       Output.println("How may I help?");
       HelpMenuView.displayHelpMenuView();
    }
    
    
        
    }
