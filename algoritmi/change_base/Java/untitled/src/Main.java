import java.util.Scanner;
import java.lang.Math;

// Strategia: Convertire tutto in decimale e poi convertirlo nella base desiderata

public class Main {
    public static void main(String[] args) {
        // Inizializzazione stdin
        Scanner scanner = new Scanner(System.in);
        String num, ris = "";
        int bi, bf;

        // Selezione della base corrente
        do {
            System.out.println("In quale base inserirai il numero?");
            System.out.println("[0] HEX");
            System.out.println("[1] OCT");
            System.out.println("[2] DEC");
            System.out.println("[3] BIN");
            bi = scanner.nextInt();
            scanner.nextLine(); // Leggo \n di troppo dal flusso
        }while(bi < 0 || bi > 3);

        // Inserimento del numero
        do {
            System.out.println("Inserisci il numero da convertire: ");
            num = scanner.nextLine();
        } while(!isValid(num, bi));

        // Inserimento della base da convertire
        do {
            System.out.println("In quale base vuoi convertire il numero?");
            System.out.println("[0] HEX");
            System.out.println("[1] OCT");
            System.out.println("[2] DEC");
            System.out.println("[3] BIN");
            bf = scanner.nextInt();
        }while(bf < 0 || bf > 3);

        // Conversione
        switch (bf)
        {
            case 0:
                ris = decToHex(dec(num, bi));
                break;

            case 1:
                ris = decToOct(dec(num, bi));
                break;

            case 2:
                ris = String.valueOf(dec(num, bi));
                break;

            case 3:
                ris = decToBin(dec(num, bi));
                break;
        }

        // Stampa del risultato
        System.out.println("Il numero convertito e' ugule a: " + ris);
    }

    private static boolean isHex(String s)
    {
        s = s.toUpperCase();
        char[] v = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
            if(v[i] < '0' || v[i] > 'F')
                return false;

        return true;
    }

    private static boolean isOct(String s)
    {
        char[] v = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
            if(v[i] < '0' || v[i] > '7')
                return false;

        return true;
    }

    private static boolean isDec(String s)
    {
        char[] v = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
            if(v[i] < '0' || v[i] > '9')
                return false;

        return true;
    }

    private static boolean isBin(String s)
    {
        char[] v = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
            if(v[i] < '0' || v[i] > '1')
                return false;

        return true;
    }

    private static boolean isValid(String s, int b)
    {
        switch (b)
        {
            case 0:
                return isHex(s);

            case 1:
                return isOct(s);

            case 2:
                return isDec(s);

            case 3:
                return isBin(s);
        }

        return false;
    }

    private static int hexToDec(String s)
    {
        int  n = 0;
        char[] v = s.toCharArray();

        for(int i = v.length-1; i >= 0; i--)
            if(v[i] >= '0' && v[i] <= '9')
                n += Integer.valueOf(v[i] - 48) * (int)(Math.pow(16, v.length-1-i));
            else
                n += (v[i] - 'A' + 10) * (int)(Math.pow(16, v.length-1-i));

        return n;
    }

    private static int octToDec(String s)
    {
        int  n = 0;
        char[] v = s.toCharArray();

        for(int i = v.length-1; i >= 0; i--)
            n += Integer.valueOf(v[i] -48) * (int)(Math.pow(8, v.length-1-i));

        return n;
    }

    private static int binToDec(String s)
    {
        int  n = 0;
        char[] v = s.toCharArray();

        for(int i = v.length-1; i >= 0; i--)
            n += Integer.valueOf(v[i] - 48) * (int)(Math.pow(2, v.length-1-i));

        return n;
    }

    private static String decToHex(int n)
    {
        String s = "";

        while(n > 0)
        {
            int r = n%16;

            if(r < 10)
                s = r + s;
            else
                s = ('A' + r - 10) + s;

            n = n/16;
        }

        return s;
    }

    private static String decToOct(int n)
    {
        String s = "";

        while(n > 0)
        {
            int r = n%8;
            s = r + s;
            n = n/8;
        }

        return s;
    }

    private static String decToBin(int n)
    {
        String s = "";

        while(n > 0)
        {
            int r = n%2;
            s = r + s;
            n = n/2;
        }

        return s;
    }

    private static int dec(String s, int b)
    {
        int n = 0;

        switch(b)
        {
            case 0:
                return hexToDec(s);

            case 1:
                return octToDec(s);

            case 2:
                return Integer.valueOf(s);

            case 3:
                return binToDec(s);
        }

        return n;
    }
}