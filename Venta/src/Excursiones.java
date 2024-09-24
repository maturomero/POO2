public class Excursiones extends AgenciaViajes{
    public Excursiones(int codigo, String descripcion, double precioBase) {
        super(codigo, descripcion, precioBase + 20);
    }
}
