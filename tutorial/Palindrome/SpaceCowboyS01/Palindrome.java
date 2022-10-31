package tutorial.Palindrome.SpaceCowboyS01;

public class Palindrome {
    static boolean isPalindrome(String s) {
        char[] v = s.toCharArray();
        for (int i = 0; i < v.length / 2; i++)
            if (v[i] != v[v.length - 1 - i])
                return false;

        return true;
    }
}
