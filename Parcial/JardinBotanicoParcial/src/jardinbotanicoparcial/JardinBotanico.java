package jardinbotanicoparcial;

import java.util.ArrayList;

public class JardinBotanico {

    private ArrayList<Planta> plantas = new ArrayList<>();

    public void agregarPlanta(Planta planta) {
        if (planta == null) {
            throw new NullPointerException("No es una planta");
        }
        if (plantas.contains(planta)) {
            throw new PlantaRepetidaException();
        }
        plantas.add(planta);

    }

    public void mostrarPlantas() {
        if (plantas.isEmpty()) {
            System.out.println("No hay plantas en la lista.");
        }
        for (Planta planta : plantas) {
            System.out.println(planta);
        }
    }

    public void podarPlantas() {
        for (Planta p1 : plantas) {
            if (p1 instanceof Arbol || p1 instanceof Arbusto) {
                System.out.println("Podando " + p1.getNombre());
            } else {
                System.out.println("No se puede podar " + p1.getNombre());
            }
        }

    }

}
