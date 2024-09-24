public class Medicamento {
    public String nombre;
    private String descripcion;
    private String composicionDeDroga;
    public double precio;
    private boolean estado;
    private int stock;

    public Medicamento(String nombre, String descripcion, String composicionDeDroga, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.composicionDeDroga = composicionDeDroga;
        this.precio = precio;
        this.estado = false;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComposicionDeDroga() {
        return composicionDeDroga;
    }

    public void setComposicionDeDroga(String composicionDeDroga) {
        this.composicionDeDroga = composicionDeDroga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean obtenerEstado() {
        return estado;
    }

    public void aprobarMedicamento() {
        this.estado = true;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String realizarCompra(int cantidadCompra){
        if (stock>=cantidadCompra){
            stock-=cantidadCompra;
            return "COMPRA EXITOSA";
        }
        return "COMPRA FALLIDA";
    }

}
