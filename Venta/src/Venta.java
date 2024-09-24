public class Venta {
    private Cliente cliente;
    static int numeroVenta;
    private AgenciaViajes productos;

    public Venta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Venta(Cliente cliente, int numeroVenta,  AgenciaViajes productos, int cantidad) {
        this.cliente = cliente;
        this.numeroVenta = numeroVenta;
        this.productos = productos;

    }

    public Cliente getCliente( ) {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroVenta( ) {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public AgenciaViajes getProducto( ) {
        return productos;
    }

    public void setProducto(AgenciaViajes producto) {
        this.productos = producto;
    }



}
