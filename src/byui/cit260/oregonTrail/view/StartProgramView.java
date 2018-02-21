package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author aschummer
 */
public class StartProgramView {

    public StartProgramView() {
    }
    //the function/method below is displaying what the end user sees.
    public static void displayStartProgramView(){ 
        boolean endOfView = false;
        do { 
        String[] inputs = getInputs();
        if (inputs.length < 1 || inputs[0] ==null)
            return;
         endOfView = doAction(inputs);
        }
       while (endOfView != true);
    }
 

    private static boolean getInputs() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Output.println("Welcome to the CIT260 Oregon Trail");
        boolean endOfView = false;
        return false;
    }
    private static boolean doAction() {
        String[] inputs = new String[2];
        Output.println("Please enter your name before continuing.");
        boolean endOfView = false;
        return false;
    }
    
    
    
    private static boolean doAction(String[] inputs) {
        System.out.println("doAction() getting action");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
           
                                
    
    
}
