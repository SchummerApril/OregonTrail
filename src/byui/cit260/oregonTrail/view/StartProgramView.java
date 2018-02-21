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
         /*endOfView = false
        DO
            inputs = getInputs()
            IF no inputs were entered OR the first input is Q
                RETURN
            ENDIF
            endOfView = doAction(inputs)
        WHILE endOfView != true */
        //use this all the time write it down.
        //promt them to enter their name display the banner page. Put what I want to happen first in the game. Welcome, enter name,
//        System.out.println("Welcome to the Oregon Trail game");
        //no output expected.
        
  //      System.out.println("Please enter your name");
   //     Scanner inputs = new Scanner(System.in);
    //    System.out.println("How many people are in your party");
            //get the inpu
            // if no inputs were entered or the input is a number 

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
           
                                
       /* getInputs(): String[] {
inputs = new String array one element long
Display a description of the view
valid = false
WHILE valid == false (no input value has been enterd)
Display the prompt message
Get the value entered from the keyboard
Trim off leading and trailing blanks from the value
IF length of the value < 1 then
Display "You must enter a non-blank value”
Continue (move to the top of the loop and repeat)
ENDIF
Assign the value to the fist position in the inputs array
valid = true (ends the loop)
ENDWHILE
RETURN inputs*/
    
    
}
