import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        System.out.println("Lineal: " + misAlgoritmos.linearSearch(miArray, 11));
        System.out.println("binary: " + misAlgoritmos.binarySearch(miArray));
        System.out.println("bubble sort: " + Arrays.toString(misAlgoritmos.bubbleSort(miArray)));
        System.out.println("selection sort: " + Arrays.toString(misAlgoritmos.selectionSort(miArray)));
    }
}

