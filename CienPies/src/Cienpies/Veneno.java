package Cienpies;
public class Veneno {
    private int potencia;
    private String tipo;

    public Veneno(int potencia , String tipo) {
        this.tipo=tipo;
        this.potencia=potencia;
    }

    public void inyectar (){
        System.out.println("Se esta inyectando Veneno de"+ tipo + "Potencia" + potencia);
    }

    
}
