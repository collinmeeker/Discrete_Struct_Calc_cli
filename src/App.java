import java.util.Scanner;

/**
 * This is the main class that contains the main method along with methods that
 * represent each menu and allow for moving around to each
 * menu. In the main method we create an instance of this class to avoid static
 * type issues and allowing more code to reside in this file.
 * 
 * @author Collin Meeker
 * @version 12/03/2022
 */
public class App extends Input_Variabes_Counting {
    Navigation nav = new Navigation();
    boolean MainMenu;
    static Scanner in;
    Modulus_Gcd x = new Modulus_Gcd();
    

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Welcome to the Discrete Calculator!");
        System.out.println(
                "Type '1' for Counting\nType '2' for Modulus/Gcd\n\nPress '0' for the list of the calculations for each section\n");
        try {
            
            int Topic = in.nextInt();
            new App().mainMenu(Topic, true);
        
        } catch (Exception e) {
            in.nextLine();
            System.out.println(
                    "\nERROR: The input was invalid for the input requested. Please make sure you putting in the appropriate response.\n");
            main(null);
        }
    }

    /**
     * Method for movement in Modulus/Gcd Menu.
     * 
     * @param modulusGcd_Menu decides whether to stay in cryptography section,
     *                        return to main menu or exit program.
     */
    public void modulusGcd_Menu_Movement(int modulusGcd_Menu) {
        // return to cryptography menu
        if (modulusGcd_Menu == 1) {
            modulusGcdMenu();
        }
        // different section
        else if (modulusGcd_Menu == 2) {
            main(null);
        }
        // quit
        else if (modulusGcd_Menu == 3) {
            System.exit(0);
        } else {
            System.out.println(nav.ErrorMessage());
            System.out.println(nav.TravelPrompt());
            int Error = in.nextInt();
            Counting_Menu_Movement(Error);
        }

    }

    /**
     * Method for movement in Counting Menu.
     * 
     * @param Count_menu decides whether to stay in counting section, return to main
     *                   menu or exit program.
     */
    public void Counting_Menu_Movement(int Count_menu) {

        // return to counting menu
        if (Count_menu == 1) {
            countingMenu();
        }
        // different section
        else if (Count_menu == 2) {
            main(null);
        }
        // quit
        else if (Count_menu == 3) {
            System.exit(0);
        } else {
            System.out.println(nav.ErrorMessage());
            System.out.println(nav.TravelPrompt());
            int Error = in.nextInt();
            Counting_Menu_Movement(Error);
        }

    }

    /**
     * This method routes users to desired section
     * 
     * @param Topic    decides which menu to go to (counting or modulusGcd)
     * @param MainMenu is set to true to loop until user breaks the loop and want to
     *                 leave the section.
     */
    public void mainMenu(int Topic, boolean MainMenu) {
        this.MainMenu = MainMenu;
        while (MainMenu) {
            switch (Topic) {
                case 0:
                    System.out.println("Here are the sections and their methods:\n" +
                            "\nCounting Methods: \n" + nav.CountingMethods + "\n\nModulus/Gcd Methods:\n"
                            + nav.modulusGcdMethods + "\n\nPress '1' to return");
                    int mainMenu_return = in.nextInt();
                    if (mainMenu_return > -100) {
                        main(null);
                    }
                    break;
                case 1:
                    countingMenu();
                    break;
                case 2:
                    modulusGcdMenu();
                    break;
                default:
                    System.out.print(nav.ErrorMessage());
                    main(null);
                    break;
            }

        }
    }

    // counting calculations, binomial theorem
    /**
     * This is the Counting Menu.
     */
    public void countingMenu() {
        boolean countingMenu = true;
        while (countingMenu) {

            System.out.println("Here are the following formulas for the Counting Section."
                    + "\nPress the number that corresponds to the following formula you wish to calculate.\n"
                    + nav.getCountingFormulaList() + "\n "
                    + "\nPress '0' if you don't know what formula to use."
                    + "\nPress '11' to return to Main Menu.");
            int CountingChoice = in.nextInt();
            try {
                switch (CountingChoice) {

                    case 11:
                        Counting_Menu_Movement(2);
                        break;

                    case 0:// Description of formula use.

                        System.out.println("Here is how to know what to use:\n\n" + nav.Counting_Method_Uses()
                                + "\n\n" + nav.TravelPrompt());
                        int Formula_Description = in.nextInt();
                        Counting_Menu_Movement(Formula_Description);

                        break;

                    case 1:// MULTISETS

                        super.MultiSet_Answer();
                        int Multiset_Menu = in.nextInt();
                        Counting_Menu_Movement(Multiset_Menu);

                        break;

                    case 2:// TRINOMIAL SUBSETS

                        super.Trinomial_Answer();
                        int Trinomial_Menu = in.nextInt();
                        Counting_Menu_Movement(Trinomial_Menu);

                        break;

                    case 3:// SUBSETS

                        super.Subset_Answer();
                        int Subset_Menu = in.nextInt();
                        Counting_Menu_Movement(Subset_Menu);

                        break;

                    case 4:// TUPLES

                        super.Tuple_Answer();
                        int Tuple_Menu = in.nextInt();
                        Counting_Menu_Movement(Tuple_Menu);

                        break;

                    case 5:// PERMUTATIONS

                        super.Permutation_Answer();
                        int Perm_Menu = in.nextInt();
                        Counting_Menu_Movement(Perm_Menu);

                        break;

                    case 6:// HANDSHAKE

                        super.Handshake_Answer();
                        int Hand_Menu = in.nextInt();
                        Counting_Menu_Movement(Hand_Menu);

                        break;

                    case 7:// Binomial Theorem

                        super.Binomial_Theorem_Answer();
                        int Binomial_Menu = in.nextInt();
                        Counting_Menu_Movement(Binomial_Menu);

                        break;

                    case 8: // Subset with three or more.

                        super.More_Subsets_Answer();
                        int More_Subsets_Menu = in.nextInt();
                        Counting_Menu_Movement(More_Subsets_Menu);

                        break;

                    case 9: // Tower of Hanoi

                        super.TowerOfHanoi_Answer();
                        int Hanoi_Menu = in.nextInt();
                        Counting_Menu_Movement(Hanoi_Menu);

                        break;

                    default:
                        System.out.println(nav.ErrorMessage());
                        break;
                }
                break;

            } catch (Exception e) {
                System.out.println(nav.getTryCatchError());
                in.nextLine();
            }
        }
    }

    /**
     * This is the menu for binary/base conversion calculations.
     */
    public void BinaryBaseMenu() {
        boolean binarybase = true;
        while (binarybase) {
            System.out.println("Here are the binary/base conversion options: \n" + nav.BinaryBaseMethods);
            int BinaryBasechoice = in.nextInt();
            try {
                switch (BinaryBasechoice) {

                    case 1:// Binary to Decimal

                        super.Binary_to_Decimal_Answer();
                        int BinaryDecimal_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(BinaryDecimal_Menu);

                        break;

                    case 2:// Decimal to Binary

                        super.Decimal_to_Binary_Answer();
                        int DecimalBinary_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(DecimalBinary_Menu);

                        break;

                    case 3:// Basex to Decimal

                        super.BaseX_to_Decimal_Answer();
                        int BaseXDecimal_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(BaseXDecimal_Menu);

                        break;

                    case 4:// Decimal to Basex

                        super.Decimal_to_BaseX_Answer();
                        int DecimalBaseX_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(DecimalBaseX_Menu);

                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(nav.getTryCatchError());
                in.nextLine();
            }

        }
    }

    /**
     * This is the modulus and Gcd menu
     */
    public void modulusGcdMenu() {
        boolean modulusGcdMenu = true;
        while (modulusGcdMenu) {
            System.out.println("Here are the following formulas for the Modulus/Gcd Section."
                    + "\nPress the number that corresponds to the following formula you wish to calculate.\n"
                    + nav.getCryptographyList()
                    + "\n\nPress '11 to return to Main Menu.");
            int modulusGcdChoice = in.nextInt();
            try {
                switch (modulusGcdChoice) {

                    case 11:
                        modulusGcd_Menu_Movement(2);
                        break;

                    case 1: // Remainder

                        super.Modulus_Answer();
                        int Modulus_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(Modulus_Menu);

                        break;

                    case 2: // Caesar Cipher encryption

                        super.Caesar_Cipher_Answer();
                        int cipher = in.nextInt();
                        modulusGcd_Menu_Movement(cipher);

                        break;

                    case 3: // Caesar Cipher Decryption

                        super.Caesar_Decipher_Answer();
                        int decipher = in.nextInt();
                        modulusGcd_Menu_Movement(decipher);

                        break;

                    case 4: // Binary to Decimal Conversion
                        BinaryBaseMenu();
                        break;

                    case 5: // Smallest Integer Congruence Conversion

                        super.Smallest_Integer_Congruence_Answer();
                        int Smallest_Integer_Congruence_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(Smallest_Integer_Congruence_Menu);

                        break;

                    case 6: // GCD

                        super.Gcd_Answer();
                        int Gcd_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(Gcd_Menu);

                        break;

                    case 7: // finding integer x and why such that gcd(Dividend,Divisor) = (Dividend)(x) +
                            // (Divisor)(y)

                        super.Gcd_Reverse();
                        int Gcd_Reverse_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(Gcd_Reverse_Menu);

                        break;

                    case 8: // finding the modular inverse

                        super.Modular_Inverse_Answer();
                        int Mod_Inverse_Menu = in.nextInt();
                        modulusGcd_Menu_Movement(Mod_Inverse_Menu);

                        break;

                    default: // if the user inputs a number that is not 1 through 7, display error message
                        System.out.println(nav.ErrorMessage());
                        break;
                }
            } catch (Exception e) {
                System.out.println(nav.getTryCatchError());
                in.nextLine();
            }

        }
    }
}
