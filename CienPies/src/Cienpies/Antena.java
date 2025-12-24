package Cienpies;
public class  Antena implements  IMovimiento {

    private String lado;

    public Antena(String lado){
        this.lado=lado;
    }
@Override
public void mover(){
    System.out.println("La antena "+ lado + "Detectando entorno");
}
}
