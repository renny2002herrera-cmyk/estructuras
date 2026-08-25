public class MisAlgoritmos implements Busquedas,Ordenamientos {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        for (int i = 0; i < arrayPorExplorar.length; i++) {
            if (arrayPorExplorar[i] == elementoABuscar) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar) {
        return 0;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temporal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporal;
                }
            }
        }
        return array;
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();
        for (int i = 0; i < array.length - 1; i++) {
            int posicionMenor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[posicionMenor]) {
                    posicionMenor = j;
                }
            }
            {
                int temporal = array[i];
                array[i] = array[posicionMenor];
                array[posicionMenor] = temporal;

            }
        }
        return array;
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}

