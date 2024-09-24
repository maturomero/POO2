public class PasajeAereos extends AgenciaViajes{
    public PasajeAereos(int codigo, String descripcion, double precioBase) {
        super(codigo, descripcion, precioBase * 1.01);
    }

}
