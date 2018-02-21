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
 

    private static String[] getInputs() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Output.println("hello world output to user");
     /*   boolean */
     return inputs;
    }

    private static boolean doAction(String[] inputs) {
        System.out.println("doAction() getting action");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
           
                                
    
    
}