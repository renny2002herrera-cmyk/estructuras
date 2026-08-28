import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] miArray = {70, 12, 19, 45, 11, 33, 26};

        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        System.out.println("Lineal: " +
                misAlgoritmos.linearSearch(miArray, 11));

        System.out.println("Binaria: " +
                misAlgoritmos.binarySearch(miArray, 12));

        System.out.println("Bubble sort: " +
                Arrays.toString(misAlgoritmos.bubbleSort(miArray)));

        System.out.println("Selection sort: " +
                Arrays.toString(misAlgoritmos.selectionSort(miArray)));
        System.out.println("Quick sort: " +
                Arrays.toString(misAlgoritmos.quickSort(miArray)));

        System.out.println("Merge sort: " +
                Arrays.toString(misAlgoritmos.mergeSort(miArray)));
    }
}