package jardinbotanicoparcial;

public abstract class Planta {

    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }

    protected String getNombre() {
        return nombre;

    }

    protected String getUbicacion() {
        return ubicacion;
    }

    protected String getClima() {
        return clima;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Planta other = (Planta) o;
        return other.nombre.equals(nombre) && other.ubicacion.equals(ubicacion);
    }

}
