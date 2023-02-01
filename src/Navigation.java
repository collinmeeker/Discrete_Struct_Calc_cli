import java.util.ArrayList;

/**
 * This class is responsible for organizing methods in each section and also
 * messages for traveling
 * around program, sending an error for wrong input and other information
 */
public class Navigation {

    public ArrayList<String> CountingMethods = new ArrayList<String>();
    public ArrayList<String> modulusGcdMethods = new ArrayList<String>();
    public ArrayList<String> BinaryBaseMethods = new ArrayList<String>();

    /**
     * Constructor for Navigation Class, keeps track of all the methods by storing
     * them in ArrayLists.
     */
    public Navigation() {
        // Section 1
        CountingMethods.add("1-Multisets");
        CountingMethods.add("2-TrinomialSubsets");
        CountingMethods.add("3-Subsets");
        CountingMethods.add("4-Tuples");
        CountingMethods.add("5-Permutations");
        CountingMethods.add("6-Handshake");
        CountingMethods.add("7-Binomial Theorem");
        CountingMethods.add("8-Subsets(multiple k)");
        CountingMethods.add("9-Tower of Hanoi");
        // Section 2
        modulusGcdMethods.add("1-Modulus");
        modulusGcdMethods.add("2-Caesar Cipher: Encryption");
        modulusGcdMethods.add("3-Caesar Cipher: Decrpytion");
        modulusGcdMethods.add("4-Binary/BaseX Conversions");
        modulusGcdMethods.add("5-Smallest Integer Congruence");
        modulusGcdMethods.add("6-Finding GCD");
        modulusGcdMethods.add("7-Reverse GCD");
        modulusGcdMethods.add("8-Modular Inverse");

        BinaryBaseMethods.add("1-Binary to Decimal Conversion");
        BinaryBaseMethods.add("2-Decimal to Binary Conversion");
        BinaryBaseMethods.add("3-Base X to Decimal Conversion");
        BinaryBaseMethods.add("4-Decimal to Base X Conversion");

    }

    /**
     * 
     * @return the methods in the Cryptography section
     */
    public String getCryptographyList() {

        return "Methods: \n" + modulusGcdMethods;

    }

    /**
     * 
     * @return the methods in the counting section
     */
    public String getCountingFormulaList() {
        return "Methods: \n" + CountingMethods;
    }

    /**
     * @return a string containing information on when to use which counting method.
     */
    public String Counting_Method_Uses() {
        return ("Tuple: Order Matters, Repetition Allowed: " + "\nPermutation: Order Matters, "
                + "Repetition Not Allowed:  \nMulti_Set: Order Does Not Matter, Repetition Allowed:"
                + "  \nSubset: Order Does not Matter, Repetition Not Allowed");
    }

    /**
     * @return Message asking user where they would like to go.
     */
    public String TravelPrompt() {
        return "Press '1' to use a function in this section" +
                "\nPress '2' to pick a different Discrete section" + "\nPress '3' to quit";
    }

    public String getTryCatchError() {
        return "\nERROR: The input was invalid for the input requested. Please make sure you putting in the appropriate response.\n";
    }

    /**
     * 
     * @return Error message String telling user the value they inputted was not
     *         valid
     */
    public String ErrorMessage() {
        return "Error: Incorrect value inputted in. Try again but please make sure you type the correct number.";
    }
}
