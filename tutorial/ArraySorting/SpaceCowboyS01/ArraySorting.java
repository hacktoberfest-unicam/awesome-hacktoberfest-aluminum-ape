package tutorial.ArraySorting.SpaceCowboyS01;
import java.util.Arrays;

public class ArraySorting {
    private void sortAnArray(int[] array){
        System.out.println("This little maneuver is gonna cost us 51 years.");
        while(!isSorted(array))
            for (int i = 0; i < array.length; i++)
                swap(array, i, (int)(Math.random() * i));
        System.out.println("ehm, 52 years...");
    }
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private boolean isSorted(int[] array){
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++)
                if (array[i] > array[i + 1])
                    return false;
        }
        return true;
    }
}
