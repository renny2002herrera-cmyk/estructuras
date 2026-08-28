import java.util.Arrays;

public class MisAlgoritmos implements Busquedas, Ordenamientos {

    @Override
    public int linearSearch(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arreglo, int objetivo) {
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);
        Arrays.sort(copia);

        int inicio = 0;
        int fin = copia.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (copia[medio] == objetivo) {
                return medio;
            }

            if (copia[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    @Override
    public int[] bubbleSort(int[] arreglo) {
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int temporal = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temporal;
                }
            }
        }

        return copia;
    }

    @Override
    public int[] selectionSort(int[] arreglo) {
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);

        for (int i = 0; i < copia.length - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < copia.length; j++) {
                if (copia[j] < copia[menor]) {
                    menor = j;
                }
            }

            int temporal = copia[i];
            copia[i] = copia[menor];
            copia[menor] = temporal;
        }

        return copia;
    }

    @Override
    public int[] quickSort(int[] arreglo) {
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);
        quickSort(copia, 0, copia.length - 1);
        return copia;
    }

    private void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arreglo, inicio, fin);
            quickSort(arreglo, inicio, pivote - 1);
            quickSort(arreglo, pivote + 1, fin);
        }
    }

    private int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }

    @Override
    public int[] mergeSort(int[] arreglo) {
        if (arreglo.length <= 1) {
            return arreglo;
        }

        int mitad = arreglo.length / 2;
        int[] izquierda = mergeSort(Arrays.copyOfRange(arreglo, 0, mitad));
        int[] derecha = mergeSort(Arrays.copyOfRange(arreglo, mitad, arreglo.length));

        return mezclar(izquierda, derecha);
    }

    private int[] mezclar(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            resultado[k++] = izquierda[i] <= derecha[j] ? izquierda[i++] : derecha[j++];
        }

        while (i < izquierda.length) resultado[k++] = izquierda[i++];
        while (j < derecha.length) resultado[k++] = derecha[j++];

        return resultado;
    }
}