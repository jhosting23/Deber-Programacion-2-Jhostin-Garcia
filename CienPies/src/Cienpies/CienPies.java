package Cienpies;
import java.util.ArrayList;
import java.util.List;

public class CienPies {
    private String especie;
    
    private Cabeza cabeza;
    private List<Segmmento> cuerpo;

    public CienPies(String especie, int cantidadSegmentos) {
        this.especie = especie;
        System.out.println("Naciendo un " + especie + "...");
        this.cabeza = new Cabeza();
        this.cuerpo = new ArrayList<>();
        
        for (int i = 1; i <= cantidadSegmentos; i++) {
            cuerpo.add(new Segmmento(i));
        }
    }

    public void deambular() {
        System.out.println("\n--- " + especie + " INICIANDO MARCHA ---");
        cabeza.mover();
        for (Segmmento seg : cuerpo) {
            seg.coordinarPatas();
        
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}