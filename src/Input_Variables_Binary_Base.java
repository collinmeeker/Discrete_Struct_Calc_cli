import java.util.Scanner;

/**
 * This class is responsible for inputting user input for binary/base x
 * conversion methods
 */
public class Input_Variables_Binary_Base {
    Scanner in = new Scanner(System.in);
    Navigation nav = new Navigation();
    Formula_Strings formula = new Formula_Strings();
    Binary_Base_Conversion BB_calc = new Binary_Base_Conversion();

    /**
     * This method inputs the variables into the BaseX_to_Decimal method in
     * Binary_Base_Conversion class.
     */
    public void BaseX_to_Decimal_Answer() {
        try {
            System.out.println("Enter the current base you wish to convert to decimal form: ");
            int base = in.nextInt();
            System.out.println("Enter the current number in base " + base + " form: ");
            int number = in.nextInt();
            System.out
                    .println("Base " + base + " Notation\nDecimal Notation: " + BB_calc.BaseX_to_Decimal(number, base));
            System.out.println("\nAnswer: " + BB_calc.BaseX_to_Decimal(number, base));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables into the Decimal_to_BaseX method in
     * Binary_Base_Conversion class.
     */
    public void Decimal_to_BaseX_Answer() {
        try {
            System.out.println("Enter the Decimal value you wish to convert to a different base form: ");
            int decimal = in.nextInt();
            System.out.println("Enter the base you want to convert to: ");
            int base = in.nextInt();
            System.out.println("Decimal Notation: " + decimal + "\nBase " + base + " Notation: "
                    + BB_calc.Decimal_to_BaseX(decimal, base));
            System.out.println("\nAnswer: " + BB_calc.Decimal_to_BaseX(decimal, base));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables into the Decimal_to_Binary method in
     * Binary_Base_Conversion class.
     */
    public void Decimal_to_Binary_Answer() {
        try {
            System.out.println("Enter the Decimal value you wish to convert to Binary form: ");
            int Decimal_Value = in.nextInt();
            BB_calc.Decimal_to_Binary(Decimal_Value);
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /*
     * This method inputs the variables into the Binary_to_Decimal method in
     * Binary_Base_Conversion class.
     */
    public void Binary_to_Decimal_Answer() {
        try {
            System.out
                    .println("Enter the Binary value you wish to convert to decimal form (should only be 1s and 0s): ");
            int Binary_value = in.nextInt();
            System.out.println(
                    "Binary Form: " + Binary_value + "\nDecimal Notation: " + BB_calc.Binary_to_Decimal(Binary_value)
                            + "\n\nAnswer: " + BB_calc.Binary_to_Decimal(Binary_value));

            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

}
