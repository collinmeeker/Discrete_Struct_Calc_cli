import java.util.ArrayList;

/**
 * This class is responsible for calculating
 */
public class Binary_Base_Conversion {

    /**
     * This method converts a number in decimal form into a number of a different
     * base
     * 
     * @param decimal is the number in decimal for you wish to convert to different
     *                base
     * @param base    is the new base you wish to convert the decimal number entered
     *                into
     * @return the decimal number represented in new base form
     */
    public String Decimal_to_BaseX(int decimal, int base) {
        int answer;
        String convertedNumber = "";
        ArrayList<String> remainders = new ArrayList<>();
        // get remainders
        while (true) {
            answer = decimal % base;
            remainders.add(0, Integer.toString(answer));
            decimal = decimal / base;
            if (decimal == 0) {
                break;
            }
        }

        // add remainders to get converted answer to new base
        for (int i = 0; i < remainders.size(); i++) {
            convertedNumber += remainders.get(i);
        }

        return convertedNumber;
    }

    /**
     * converts a number of a differnt base into decimal form
     * 
     * @param number is the number represented in base x form
     * @param base   is the base of the orignal number you wish to convert into
     *               decimal form
     * @return the number converted into decimal form
     */
    public double BaseX_to_Decimal(int number, int base) {
        double answer = 0;
        String String_decimal = Integer.toString(number);
        String[] digits = String_decimal.split("(?<=.)");

        for (int i = 0; i < digits.length; i++) {
            int digitInt = Integer.parseInt(digits[i]);
            answer += digitInt * Math.pow(base, (digits.length - (i + 1)));
        }

        return answer;

    }

    /**
     * This method converts a number in decimal form into binary form
     * 
     * @param decimal is the number you wish to convert into binary form
     */
    public void Decimal_to_Binary(int decimal) {
        System.out.println("Decimal Notation: " + decimal + "\nBinary Notation: " + Integer.toBinaryString(decimal));
    }
    // System.out.println(Integer.parseInt("insert binary number string here", 2));
    // -- this is the quick way to do this using an api rather than how I did it.
    // This converts a binary into a decimal

    /**
     * This method converts a Binary Number into decimal form
     * 
     * @param binary is the number written in binary form we wish to convert into
     *               decimal form
     * @return the binary number value written in decimal form
     */
    public int Binary_to_Decimal(int binary) {
        int dynamic_exponent_binary_adjustment = 0;
        int Binary_to_Decimal_answer = 0;
        int tempAns = 0;
        String bin = Integer.toString(binary);

        for (int i = 0; i < bin.length(); i++) {
            String Zero_or_One = bin.substring(i, i + 1); // sets Zero_or_One to each indiviual letter of String
            dynamic_exponent_binary_adjustment = bin.length() - (i + 1);

            if (Zero_or_One.equals("1")) {
                tempAns = ((int) Math.pow(2, dynamic_exponent_binary_adjustment)); // calculates value of the
                                                                                   // ones
                Binary_to_Decimal_answer += tempAns;
            } else if (Zero_or_One.equals("0")) {

            } else {
                System.out
                        .println("\nError: Binary numbers only contain ones and zeros.\nThis is not a binary number.");
                return 0;
            }
        }
        return Binary_to_Decimal_answer;
    }

}
