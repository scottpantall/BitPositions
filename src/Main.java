/*
 * Given a number n and two integers p1,p2 determine if the bits in position p1
 * and p2 are the same or not. Positions p1 and p2 are 1 based.
 */

/**
 *
 * @author Scott
 */
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException 
    {
        Files.lines(Paths.get(args [0])).map(String::trim).forEach(Main::bitPositions); 
        /*
        //File file = new File(args[0]);
        Path file = Paths.get(args[0]);
        //BufferedReader buffer = new BufferedReader(new FileReader(args[0]));
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        
        while ((line = buffer.readLine()) != null) 
        {
            line = line.trim();
            bitPositions(line);
        }
                */
    }
    
    public static void bitPositions(String line)
    {
        // Split line into tokens using a Scanner
        Scanner s = new Scanner(line).useDelimiter(",");
        
        // Turn the first string into an integer
        //  then turn that into a string of its binary value.
        String binaryValue = Integer.toBinaryString(s.nextInt());
        int p1 = s.nextInt();
        int p2 = s.nextInt();;
        
        //System.out.println(p1Value == p2Value);
        System.out.println(binaryValue.charAt(binaryValue.length() - p1) == binaryValue.charAt(binaryValue.length() - p2));
        
    }
}
