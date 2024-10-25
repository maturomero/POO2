public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }


    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }



    @Override
    protected void imprimir() {
        System.out.println(getIdentificador());
        System.out.println(getNombre());
        System.out.println(getTiempo());
    }


    @Override
    protected String imprimirTipo( ) {
        return "El Ciclista es tipo cotrarelojista";
    }

    @Override
    public String toString() {
        return "Contrarelojista{" +
                "velocidadMaxima=" + velocidadMaxima +
                '}';
    }

}
