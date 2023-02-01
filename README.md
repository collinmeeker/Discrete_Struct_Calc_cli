# Discrete Structures Calculator
This calculator is a command line based application that does multiple types of calculations that are done in Discrete Structures. 

## Installation
If you would like to download this application, please use the link below!

```
https://github.com/collinmeeker/Discrete_Struct_Calc_cli
```
## Table of Contents:
This application features the following calculations:
###  Counting
- Multisets
- Trinomial Subsets
- Subsets
- Tuples
- Permutations
- Handshake
- Binomial Theorem
- Subsets(multiple k)
- Tower of Hanoi
### Modulus/GCD
- Modulus
- Caesar Cipher: Encryption
- Caesar Cipher: Decryption
- Binary/BaseX Conversions: 
   - Binary to Decimal Conversion 
   - Decimal to Binary Conversion
   - Base X to Decimal Conversion
   - Decimal to Base X Conversion
- Smallest Integer Congruence
- Finding GCD
- Reverse GCD
- Modular Inverse
## Code Snippets:
Example of Base X to Decimal Conversion:
```java
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
```
Example of Caesar Cipher Encryption:
```java
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
```
Example of Binimial Theorem Calculation:
```java
 public double Binomial_Theorem(double expanded_exponent, double constantX, double constant,
            double exponent_power_needed) { 
        // x is the total pool total pool = exponent
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
``` 
## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.
## Creator 
Collin Meeker - Computer Science Major at Rowan University 

Logic inspired by material from my Discrete Structures course.
## License

[MIT](https://choosealicense.com/licenses/mit/)
