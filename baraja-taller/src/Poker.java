public class Poker {

    public static void main(String[] args) {

        ListaCartas baraja = new ListaCartas();

        baraja.crearBaraja();

        baraja.mostrar();

        System.out.println("Cantidad de cartas: " + baraja.tamano());

        carta carta = baraja.sacarCartaRandom();

        System.out.println("Carta sacada: " + carta);
        System.out.println("Quedan: " + baraja.tamano());
    }
}