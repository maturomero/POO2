public class Main {
    public static void main(String[] args) {

        AgenciaViajes producto = new PasajeAereos(21,"volar",10);

        System.out.println(producto.articuloVenta(45,producto,5));
    }
}