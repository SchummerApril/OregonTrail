package byui.cit260.oregonTrail.view;

import java.io.IOException;

/**
 *          Main Author, Classmate, Classmate
 * @author Nastia, Marci, April
 */
public class StartExistingGameView {

    private static String[] inputs;
    public static void displayStartExistingGameView(){
        //list of things a user can choose from goes here ex. Output.println("")
        Output.println(" S - Restart Existing Game \n D - Save Existing Game \n T - Terminate Game \n E - Exit Game \n");
        boolean endOfView = false;
        
        do {
        String[] inputs = getInputs();
        if (inputs.length < 1 || inputs [0] ==null)
            return;
        endOfView = doAction(inputs); 
    }
        while (endOfView != true);
  }
     private static String[] getInputs() {
     String [] imputs = new String[1];
     
     try {
         inputs[0] = Input.getString("Please select one of the following options: ");
        } catch (IOException ex) {}
        return inputs; 
     }

    private static boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

  //  private static boolean doAction(String[] inputs) {
            //convert array of strings into a single character
            //convert all characters to upper case
    //        char choice = Character.toUpperCase(inputs[0].charAt(0));
            //!!!!!!change the switch options
      //      switch (choice) {
        //        case 'S': 
          //          restartExisitinGame("Would you like to restart an existing game?"); //!!!! this is a string
            //        break;
              //  case 'D':
                //    saveExistingGame("Would you like to save your existing game?");
                  //  break;
               // case 'E':
                 //   exitExistingGame("Would you like to exit existing game?");
                   // break;
             //   case 'T':
               //     terminateExistingGame("Would you like to terminate existing game? ");
              //  case 'E':
                //    return true; 
             //   default: Output.println("Invalid menu item");    
           // }
          //  return false;
       // }
    
