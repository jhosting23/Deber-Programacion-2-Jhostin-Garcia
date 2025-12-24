package Molecula;

public class Oxigeno extends Atomo {
    public Oxigeno() {
        super(8);
    }

    @Override
    public double pesoAtomico() {
        return 15.999;
    }

    @Override
    public String simbolo() {
        return "O";
    }
}
