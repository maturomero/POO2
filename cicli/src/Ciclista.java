public abstract class Ciclista implements Interface{
    private int identificador;
    private String nombre;
    private double tiempo;


    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempo = 0.0;
    }

    public Ciclista() {  // estoy aplicando polimorfismo, utilizo dos firmas distintas, una setea valores y la otra vacia.
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

    public double getTiempo( ) {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    protected abstract void imprimir();


    protected abstract String imprimirTipo();



    @Override
    public String toString( ) {
        return "Ciclista{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
