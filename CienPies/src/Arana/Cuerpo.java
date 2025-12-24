package Arana;

import java.util.ArrayList;
import java.util.List;

public class Cuerpo {
    private List<Pata> patas;
    private List<Ojo> ojos;

    public Cuerpo() {
        this.patas = new ArrayList<>();
        this.ojos = new ArrayList<>();

        // Crear 8 patas
        for (int i = 1; i <= 8; i++) {
            patas.add(new Pata(i));
        }

        // Crear 8 ojos
        for (int i = 1; i <= 8; i++) {
            ojos.add(new Ojo(i));
        }
    }

    public void coordinarMovimiento() {
        System.out.println("[Cuerpo] Iniciando marcha de 8 patas:");
        for (Pata p : patas) {
            p.mover();
        }
    }

    public void vigilar() {
        System.out.println("[Cuerpo] Activando visión octocular:");
        for (Ojo o : ojos) {
            o.mirar();
        }
    }
}
