package jardinbotanicoparcial;

public class Arbol extends Planta {

    private int alturaMaxima;

    public Arbol(String nombre, String ubicacion, String clima, int alturaMaxima) {
        super(nombre, ubicacion, clima);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " Ubicacion: " + super.getUbicacion() + " Clima: " + super.getClima() + " Alura Maxima: " + alturaMaxima;
    }

}
