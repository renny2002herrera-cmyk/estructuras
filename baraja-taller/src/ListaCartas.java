import java.util.Random;

public class ListaCartas {

    private carta cabeza;
    private int tamano;

    public ListaCartas() {
        cabeza = null;
        tamano = 0;
    }

    public void agregar(carta nueva) {

        if (cabeza == null) {
            cabeza = nueva;
        } else {

            carta actual = cabeza;

            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nueva);
        }

        tamano++;
    }

    public void mostrar() {

        carta actual = cabeza;

        while (actual != null) {
            System.out.println(actual);
            actual = actual.getSiguiente();
        }
    }

    public int tamano() {
        return tamano;
    }

    public void crearBaraja() {

        String[] palos = {
                "Corazones",
                "Diamantes",
                "Tréboles",
                "Picas"
        };

        for (int i = 0; i < palos.length; i++) {

            for (int j = 1; j <= 13; j++) {

                carta nueva = new carta(j, palos[i]);

                agregar(nueva);
            }
        }
    }

    public void revolver() {

        carta[] cartas = new carta[tamano];

        carta actual = cabeza;

        for (int i = 0; i < tamano; i++) {
            cartas[i] = actual;
            actual = actual.getSiguiente();
        }

        Random random = new Random();

        for (int i = tamano - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            carta temporal = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temporal;
        }

        cabeza = cartas[0];

        for (int i = 0; i < tamano - 1; i++) {
            cartas[i].setSiguiente(cartas[i + 1]);
        }

        cartas[tamano - 1].setSiguiente(null);
    }

    public carta sacarCartaRandom() {

        if (cabeza == null) {
            return null;
        }

        Random random = new Random();
        int posicion = random.nextInt(tamano);

        if (posicion == 0) {
            carta sacada = cabeza;
            cabeza = cabeza.getSiguiente();
            sacada.setSiguiente(null);
            tamano--;
            return sacada;
        }

        carta anterior = cabeza;

        for (int i = 0; i < posicion - 1; i++) {
            anterior = anterior.getSiguiente();
        }

        carta sacada = anterior.getSiguiente();

        anterior.setSiguiente(sacada.getSiguiente());
        sacada.setSiguiente(null);

        tamano--;

        return sacada;
    }
}