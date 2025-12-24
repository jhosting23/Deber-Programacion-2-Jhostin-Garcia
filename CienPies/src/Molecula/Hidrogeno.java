package Molecula;

public class Hidrogeno extends Atomo {
    public Hidrogeno() {
        super(1);
    }

    @Override
    public double pesoAtomico() {
        return 1.00784;
    }

    @Override
    public String simbolo() {
        return "H";
    }
}
