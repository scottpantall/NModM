/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            myOwnMod(line);
        }
    }
    
    public static void myOwnMod(String line) {
        String[] values = line.split(",");
        int numerator = Integer.parseInt(values[0]);
        int denominator = Integer.parseInt(values[1]);
        int dividedAnswer = numerator / denominator;
        
        // Using modulus operator
        //System.out.println("Using Mod Operator: " + numerator % denominator);
        
        System.out.println((numerator - (denominator * dividedAnswer)));
        
        
        
    }
}
