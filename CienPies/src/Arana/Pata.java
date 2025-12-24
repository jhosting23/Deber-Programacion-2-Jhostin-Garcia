package Arana;

public class Pata implements IMovimiento {
    private int numero;

    public Pata(int numero) {
        this.numero = numero;
    }

    @Override
    public void mover() {
        System.out.println("Pata #" + numero + " moviéndose.");
    }
}
