public class carta {

    private final int valor;
    private final String palo;
    private carta integument;

    public carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
        this.integument = null;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    public carta getSiguiente() {
        return integument;
    }

    public void setSiguiente(carta siguiente) {
        this.integument = siguiente;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}