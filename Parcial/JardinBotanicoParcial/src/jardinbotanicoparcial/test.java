package jardinbotanicoparcial;

import javax.management.RuntimeErrorException;

public class test {

    public static void main(String[] args) {
        JardinBotanico b1 = new JardinBotanico();

        Planta arb1 = new Arbol("Ficus", "balcon", "viento", 20);
        Planta arb2 = new Arbol("Pedro", "pieza", "seco", 20);
        Planta arb3 = new Arbol("Ficud", "balcon", "viento", 20);
        Planta ab1 = new Arbusto("juan","verde","pieza",20);
        Planta f1 = new Flor("flor","amarillo","mouse",TemporadaFlorecimiento.INVIERNO);

        try {
            b1.agregarPlanta(arb1);
            b1.agregarPlanta(arb2);
            b1.agregarPlanta(arb3);
            b1.agregarPlanta(ab1);
            b1.agregarPlanta(f1);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        b1.mostrarPlantas();
        System.out.println("-----------");
        b1.podarPlantas();

    }

}
