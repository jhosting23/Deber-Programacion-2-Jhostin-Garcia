package Cienpies;

class Cabeza implements IMovimiento {

    private Antena antenaIzq;
    private Antena antenaDer;

    public Cabeza() {

        this.antenaIzq = new Antena("Izquierda");
        this.antenaDer = new Antena("Derecha");
    }

    @Override
    public void mover() {
        System.out.println("Cabeza guiando el camino...");
        antenaIzq.mover();
        antenaDer.mover();
    }
}