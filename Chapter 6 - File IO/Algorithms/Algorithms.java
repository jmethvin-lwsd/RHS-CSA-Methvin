import java.io.*;
import java.util.*;

public class Algorithms {
    public static final String DATA_FILENAME = "data.txt";
    public static void main(String[] args) throws FileNotFoundException {
        // Write output to file
        PrintStream output = new PrintStream(new File("outputData.txt"));

        output.printf("Input file: %s\n", DATA_FILENAME);
        output.println("-------------------------------------");
        output.printf("Minimum value found:    %7d\n", min(DATA_FILENAME));
        output.printf("Maximum value found:    %7d\n", max(DATA_FILENAME));
        output.printf("Average of all numbers: %7.1f\n", average(DATA_FILENAME));

        output.close();

        // Use to generate random input data
        //genRandomData(3, 10, DATA_FILENAME);
    }

    public static int min(String filename) throws FileNotFoundException {
        File readFile = new File(filename);
        
        if (!readFile.exists()) {
            System.out.println(filename + " doesn't exist!");
            return -1;
        }

        Scanner scRead = new Scanner(readFile);
        int min = scRead.nextInt();

        // Read all the ints in the file
        while (scRead.hasNextInt()) {
            int next = scRead.nextInt();
            if (next < min)
                min = next;
        }
        scRead.close();
        return min;
    }

    public static int max(String filename) throws FileNotFoundException {
        File readFile = new File(filename);
        
        if (!readFile.exists()) {
            System.out.println(filename + " doesn't exist!");
            return -1;
        }

        Scanner scRead = new Scanner(readFile);
        int max = scRead.nextInt();

        // Read all the ints in the file
        while (scRead.hasNextInt()) {
            int next = scRead.nextInt();
            if (next > max)
                max = next;
        }
        scRead.close();
        return max;
    }

    public static double average(String filename) throws FileNotFoundException {
        File readFile = new File(filename);
        
        if (!readFile.exists()) {
            System.out.println(filename + " doesn't exist!");
            return -1;
        }

        Scanner scRead = new Scanner(readFile);
        double sum = scRead.nextInt();
        int count = 1;

        // Read all the ints in the file
        while (scRead.hasNextInt()) {
            sum += scRead.nextInt();
            count++;
        }
        scRead.close();
        return sum / count;
    }
    
    public static void genRandomData(int numLines, int numbersPerLine, String filename) throws FileNotFoundException {
        PrintStream writeNumbers = new PrintStream(new File(filename));
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numbersPerLine; j++) {
                // Generate random numbers between 1 and 100 and with alignment.
                writeNumbers.printf("%4d", (int)(Math.random() * 100) + 1);
            }
            writeNumbers.println();
        }
        writeNumbers.close();
    }
}