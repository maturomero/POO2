public class Cliente {
    private String nombre;
    private int dni;
    private int numeroVenta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.numeroVenta = Venta.numeroVenta;
    }

    public String getNombre( ) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni( ) {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumeroVenta( ) {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
}
