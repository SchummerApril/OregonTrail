package byui.cit260.oregonTrail.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input {
    //BufferedReader - type of wrapper to make input flexible
    static final BufferedReader IN =
            //assignment of the variable BufferedReader
            //InputStreamReader is a Utility class
            new BufferedReader(new InputStreamReader(System.in));

    //getChar = gets one single character
    public static char getChar(String prompt) throws IOException {
        //returns the first character in the string
        return Input.getString(prompt).charAt(0);
    }
   
    //Prompts for a string of input, then parses(understand/convert) the result as an integer 
    public static int getInt(String prompt) throws IOException {
        int  result = 0;
        //false at start bc there is no input
        boolean valid  = false;
        
        // Continue prompting for input as long as it is not a valid integer string.
        while (!valid) {
            String input = Input.getString(prompt);
        //below we try to convert result into integer    
            try {
                result = Integer.parseInt(input);
                valid  = true;
            } catch(NumberFormatException e) {
                Output.println("Invalid input - please enter an integer.");}
        }
        return result;
    }
     //Prompts for a string of input.
    public static String getString(String prompt) throws IOException {
        //best to use only when you're waiting for input
        String input = null; 
        // Continue prompting for input as long as the input is null or empty.
        while(input == null || input.isEmpty()) {
            Output.print(" > " + prompt);
            //trim - gets rid of extra spacing (white space)
            input = Input.IN.readLine().trim();
            
            if (input.length() < 1) {
                Output.println("Invalid input - please enter something.");
            }
        }
        return input;
    }
}
