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
        
    }
}
