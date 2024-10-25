public class Equipo {
    private String nombre;
    private static final int CAPACIADAD = 10;  // utilizo static final, para tamanio de equipo, ya que es un const.
    private int capacidadActual;
    private Ciclista[] ciclistas;
    private static double TIEMPO_TOTAL;


    public Equipo(String nombre) {
        this.nombre = nombre;
        this.ciclistas = new Ciclista[CAPACIADAD];
    }


    public String getNombre( ) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapaciadad( ) {
        return CAPACIADAD;
    }


    public Ciclista[] getCiclistas( ) {
        return ciclistas;
    }

    public void setCiclistas(Ciclista[] ciclistas) {
        this.ciclistas = ciclistas;
    }

    public int getCapacidadActual( ) {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }



    protected void imprimirEquipo(){
        System.out.println(this.nombre);
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null ; i++){
            System.out.println("nombre de ciclista: " + ciclistas[i].getNombre());
        }
        System.out.println(this.CAPACIADAD);
        System.out.println(TIEMPO_TOTAL);
    }

    protected boolean aniadirCiclista(Ciclista ciclista){
       boolean esCiclistaValido = true;
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null && esCiclistaValido; i++){
            if(ciclistas[i].getIdentificador() == ciclista.getIdentificador()){
                esCiclistaValido = false;
            }
        }
        if(esCiclistaValido && capacidadActual < ciclistas.length){
            ciclistas[capacidadActual] = ciclista;
            capacidadActual++;
        }else{
            esCiclistaValido = false;
        }
        return esCiclistaValido;
    }


    protected void calcularTotal(){
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null ; i++){
           TIEMPO_TOTAL += ciclistas[i].getTiempo();
        }
    }


    protected void listarNombre(){
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null ; i++){
            System.out.println(ciclistas[i].getNombre());
        }
    }


    protected void imprimirCiclista(int id){
        boolean bandera = false;
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null && !bandera ; i++){
            if(id == ciclistas[i].getIdentificador()){
                bandera = true;
                System.out.println(ciclistas[i].imprimirTipo());
                ciclistas[i].imprimir();
            }
        }
        if(!bandera){
            System.out.println("El ciclista no existe");
        }
    }

}
