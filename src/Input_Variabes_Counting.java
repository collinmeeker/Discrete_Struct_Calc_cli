import java.util.Scanner;

/**
 * This class is responsible for inputting all the values in for the counting
 * class methods
 */
public class Input_Variabes_Counting extends Input_Variables_Modulus_Gcd {
    Counting Calc = new Counting();
    Navigation nav = new Navigation();
    Formula_Strings formula = new Formula_Strings();
    private Scanner in = new Scanner(System.in);

    // add an if statement for other binomial options

    /**
     * This method inputs the variables into the binomial theorem method in counting
     * class.
     */
    public void Binomial_Theorem_Answer() {
        try {
            System.out.println(formula.getBinomial_Formula() + "\nEnter the exponent value for n: ");
            int expanded_exponent = in.nextInt();
            System.out.println("Enter the amount for variables's constant: ");
            int constantX = in.nextInt();
            System.out.println("Enter the amount for the constant");
            int constant = in.nextInt();
            System.out.println("Enter the exponent for the variable that you want the constant for: ");
            int exponent_power_needed = in.nextInt();
            System.out.println(
                    "Answer: " + Calc.Binomial_Theorem(expanded_exponent, constantX, constant, exponent_power_needed)
                            + "\n"
                            + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables for the tower of hanoi method in the
     * counting class.
     */
    public void TowerOfHanoi_Answer() {
        try {
            System.out.println("Enter the amount of disks you need to move: ");
            int disks = in.nextInt();
            System.out.print("Total moves: ");
            Calc.TowerOfHanoi(disks, 1, 0);
            System.out.println(nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables for the mutiset method in the counting
     * class.
     */
    public void MultiSet_Answer() {
        try {
            System.out.println(formula.getMultiset_Formula() + "\nEnter the amount for n");
            int n = in.nextInt();
            System.out.println("Enter the amount for k");
            int k = in.nextInt();

            System.out.println("Answer: " + Calc.Multisets(n, k) +
                    "\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }

    }

    /**
     * This method inputs the variables for the trinomial method in the counting
     * class.
     */
    public void Trinomial_Answer() {
        try {
            System.out.println(formula.getTrinomial_Subset_Formula() + "\nEnter the amount for n: ");
            int Tri_Subset_n = in.nextInt();
            System.out.println("Enter the amount for k1: ");
            int T_k1 = in.nextInt();
            System.out.println("Enter the amount for k2: ");
            int T_k2 = in.nextInt();
            System.out.println("Enter the amount for k3: ");
            int T_k3 = in.nextInt();

            System.out.println("Answer: " + (double) Calc.TrinomialSubsets(Tri_Subset_n, T_k1, T_k2, T_k3)
                    + "\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables for the more subset method in the counting
     * class.
     */
    public void More_Subsets_Answer() {
        try {
            System.out.println(formula.getMore_Subsets() + "\nEnter the amount for n: ");
            int n = in.nextInt();
            System.out.println("Enter the amount for k1: ");
            int k1 = in.nextInt();
            System.out.println("Enter the amount for k2: ");
            int k2 = in.nextInt();

            System.out.println("Answer: " + Calc.More_Subsets(n, k1, k2));
            System.out.println("\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the varibales for the subset method in the counting class.
     */
    public void Subset_Answer() {
        try {
            System.out.println(formula.getSubset_Formula() + "\nEnter the amount for n: ");
            int subset_n = in.nextInt();
            System.out.println("Enter the amount for k: ");
            int subset_k = in.nextInt();

            // return answer
            System.out.println("Answer: " + Calc.Subsets(subset_n, subset_k)
                    + "\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables for the tuple method in the counting class.
     */
    public void Tuple_Answer() {
        try {
            System.out.println(formula.getTupleFormula() + "\nEnter the amount for slots: ");
            int Tuple_slots = in.nextInt();
            System.out.println("Enter the amount for totalOptions: ");
            int Tuple_totalOptions = in.nextInt();

            System.out.println("Answer: " + Calc.Tuples(Tuple_slots, Tuple_totalOptions)
                    + "\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables for the permututation method in the counting
     * class.
     */
    public void Permutation_Answer() {
        try {
            System.out.println(formula.getPermutationFormula() + "\nEnter the amount for n: ");
            int Perm_slots = in.nextInt();
            System.out.println("Enter the amount for k: ");
            int Perm_totalOptions = in.nextInt();

            System.out.println("Answer: " + Calc.Permutations(Perm_slots, Perm_totalOptions)
                    + "\n" + nav.TravelPrompt());
        } catch (Exception e) {
            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();
        }
    }

    /**
     * This method inputs the variables for the Hand method in the counting class.
     */
    public void Handshake_Answer() {
        try {

            System.out.println(formula.getHandShakeFormula());
            System.out.println("\nEnter the amount for n");
            long Hand_n = in.nextLong();
            System.out.println("Answer: " + Calc.Hand(Hand_n)
                    + "\n" + nav.TravelPrompt());

        } catch (Exception e) {

            System.out.println(nav.getTryCatchError() + nav.TravelPrompt());
            in.nextLine();

        }
    }

}
