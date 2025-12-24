import Arana.Arana;
import Cienpies.*;
public class App {
    public static void main(String[] args) throws Exception {
        CienPies escolopendra = new CienPies("Scolopendra Gigante", 3);
        escolopendra.deambular();
    

        Arana viudaNegra = new Arana("Viuda Negra");
        viudaNegra.construirHogar();
        viudaNegra.cazar();

        System.out.println("\n--- MOLECULA ---");
        Molecula.MoleculaAgua agua = new Molecula.MoleculaAgua();
        System.out.println("Peso molecular del agua: " + agua.calcularPesoMolecular());
        
    }
}
