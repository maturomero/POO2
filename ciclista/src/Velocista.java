public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double tiempoCarrera, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempoCarrera);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotenciaPromedio() {
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
    public void imprimir( ) {
        System.out.println("Es un Velocista");
        System.out.println("Potencia promedio" + this.potenciaPromedio);
        System.out.println("VelocidadPromedio" + this.velocidadPromedio);
    }


    @Override
    public String toString( ) {
        return "Velocista{" +
                "potenciaPromedio=" + potenciaPromedio +
                ", velocidadPromedio=" + velocidadPromedio +
                '}';
    }
}
