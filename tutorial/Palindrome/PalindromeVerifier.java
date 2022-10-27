
/**
 * This class will verify if a string is a palindrome.
 * @author Enrico Ulissi
 */

public class PalindromeVerifier {

    private PalindromeVerifier() {
        // This class is not meant to be instantiated
    }

    /**
     * Verifies if the input string is a palindrome
     * @param input the string to be verified
     * @return true if the input string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }
}
