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
            
        String[] inputs = this.getInputs();
        if (inputs.length < 1 || inputs[0] ==null)
            return;
         endOfView = this.doAction(inputs);
        }
       while (endOfView != true);
        
       
        
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
        System.out.println("Welcome to the Oregon Trail game");
        //no output expected.
        
        System.out.println("Please enter your name");
        Scanner inputs = new Scanner(System.in);
        
        
        
        System.out.println("How many people are in your party");
            //get the input
           
            // if no inputs were entered or the input is a number 
           
                                
        
    }
    
}