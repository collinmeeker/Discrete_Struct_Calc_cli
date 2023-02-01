/**
 * This class is responsible for storing the formula strings.
 */
public class Formula_Strings {

    /**
     * This method gets ModularInverse formula
     * 
     * @return ModualrIinverse formula
     */
    public String getModularInverse_Formula() {
        // (x*y) mod z = 1
        String formula = "Modular inverse of x is: "
                + "(x * y) mod z  = 1   (we're solving for y)";

        return formula;
    }

    public String getMore_Subsets() {
        
        String formula = "\t    n!\n\t____________\n\tk1! k2! ... kx!";
        return formula + "\n\nn = pool size\nk1 = subset size 1"
        + "\tk2 = subset size 2\t kx = subset size x";
    }

    /**
     * This method gets Smallest_Integer_Congruence formula
     * 
     * @return Smallest_Integer_Congruence formula
     */
    public String getSmallestIntegerCong() {

        String formula = "Find the smallest positve integer x that solves"
                + " the congruence: "
                + "\n\n\t(constant 1)x ≡ (constant 2)    (mod y)"
                + "\n\n";

        return formula;
    }

    /**
     * This method gets Reverse_Gcd formula
     * 
     * @return Reverse_Gcd formula
     */
    public String getReverse_Gcd_Formula() {

        String formula = "Find a pair of integers x and y such that "
                + "(constant 1)x + (constant 2)y = gcd(constant 1, constant 2)"
                + "\n\n constant 1 = bigger number"
                + "\n constant 2 = smaller number";

        return formula;
    }

    /**
     * This method gets binomila theorem formula
     * 
     * @return Gcd formula
     */
    public String getGcd_Formula() {

        String formula = "Determine the greatest common divisor of x and y "
                + "\n\n\tgcd(x, y)"
                + "\n\n x = bigger number"
                + "\n y = smaller number";

        return formula;

    }

    /**
     * This method gets binomila theorem formula
     * 
     * @return binomial formula
     */
    public String getBinomial_Formula() {

        String Binomial_Formula = "Given:\t\t\t\tNeed:\n\n\t\tn\t\t\t         k\n\t(2x - 1)\t\t\t(answer)x";

        return Binomial_Formula
                + "\n\nn = exponent value to expand \t variable constant  = 2 here \tconstant = -1 above here \nk = the exponent for the variable that you want the constant for";
    }

    /**
     * This method gets modular formula
     * 
     * @return modular formula
     */
    public String getModular_Formula() {
        String Modular_Formula = "\tX mod Y (remainder when dividing X by Y)";
        return Modular_Formula + "\n\n X =  dividend\t Y = divisor\n";
    }

    /**
     * This method gets mulitset formula
     * 
     * @return mulitset formula
     */
    public String getMultiset_Formula() {
        String Multiset_Formula = "\t(n + k - 1)!\n\t____________\n\tk!(n - 1)!";

        return Multiset_Formula + "\n\nn = pool size / bookshelves\tk = subset size / books"
                + "\n('n choose k repeated')";
    }

    /**
     * This method gets trinomial formula
     * 
     * @return trinomial formula
     */
    public String getTrinomial_Subset_Formula() {
        String Trinomial_Subset_Formula = "\t    n!\n\t____________\n\tk1! k2! k3!";

        return Trinomial_Subset_Formula + "\n\nn = pool size\nk1 = subset size 1"
                + "\tk2 = subset size 2\t k3 = subset size 3";
    }

    /**
     * This method gets subset formula
     * 
     * @return subset formula
     */
    public String getSubset_Formula() {
        String Subsets_Formula = "  \t   n!\n\t___________\n\tk!(n - k)!";

        return Subsets_Formula + "\n\nn = pool size\tk = subset size\t('n choose k')";
    }

    /**
     * This method gets tuple formula
     * 
     * @return tuple formula
     */
    public String getTupleFormula() {
        String Tuples_Formula = "     T^S";

        return Tuples_Formula + "\n\nT = Slots / Targets / Range\nS = Options / Arrows / Domain";
    }

    /**
     * This method gets handshake formula
     * 
     * @return handshake formula
     */
    public String getHandShakeFormula() {
        String Handshake_Formula = "(n + 1)(n)\n_________\n    2";

        return Handshake_Formula + "\n\nn = ending value (People to shake hands) ";
    }

    /**
     * This method gets permutation formula
     * 
     * @return permutation formula
     */
    public String getPermutationFormula() {
        String Permutations_Formula = "   n!\n___________\n (n-k)!";

        return Permutations_Formula + "\n\nn = slots\tk = options";
    }
}
