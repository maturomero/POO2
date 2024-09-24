public class DeLaboratorio extends Medicamento{
    private String nombreLaboratorio;

    public DeLaboratorio(String nombre, String descripcion, String composicionDeDroga, double precio,int stock, String nombreLaboratorio) {
        super(nombre, descripcion, composicionDeDroga, precio*1.02, stock);
        this.nombreLaboratorio = nombreLaboratorio;
    }

    public String getNombreLaboratorio() {
        return nombreLaboratorio;
    }

    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

}
