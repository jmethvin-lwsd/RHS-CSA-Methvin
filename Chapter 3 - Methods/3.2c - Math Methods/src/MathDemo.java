/* Demos the creation of simple math methods (pow, sumToN, ...)

   !! ~ IMPORTANT ~ !! - Implement the methods with method signatures described in the
   method header comments! If you digress from the described method signatures not only
   will your tests not pass, but your code won't compile for me. */
public class MathDemo {
    public static void main(String[] args) {

        // Add code the exercises (run & test) all the code you wrote in this class. 
        // Pick good examples (non-trivial but also something you can hand-verify).  
        // Be sure to identify the output 
        // For example: 
        System.out.println("pow(2, 3) == " + pow(2, 3));

        // Assert call to method pow is equal to expected value
        assert(pow(2, 3) == 8); // (Expected value is 8 with inputs 2 and 3)

        // TODO: FINISH TESTING AND CALLING ALL OTHER METHODS. 

        System.out.println("---- MathDemo: Done ----"); 
    }
    
    // ------------------------------------------------------
    // method: pow
    //
    // Description: declares an integer parameter called num, 
    // an integer parameter called exponent and returns an 
    // integer. Computes "num" to the "exponent".
    // Provided exponent is required to be a non-negative integer.  
    // example usage: pow(2,3) == 8
    // ------------------------------------------------------
    public static int pow(int num, int exponent) {
        // TODO: Finish implementation for pow method. 
        return 0;
    }
    
    // ------------------------------------------------------
    // method: factorial
    //
    // Description: declares an integer parameter called n
    // and returns an integer. Computes n! that is 
    // n * (n-1) * (n-2) ... 3 * 2 * 1
    // example usage: factorial(0) == 1.
    // ------------------------------------------------------ 
    // TODO implement a factorial method 

    // ------------------------------------------------------
    // method: sumToN
    //
    // Description: declares an integer parameter called 
    // maxNum and returns an integer. Computes the sum of all 
    // integers from 1 to maxNum inclusive.
    // example usage: sumToN(0) == 0; sumToN(3) == 6.
    // ------------------------------------------------------
    // TODO implement a sumToN method
    
    // ------------------------------------------------------
    // method: sumSquares
    //
    // Description: declares an integer parameter called
    // maxNum and returns an integer. Computes the sum of the
    // squares up to maxNum.
    // that is N*N + (N-1)*(N-1) ... 3*3 + 2*2 + 1*1 
    // ------------------------------------------------------
    // TODO implement a sumSquares method
    
    // ------------------------------------------------------
    // method: repeat
    //
    // Description: declares a String parameter called str,
    // an integer parameter called count, and returns a String.
    // Builds and returns a new string that is "str" repeated
    // "count" times.
    // ------------------------------------------------------
    // TODO implement a repeat method  
    
    // ------------------------------------------------------
    // method: padLeft
    //
    // Description: declares a String parameter called str,
    // an integer parameter called width, and returns a String.
    // Builds and returns a new string that is "str" padded
    // with spaces so that it has a total of "width" characters.
    //
    // Callers should ensure that the length of str <= width.
    // ------------------------------------------------------
    // TODO implement a padLeft method  
    
    // ------------------------------------------------------
    // method: printTableOfSquares
    //
    // Description: declares an integer parameter called maxN
    // and returns void (i.e., no return value).
    // Prints a table of squares that starts at 1 and goes up
    // to and includes maxN.
    //
    // Your output must match the following format; adhering
    // to ASCII patterns and spacing/padding.
    // +-----+-------+
    // |  N  |  N*N  |
    // +-----+-------+
    // |   1 |     1 |
    // |   2 |     4 |
    //      ... omitted ...
    // |  10 |   100 |
    //      ... omitted ...
    // | 100 | 10000 | 
    // +-----+-------+
    //
    // You can assert that maxN*maxN < 100000 and maxN < 1000
    // Thus N will be at most a 3 digit number and maxN will be
    // at most a 5 digit number.   
    // ------------------------------------------------------
    public static void printTableOfSquares(int maxN) {
        // TODO: Implement.
        // NOTE: YOU MUST PAD INTEGERS so that the table matches above format ("pretty printed").  
        // This is a great use case for your padLeft method.  
        
        // Simple test to see if you enabled assertions for VS Code/Java
        // If you did this will crash your code, and when it does, remove this assertion
        // AND remove this whole comment block.
        assert(false);
        
        // HINT: To convert an integer to a strings use the method
        // Integer.toString(anInteger) (TODO remove this comment before submitting)
    }    
}  
