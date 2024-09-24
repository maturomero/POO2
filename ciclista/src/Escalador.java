public class Escalador extends Ciclista{
private int aceleracionPromedio;
private int gradoRampa;

    public Escalador(int identificador, String nombre, double tiempoCarrera, int aceleracionPromedio, int gradoRampa) {
        super(identificador, nombre, tiempoCarrera);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public int getAceleracionPromedio( ) {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(int aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public int getGradoRampa( ) {
        return gradoRampa;
    }

    public void setGradoRampa(int gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public void imprimir() {
        System.out.println("Es un Escalador");
        System.out.println("Aceleracion Promedio" + this.aceleracionPromedio);
        System.out.println("Grado de rampa soportada" + this.gradoRampa);
    }


    @Override
    public String toString( ) {
        return "Escalador{" +
                "aceleracionPromedio=" + aceleracionPromedio +
                ", gradoRampa=" + gradoRampa +
                '}';
    }
}
