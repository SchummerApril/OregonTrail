package byui.cit260.oregonTrail.view;
import java.io.PrintWriter;

//this class is printing stuff to the console 
public abstract class Output {
    private final static PrintWriter OUT = new PrintWriter(System.out, true);
    
    public static <T> void print(T text) {
        Output.OUT.print(text);
        Output.OUT.flush();
    }

    public static <T> void println(T text) {
        Output.OUT.println(text);
    }
}

