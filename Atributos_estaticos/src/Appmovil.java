public class Appmovil {
    private String nombre;
    private String proveedor;
    private int versionActual;//atriburo de instancia, es propio de cada instancia de clase
    public static int ultimaVersion; // varible de clse= es igual a todas las intancias
    //final int ultimaVersion = 0
    //para convertirlo en constante(es decir que no camnbie, tengo q usar la palabra final)

    //sobrescritura del metodo constuctor
    //usando polimorfismo
    public Appmovil(String nombre,String proveedor){
        this.nombre = nombre;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getVersionActual() {
        return versionActual;
    }

    public void setVersionActual(int versionActual) {
        this.versionActual = versionActual;
    }

    public int actualizar(){
        return versionActual++;
    }

    public String consultarActualizacion() {
        if (versionActual < ultimaVersion) {
            return "Aplicacion atrasada. Actualizacion disponible.";
        } else {
            return "Aplicacion en su ultima version.";
        }
    }

}
