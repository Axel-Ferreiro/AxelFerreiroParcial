package jardinbotanicoparcial;

public class Flor extends Planta {

    private TemporadaFlorecimiento temporada;

    public Flor(String nombre, String ubicacion, String clima, TemporadaFlorecimiento temporada) {
        super(nombre, ubicacion, clima);
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " Ubicacion: " + super.getUbicacion() + " Clima: " + super.getClima() + " Temporada: " + temporada;
    }

}
