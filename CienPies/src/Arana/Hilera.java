package Arana;

public class Hilera implements ITejedor {
    private String seda;

    public Hilera() {
        this.seda = "Seda resistente";
    }

    @Override
    public void tejerTela() {
        System.out.println("Hilera produciendo " + seda + "...");
    }
}
