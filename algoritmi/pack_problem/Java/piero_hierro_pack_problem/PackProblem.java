import java.util.Scanner;

public class PackProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert small blocks weight");

        double smallWeight = sc.nextDouble();

        System.out.println("Insert large blocks weight");

        double largeWeight = sc.nextDouble();

        System.out.println("Insert backpack size");

        double backpackSize = sc.nextDouble();

        int[] result = calculateBlocks(smallWeight, largeWeight, backpackSize);

        System.out.println("Number of small blocks: " + result[0] + " Number of large blocks: " + result[1]);
    }

    private static int[] calculateBlocks(double smallWeight, double largeWeight, double backpackSize) {
        int smallBlocks = 0;
        int largeBlocks = 0;
        var remainder = backpackSize;

        largeBlocks = (int) (backpackSize / largeWeight);
        remainder = backpackSize % largeWeight;
        // if there is a remainder, use small blocks
        if (remainder > 0 && smallWeight <= remainder) {
            smallBlocks = (int) (remainder / smallWeight);
            remainder = remainder % smallWeight;
        }

        // return the solution if there is no remainder
        if (remainder == 0)
            return new int[]{smallBlocks, largeBlocks};
        else
            throw new IllegalArgumentException("Cannot find a solution");


    }
}
