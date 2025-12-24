package Arana;

public class Ojo {
    private int posicion;

    public Ojo(int posicion) {
        this.posicion = posicion;
    }

    public void mirar() {
        System.out.println("Ojo #" + posicion + " vigilando.");
    }
}
