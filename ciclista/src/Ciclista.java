public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private double tiempoCarrera;

    public Ciclista(int identificador, String nombre, double tiempoCarrera) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    public Ciclista() {
    }

    public int getIdentificador( ) {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre( ) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoCarrera( ) {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }


    public abstract void imprimir();


    @Override
    public String toString( ) {
        return "Ciclista{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", tiempoCarrera=" + tiempoCarrera +
                '}';
    }
}
