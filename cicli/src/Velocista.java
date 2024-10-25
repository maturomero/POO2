public class Velocista extends Ciclista{

    private double potenciaPromedio;
    private double velocidadPromedio;


    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }


    public double getPotenciaPromedio( ) {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio( ) {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    protected void imprimir(){

        System.out.println("Identificador: " + getIdentificador());
        System.out.println("nombre: " + getNombre());
        System.out.println("tiempo: " + getTiempo());
        System.out.println("potencia: " + this.potenciaPromedio);
        System.out.println("velocidad promedio: " + this.velocidadPromedio);

    }


    @Override
    protected String imprimirTipo( ) {
        return "El Ciclista es de tipo Velocista";
    } //Sobre escribo con el Override

    @Override
    public String toString( ) {
        return "Velocista{" +
                "potenciaPromedio=" + potenciaPromedio +
                ", velocidadPromedio=" + velocidadPromedio +
                '}';
    }
}
