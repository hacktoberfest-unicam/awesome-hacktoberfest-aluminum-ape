package tutorial.LetterCount.CarmineMarchesani_LetterCount;

public class LetterCounter {
    private String name;

    public LetterCounter(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public int getVowels() {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' ||
                    name.charAt(i) == 'o' || name.charAt(i) == 'u' ||
                    name.charAt(i) == 'A' || name.charAt(i) == 'E' ||
                    name.charAt(i) == 'I' || name.charAt(i) == 'O' ||
                    name.charAt(i) == 'U')
                counter++;

        }
        return counter;
    }

    public int getConsonants()
    {
        int counter = 0;
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) >= 65 && name.charAt(i) <= 90 &&
                    !(
                            name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' ||
                                    name.charAt(i) == 'o' || name.charAt(i) == 'u' ||
                                    name.charAt(i) == 'A' || name.charAt(i) == 'E' ||
                                    name.charAt(i) == 'I' || name.charAt(i) == 'O' ||
                                    name.charAt(i) == 'U'))
                counter ++;
        }
        return counter;
    }

    public int getBlanks() {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                counter++;
        }
        return counter;
    }
}

