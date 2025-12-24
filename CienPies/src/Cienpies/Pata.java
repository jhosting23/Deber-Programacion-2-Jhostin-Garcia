package Cienpies;

class Pata implements IMovimiento {
    private String lado;
    private Veneno veneno; 

    public Pata(String lado, boolean esVenenosa) {
        this.lado = lado;
        if (esVenenosa) {
            this.veneno = new Veneno(100, "Neurotoxina");
        } else {
            this.veneno = null;
        }
    }

    @Override
    public void mover() {
        System.out.print(" Pata " + lado + " avanzando.");
        if (veneno != null) {
            System.out.print(" [Cuidado: VENENOSA]");
        }
        System.out.println();
    }
    public void atacar() {
        if (veneno != null) {
            veneno.inyectar();
        }
    }
}