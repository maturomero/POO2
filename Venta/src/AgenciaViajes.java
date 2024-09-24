public class AgenciaViajes {
    private int codigo;
    private String descripcion;
    private double precioBase;
    private Cliente [] clientes;
    private int contClientes;
    private Venta [] ventas;

    public AgenciaViajes(int codigo, String descripcion, double precioBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        clientes = new Cliente[5];
    }

    public int getCodigo( ) {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion( ) {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase( ) {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Cliente[] getClientes( ) {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getContClientes( ) {
        return contClientes;
    }

    public void setContClientes(int contClientes) {
        this.contClientes = contClientes;
    }


    public void aniadirCliente(Cliente cliente){
        clientes[contClientes] =  cliente;
        contClientes++;
    }
    private Cliente verificacionCliente(int dni){
        boolean bandera = false;
        Cliente valor = null;
        for (int i = 0; i < clientes.length && clientes[i] != null && !bandera; i++){
            if(clientes[i].getDni() == dni){
                bandera = true;
                valor = clientes[i];
            }
        }
        if (!bandera){
            Cliente clientex = new Cliente("nombre",dni);
            aniadirCliente(clientex);
        }
        return valor;

    }

    private double creacionVenta(int dni,AgenciaViajes producto, int cantidad){
        Cliente cliente = verificacionCliente(dni);
        Venta venta = new Venta(cliente, contClientes, producto,cantidad);
        return producto.precioBase * cantidad;
    }

    public double articuloVenta(int dni,AgenciaViajes producto, int cantidad){
        double valor = creacionVenta(dni, producto, cantidad);
        double sumaTotal = valor;
        return sumaTotal;
    }


}
