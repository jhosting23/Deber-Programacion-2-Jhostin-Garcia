package Arana;

public class Arana {
    private String especie;
    private Cuerpo cuerpo;
    private Abdomen abdomen;

    public Arana(String especie) {
        this.especie = especie;
        System.out.println("--- NACE UNA " + especie.toUpperCase() + " ---");
        
        // Composición: La araña crea sus propias partes
        this.cuerpo = new Cuerpo();
        this.abdomen = new Abdomen();
    }

    public void cazar() {
        System.out.println("\n--- MODO CAZA ACTIVADO ---");
        cuerpo.vigilar();
        cuerpo.coordinarMovimiento();
    }

    public void construirHogar() {
        System.out.println("\n--- MODO CONSTRUCCIÓN ---");
        abdomen.fabricarRed();
    }
}
