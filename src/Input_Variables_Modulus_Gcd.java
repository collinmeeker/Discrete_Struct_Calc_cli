import java.util.Scanner;

/**
 * This class is responsible for inputting all the values in for the Modulus_Gcd
 * class methods
 */
public class Input_Variables_Modulus_Gcd extends Input_Variables_Binary_Base {
    int x; // jank way to resolve in.nextLine() issue
    Scanner in = new Scanner(System.in);
    Modulus_Gcd calc = new Modulus_Gcd();
    Navigation nav = new Navigation();
    Formula_Strings formula = new Formula_Strings();
    protected int y;

    /**
     * This method puts user input into the Caesar_Decipher method in the
     * Modulus_Gcd class
     */
    public void Caesar_Decipher_Answer() {
        try {
            this.x++;
            if (this.x == 1) {
                System.out.println("Press 'enter' if there is no prompt below.");
            }
            in.nextLine();
            System.out.println("Enter the encrypted message you wish to decrypt: ");
            String message = in.nextLine();
            System.out.println("Enter the amount the encrypted message was adjusted by (Caesar Cipher is 3): ");
            int adjustment = in.nextInt();
            System.out.println(
                    "Encypted Message: " + message + "\nDecrypted Message: " + calc.Caesar_Decipher(message, adjustment)
                            + "\n\nAnswer: " + calc.Caesar_Decipher(message, adjustment));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            this.x = 0;
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method puts user input into the Caesar_Cipher method in the Modulus_Gcd
     * class
     */
    public void Caesar_Cipher_Answer() {
        
            this.x++;
            if (this.x == 1) {
                System.out.println("Press 'enter' if there is no prompt below.");
            }
            try{
            in.nextLine();
            System.out.println("Enter the message you wish you encrypt: ");
            String message = in.nextLine();
            System.out.println("Enter the amount you wish to encrypt the message by (Caesar Cipher is 3): ");
            int adjustment = in.nextInt();
            System.out.println(
                    "Original Message: " + message + "\nEncypted Message: " + calc.Caesar_Cipher(message, adjustment)
                            + "\n\nAnswer: " + calc.Caesar_Cipher(message, adjustment));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            this.x = 0;
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method puts user input into the mod_inverse method in the Modulus_Gcd
     * class
     */
    public void Modular_Inverse_Answer() {
        try {
            System.out.println(formula.getModularInverse_Formula() + "\n\nEnter the number you want the inverse of: ");
            int x = in.nextInt();
            System.out.println("Enter the mod: ");
            int mod = in.nextInt();
            System.out.println(
                    "\nThe modular inverse of " + x + " is " + calc.mod_inverse(mod, x) + " (under " + mod + ")");
            System.out.println("Answer: " + calc.mod_inverse(mod, x));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method puts user input into the Smallest_Integer_Congruence method in
     * the Modulus_Gcd class
     */
    public void Smallest_Integer_Congruence_Answer() {
        try {
            System.out.println(formula.getSmallestIntegerCong() + "\nEnter the amount for the mod (y): ");
            int mod = in.nextInt();
            System.out.println("Enter the value for constant 1: ");
            int constantx = in.nextInt();
            System.out.println("Enter the constant 2: ");
            int constant = in.nextInt();
            System.out.println(
                    "The smallest integer congruent is: " + calc.Smallest_Integer_Congruence(mod, constantx, constant));

            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

  
    /**
     * This method puts user input into the Gcd_Reverse method in the Modulus_Gcd
     * class
     */
    public void Gcd_Reverse() {
        try {
            System.out.println(formula.getReverse_Gcd_Formula() + "\n\nEnter the amount for the constant 1: ");
            int dividned = in.nextInt();
            System.out.println("Enter the amount for the constant 2: ");
            int divisor = in.nextInt();
            calc.Gcd_Reverse(dividned, divisor);
            System.out
                    .println("(WARNING: Numbers may not always match the numbers found using the Euclidian Algorithm)");
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method puts user input into the Gcd_Answer method in the Modulus_Gcd
     * class
     */
    public void Gcd_Answer() {
        try {
            System.out.println(formula.getGcd_Formula() + "\n\nEnter the amount for x: ");
            int dividend = in.nextInt();
            System.out.println("Enter the amount for y: ");
            int divisor = in.nextInt();
            System.out.println("The Gcd is: " + calc.Gcd(dividend, divisor));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method puts user input into the Modulus_Answer method in the Modulus_Gcd
     * class
     */
    public void Modulus_Answer() {
        try {
            System.out.println(formula.getModular_Formula() + "\nEnter the amount for the dividend: ");
            int dividend = in.nextInt();
            System.out.println("Enter the amount for the divisor: ");
            int divisor = in.nextInt();
            System.out.println("Answer: " + calc.Modulus(dividend, divisor) +
                    "\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

}
