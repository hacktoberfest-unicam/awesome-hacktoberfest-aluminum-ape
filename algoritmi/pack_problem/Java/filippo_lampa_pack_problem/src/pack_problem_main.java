import java.util.Scanner;

/**
 * @author Filippo Lampa
 */
public class pack_problem_main {

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

    public static int[] calculateBlocks(double smallWeight, double largeWeight, double backpackSize){
        for(int i=0; i<backpackSize; i++){
            for(int j=0; j<backpackSize; j++){
                if(i * smallWeight + j * largeWeight == backpackSize) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("Cannot calculate a solution");
    }

}
