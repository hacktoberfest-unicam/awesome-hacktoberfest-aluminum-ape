import java.util.function.*;

public class Counter {
    private final String s;

    public Counter(String s) {
        this.s = s;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private boolean isConsonant(char c) {
        return !isVowel(c) && !isWhitespace(c);
    }

    private boolean isWhitespace(char c) {
        return Character.isWhitespace(c);
    }

    private long countCharThatSatisfy(Predicate<Character> predicate) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(predicate)
                .count();
    }

    public long countVowels() {
        return countCharThatSatisfy(this::isVowel);
    }

    public long countConsonants() {
        return countCharThatSatisfy(this::isConsonant);
    }

    public long countWhitespaces() {
        return countCharThatSatisfy(this::isWhitespace);
    }

}
