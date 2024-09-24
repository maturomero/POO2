public class AppMovil {

    private String nombre;
    private String proveedor;
    private int versionActual;


    public static int ultimaVersion;
    public AppMovil(String nombre, String proveedor) {
        this.nombre = nombre;
        this.proveedor = proveedor;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setVersionActual(int versionActual) {
        this.versionActual = versionActual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getVersionActual() {
        return versionActual;
    }

public String consultarActualizacion(){
        if(versionActual < ultimaVersion){
            return "Aplicacion ATRASADA";}
        return "Aplicacion Actualizada";
        }
        public void acutualizar(){
        versionActual++;
        }


}

