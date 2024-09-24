public class Equipo{
    private int identificador;
    private String nombreDeEquipo;
    private Ciclista[] ciclistas;
    private final static int tamanio = 10;
    private int cantidad = 0;
    private static double tiempoTotal;


    public Equipo(int identificador, String nombreDeEquipo,int tamanio) {
        this.identificador = identificador;
        this.nombreDeEquipo = nombreDeEquipo;
        this.ciclistas = new Ciclista[tamanio];
    }

    public Boolean aniadirCiclista(Ciclista nuevoCiclista) {
        boolean bandera = true;
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null && bandera ; i++) {
            if (nuevoCiclista.getIdentificador() == ciclistas[i].getIdentificador()) {
                bandera = false;
            }
        }
        if(!bandera ||tamanio == ciclistas.length){
            return false;
        }else{
            ciclistas[cantidad] = nuevoCiclista;
            cantidad++;
        }
        return bandera;
    }


    public double tTotal(){
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null; i++){
            tiempoTotal += ciclistas[i].getTiempoCarrera();
        }
        return tiempoTotal;
    }


    public void imprimir(){
        System.out.println(identificador);
        System.out.println(nombreDeEquipo);
        System.out.println(tamanio);
    }


    public void listarCiclistas(){
        for (int i = 0; i < ciclistas.length && ciclistas[i] != null; i++){
            System.out.println(ciclistas[i].getNombre());
        }
    }


    public void listarUnCiclista(int id){
        boolean bandera = false;

        for (int i = 0; i < ciclistas.length && ciclistas[i] != null; i++){
            if(ciclistas[i] != null && id == ciclistas[i].getIdentificador()){
                System.out.println(ciclistas[i].getIdentificador());
                System.out.println(ciclistas[i].getNombre());
                System.out.println(ciclistas[i].getTiempoCarrera());
                bandera = true;
            }


        }
        if(!bandera){
            System.out.println("No existe un ciclista con ese identificador");
        }





    }



}
