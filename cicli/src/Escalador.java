public class Escalador extends Ciclista{
    private double aceleracionPromedio;
    private double gradoRampa;

    public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }


    public double getAceleracionPromedio( ) {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public double getGradoRampa( ) {
        return gradoRampa;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    protected void imprimir() {
        System.out.println(getIdentificador());
        System.out.println(getNombre());
        System.out.println(getTiempo());


    }


    @Override
    protected String imprimirTipo( ) {
        return "El Ciclista es de tipo Escalador";
    }

    @Override
    public String toString( ) {
        return "Escalador{" +
                "aceleracionPromedio=" + aceleracionPromedio +
                ", gradoRampa=" + gradoRampa +
                '}';
    }


}
