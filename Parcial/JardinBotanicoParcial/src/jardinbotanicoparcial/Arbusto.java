package jardinbotanicoparcial;

public class Arbusto extends Planta {

    private int densidadFollaje;

    public Arbusto(String nombre, String ubicacion, String clima, int densidadFollaje) {
        super(nombre, ubicacion, clima);
        this.densidadFollaje = densidadFollaje;
        
    }
    
    private boolean a(int numero){
        if (numero >= 1 && numero <= 10){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " Ubicacion: " + super.getUbicacion() + " Clima: " + super.getClima() + " Densidad follaje: " + densidadFollaje;
    }

}
