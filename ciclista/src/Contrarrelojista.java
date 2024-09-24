public class Contrarrelojista extends Ciclista{
private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double tiempoCarrera, double velocidadMaxima) {
        super(identificador, nombre, tiempoCarrera);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima( ) {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimir() {
        /*(System.out.println("identificador" + getIdentificador());
        System.out.println("Nombre:" + getNombre());
        System.out.println("tiempo de carrera" + getTiempoCarrera());*/
        System.out.println("Contrarrelojista");
        System.out.println("velocidad maxima" + velocidadMaxima);

    }


    @Override
    public String toString( ) {
        return "Contrarrelojista{" +
                "velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
