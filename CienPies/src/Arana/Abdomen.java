package Arana;

public class Abdomen {
    private Hilera hilera;

    public Abdomen() {
        this.hilera = new Hilera();
    }

    public void fabricarRed() {
        System.out.println("[Abdomen] Ordenando crear trampa...");
        hilera.tejerTela();
    }
}
