package Molecula;

public class MoleculaAgua {
    private String nombre;
    private Hidrogeno[] hidrogenos;
    private Oxigeno oxigeno;

    public MoleculaAgua() {
        this.nombre = "Agua";
        // Composición fuerte: se instancian aquí
        this.hidrogenos = new Hidrogeno[2];
        this.hidrogenos[0] = new Hidrogeno();
        this.hidrogenos[1] = new Hidrogeno();
        this.oxigeno = new Oxigeno();
    }

    public double calcularPesoMolecular() {
        double pesoH = hidrogenos[0].pesoAtomico() * 2; // O sumar los dos
        double pesoO = oxigeno.pesoAtomico();
        return pesoH + pesoO;
    }
}
