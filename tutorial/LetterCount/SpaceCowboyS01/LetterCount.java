package tutorial.LetterCount.SpaceCowboyS01;

import java.util.function.*;

public class LetterCount {
    private final String s;

    public LetterCount(String string) {
        this.s = string;
    }

    private boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    private boolean isConsonant(char character) {
        return !isVowel(character) && !isWhitespace(character);
    }

    private boolean isWhitespace(char character) {
        return Character.isWhitespace(character);
    }

    private long countChar(Predicate<Character> predicate) {
        return s.chars()
                .mapToObj(character -> (char) character)
                .filter(predicate)
                .count();
    }

    public long countVowels() {
        return countChar(this::isVowel);
    }

    public long countConsonants() {
        return countChar(this::isConsonant);
    }

    public long countWhitespaces() {
        return countChar(this::isWhitespace);
    }

    public long countOnlyLetter(){
        return countVowels() + countConsonants();
    }
}