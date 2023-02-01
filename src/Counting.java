import java.math.BigInteger;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is resonsible for calculating the answers for the counting menu.
 * 
 */
public class Counting {
    public ArrayList<Integer> subsetKValues = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);

    /**
     * Method made to calcuate the factorial of a number
     * 
     * @param n is the number you want the factorial of
     * @return value of factorial
     */
    private double Factorial(double n) {
        double sample = 1;
        for (int i = 0; i < n; i++) {
            sample = sample * (n - i);
        }
        return sample;
    }

    // n is equal to disks needed to move
    /**
     * This method calculates the amount of disks you need to move using recursion
     * 
     * @param n              is for the amount of disks you want to move
     * @param count          is set to 1 and helps with the base case
     * @param previousAnswer is set to 0 and stores the previous answer
     */
    public void TowerOfHanoi(double n, int count, double previousAnswer) {
        // start is 1
        double newAnswer;
        newAnswer = 2 * previousAnswer + 1;
        if (count > n - 1) {
            System.out.println(newAnswer);
            return;
        }
        previousAnswer = newAnswer;
        count++;

        TowerOfHanoi(n, count, previousAnswer);
    }

    // x is for exponent
    /**
     * This method finds the constant of the term you want when fully expanded
     * 
     * @param expanded_exponent     is the exponent of the binomial given
     * @param constantX             is the variables contant in given binomial you
     *                              want to expand
     * @param constant              is the value of the constant in the given
     *                              binomial
     * @param exponent_power_needed is the exponent for the term you want the
     *                              constant of
     * @return the constant of the exponent_power_needed variable after binomial is
     *         fully expanded
     */
    public double Binomial_Theorem(double expanded_exponent, double constantX, double constant,
            double exponent_power_needed) { // x is the total pool total pool = exponent
        // (a+b)^x = (x choose 0)a^(x-0) (b^k) + (x-1 choose 1)a^(x-1) (b^1) + (x choose
        // 2)a^(x-2) (b^2)

        double answer = 0;
        // for(double i = 0; i < expanded_exponent; i++ ) {
        answer = (Subsets(expanded_exponent, expanded_exponent - exponent_power_needed))
                * Math.pow(constantX, exponent_power_needed)
                * Math.pow(constant, expanded_exponent - exponent_power_needed);
        // } expanded_exponent - exponent needed
        return answer;
    }

    /**
     * This method calculates mutlisets.
     * 
     * @param n is the pool size
     * @param k is the subset size
     * @return value of the multiset calculation as a double value
     */
    public double Multisets(double n, double k) {

        double answer;
        double x = (n + k - 1);
        answer = (Factorial(x)) / (Factorial(k) * (Factorial(n - 1)));

        return answer;
    }

    /**
     * This method calculates trinomial subsets.
     * 
     * @param n  is the pool size
     * @param k1 is for subset size 1
     * @param k2 is for subset size 2
     * @param k3 is for subset size 3
     * @return the value of the trinomial value as a double
     */
    public double TrinomialSubsets(double n, double k1, double k2, double k3) {
        double answer;
        answer = Factorial(n) / (Factorial(k1) * Factorial(k2) * Factorial(k3));
        return answer;
    }

    /**
     * This method calculates subsets calculations for at least 2 subset sizes
     * 
     * @param n  is the pool size
     * @param k1 is subset size 1
     * @param k2 is subset size 2
     * @return the value of the subset as a double
     */
    public double More_Subsets(double n, double k1, double k2) {

        double More_Subsets_Answer;
        int x = 0;
        double bottom = Factorial(k1) * (k2);
        System.out.println("Press '1' to calculate or '2' to add another k value.");
        int k_answer = in.nextInt();
        if (k_answer == 2) {
            while (true) {
                System.out.println("Enter k value: ");
                int Kx = in.nextInt();
                subsetKValues.add(Kx);
                x++; // keeps track of added values for the for loop
                System.out.println("Press '1' to calulate solution or Press '2' to enter another k value.");
                int another_k = in.nextInt();
                if (another_k == 2) {
                    continue;
                } else {
                    break;
                }

            }
            for (int i = 0; i < x; i++) {
                bottom = (bottom * Factorial(subsetKValues.get(i)));
            }

        } else {
        }
        More_Subsets_Answer = Factorial(n) / bottom;
        subsetKValues.clear();
        return More_Subsets_Answer;
    }

    /**
     * This method calculates subsets with one k value ('n choose k')
     * 
     * @param n is the pool size
     * @param k is the subset size
     * @return the value of the subset calculation as a double
     */
    public double Subsets(double n, double k) {
        double subsetAnswer = 1;
        double nk = n - k;

        subsetAnswer = Factorial(n) / (Factorial(k) * Factorial(nk));
        return subsetAnswer;
    }

    /**
     * Calculates tuple value
     * 
     * @param slots        is the amount of items being picked from the total pool
     * @param totalOptions is the amount of items in total pool
     * @return the value of tuple calculation as a double
     */
    public double Tuples(double slots, double totalOptions) {
        double tupleAnswer = 1;

        for (int i = 0; i < slots; i++) {
            tupleAnswer = tupleAnswer * (totalOptions);
        }
        return tupleAnswer;
    }

    /**
     * Calculates permutation value
     * 
     * @param slots        is the amount of items being picked from the total pool
     * @param totalOptions is the amount of items in total pool
     * @return the value of permutation calculation as a double
     */
    public double Permutations(double slots, double totalOptions) {
        double permAnswer = 1;
        for (int i = 0; i < slots; i++) {
            permAnswer = permAnswer * (totalOptions - i);
        }
        return permAnswer;
    }

    /**
     * Calulates handshake value
     * 
     * @param n is ending value (people to shake hands)
     * @return the value of handshake calculation as a double
     */
    public double Handshake(double n) {
        double answer;
        answer = ((n + 1) * (n)) / 2;
        return answer;
    }

    /**
     * Calculates handshake value
     * 
     * @param n is ending value (people to shake hands)
     * @return the value of handshake calcualtion as a BigInteger
     */
    public BigInteger Hand(long n) {
        // allows int n to pass through as BigInteger
        BigInteger X;
        BigInteger N;
        BigInteger B;

        BigInteger Answer;

        X = BigInteger.valueOf(2);
        N = BigInteger.valueOf(n);
        B = BigInteger.valueOf(1);
        Answer = ((N.add(B)).multiply(N)).divide(X);

        return Answer;
    }

}
