package Cienpies;
public class Segmmento {
    private int numeroOrden;
    
    // COMPOSICIÓN: Cada segmento tiene estrictamente 2 patas
    private Pata pataIzq;
    private Pata pataDer;

    public Segmmento(int numero) {
        this.numeroOrden = numero;
        boolean tieneVeneno = (numero == 1); 

        this.pataIzq = new Pata("Izquierda", tieneVeneno);
        this.pataDer = new Pata("Derecha", tieneVeneno);
    }

    public void coordinarPatas() {
        System.out.println(" -- Segmento #" + numeroOrden + " --");
        pataIzq.mover();
        pataDer.mover();
    }
}