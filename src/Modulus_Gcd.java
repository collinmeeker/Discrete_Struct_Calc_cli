import java.util.HashMap;
import java.util.Scanner;

/**
 * This class calculates the answers for the modulusGcd Menu
 */
public class Modulus_Gcd {
    HashMap<String, Integer> cryp = new HashMap<String, Integer>();
    HashMap<Integer, String> reversed_cryp = new HashMap<Integer, String>();
    private int inverse;
    Scanner in = new Scanner(System.in);

    /**
     * This is the constructor for the Modulus_Gcd Class.
     * We create two HashMaps here which are then used for the
     * Caesar_Cipher and Caesar_Decipher methods
     */
    public Modulus_Gcd() {

        cryp.put("a", 0);
        cryp.put("b", 1);
        cryp.put("c", 2);
        cryp.put("d", 3);
        cryp.put("e", 4);
        cryp.put("f", 5);
        cryp.put("g", 6);
        cryp.put("h", 7);
        cryp.put("i", 8);
        cryp.put("j", 9);
        cryp.put("k", 10);
        cryp.put("l", 11);
        cryp.put("m", 12);
        cryp.put("n", 13);
        cryp.put("o", 14);
        cryp.put("p", 15);
        cryp.put("q", 16);
        cryp.put("r", 17);
        cryp.put("s", 18);
        cryp.put("t", 19);
        cryp.put("u", 20);
        cryp.put("v", 21);
        cryp.put("w", 22);
        cryp.put("x", 23);
        cryp.put("y", 24);
        cryp.put("z", 25);
        cryp.put(" ", -1);

        reverseHashMap();
      
      

    }

    /**
     * Reverses the HashMap cryp to be used in cipher/decipher methods
     */
    private void reverseHashMap() {

        // create key (value for hash 1) -- .get()
        //create value (key for has 1) -- 

        for(String letter: cryp.keySet()) {
            reversed_cryp.put(cryp.get(letter), letter);
        }
    }

    /**
     * This method decrpyts messages by a certain amount
     * 
     * @param message    is the message you wish to decrypt
     * @param adjustment is the amount you wish to decrypt the message by
     * @return the decrypted message
     */
    public String Caesar_Decipher(String message, int adjustment) {

        return Caesar_Cipher(message, 26 - (adjustment % 26));

    }

    /**
     * This method encypts a message by a certain amount
     * 
     * @param message    is the message you want to encrypt
     * @param adjustment is the amount you want to adjust the message by
     * @return the adjusted message
     */
    public String Caesar_Cipher(String message, int adjustment) {
        String[] letters = message.toLowerCase().trim().replaceAll("\\s+", " ").split("(?<=.)");
        String changed_message = "";

        for (int i = 0; i < letters.length; i++) {

            if (cryp.get(letters[i]) != -1) {

                int valueChange = (cryp.get(letters[i]) + adjustment) % 26;

                changed_message += reversed_cryp.get(valueChange);

            } else {

                changed_message += reversed_cryp.get(-1);

            }
        }

        return changed_message;
    }

    /**
     * Finding integers x and y such that gcd(dividend, divisor) = dividend x +
     * divisor y
     * 
     * @param dividend the bigger number (x)
     * @param divisor  the smaller number (y)
     */
    public void Gcd_Reverse(int dividend, int divisor) {
        // dividend * x + dividend * y = gcd
        int answer = 0;
        int x = 0;
        int y = 0;
        for (int z = -100; z < 100; z++) {
            if (answer == Gcd(dividend, divisor)) {
                break;
            }
            for (int i = -100; i < 100; i++) {
                answer = (dividend * z) + (divisor * i);
                if (answer == Gcd(dividend, divisor)) {
                    x = z;
                    y = i;
                    break;
                }

            }
        }
        System.out.println("Answer for x: " + x);
        System.out.println("Answer for y: " + y);
    }

    /**
     * Finds the greatest common divisor of the dividend and the divisor
     * 
     * @param dividend is the bigger number represented as x in this program
     * @param divisor  is the smaller number represented as y in this program
     * @return the greatest common divisor of both parameters
     */
    public int Gcd(int dividend, int divisor) {
        int remainder;

        while (true) {

            remainder = Modulus(dividend, divisor);

            if (remainder == 0) {
                break;
            }

            dividend = divisor;
            divisor = remainder;

        }

        return divisor;
    }

    /**
     * Finds the modular inverse (x * what = 1 under mod y)
     * 
     * @param mod       the value of the modulus
     * @param constantx the number we want the inverse of
     * @return the modular inverse of parameter constantx
     */
    public int mod_inverse(int mod, int constantx) {

        int answer;
        for (int i = 0; i < 10000; i++) {
            answer = Math.floorDiv(constantx * i, mod); // constantx is divident, mod is divisor
            if (answer == 1) {
                inverse = i;
                break;
            }
        }
        return inverse;
    }

    /**
     * Finds the smallest positive integer x that solves the congruence equation
     * 
     * @param mod       is the value of the mod
     * @param constantx is the constant that is being multiplied by x
     * @param constant  is the constant of the other side of the equation
     * @return the smallest potitve integer that solves the congruence
     */
    public int Smallest_Integer_Congruence(int mod, int constantx, int constant) {

        int final_answer;
        // New_constantx = constantx * inverse; need to see an example for when this
        // doesnt auto simplify to one
        final_answer = (constant * mod_inverse(mod, constantx)) % mod;
        return final_answer;
        // inputs of mod, constantx, equal to number
        // int answer = (constantx * x) / mod = 1;
    }

    // api for postive dividends only: Math.floorDiv(dividend * x, divisor); = 1
    // m = dividend m = divisor
    /**
     * This app calculates the remainder m/n regardless of whether they are positive
     * or negative
     * 
     * @param m is the dividend
     * @param n is the divisor
     * @return the remainder of m/n
     */
    public int Modulus(int m, int n) {
        int r = 0;
        int q;
        q = m / n;
        if (m > 0) {
            r = -1 * (q * n) + m;
        } // ints in java round down so -6.25 will be -6 when we want it to be -7 which is
          // why it id adjusted here.
        if (m < 0) {
            r = -1 * ((q - 1) * n) + m;
        }
        return r;

    }

  

}
