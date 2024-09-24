public class Generico extends Medicamento{
    private String droga;
    public Generico(String nombre, String descripcion, String composicionDeDroga, double precio, int stock, String droga) {
        super(nombre, descripcion, composicionDeDroga, precio*0.95, stock);
        this.droga = droga;
    }

    public String getDroga() {
        return droga;
    }

    public void setDroga(String droga) {
        this.droga = droga;
    }
}
