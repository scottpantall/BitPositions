/*
 * Given a number n and two integers p1,p2 determine if the bits in position p1
 * and p2 are the same or not. Positions p1 and p2 are 1 based.
 */

/**
 *
 * @author Scott
 */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException 
    {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        
        while ((line = buffer.readLine()) != null) 
        {
            line = line.trim();
            bitPositions(line);
        }
    }
    
    public static void bitPositions(String line)
    {
        // Split line into an array of strings
        String[] tokens = line.split(",");
        
        // Turn the first string into an integer
        //  then turn that into a string of its binary value.
        String binaryValue = Integer.toBinaryString(Integer.parseInt(tokens[0]));
        int p1 = Integer.parseInt(tokens[1]);
        int p2 = Integer.parseInt(tokens[2]);
        
        char p1Value = binaryValue.charAt(binaryValue.length() - p1);
        char p2Value = binaryValue.charAt(binaryValue.length() - p2);
        
        System.out.println(tokens[0] + " converted to binary is " + binaryValue);
        
        System.out.println("Position " + p1 + ": " + p1Value);
        System.out.println("Position " + p2 + ": " + p2Value);
        
        System.out.println(binaryValue.charAt(binaryValue.length() - p1) == binaryValue.charAt(binaryValue.length() - p1));
        
    }
}
