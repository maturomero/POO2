
public class Main {
    public static void main(String[] args) {

                Velocista ciclista1 = new Velocista(123,"Juan",120,40.23);
                Escalador ciclista2 = new Escalador(124,"Martin",160,80.23);
                Contrarrelojista ciclista3 = new Contrarrelojista(125,"Julian",80.23);

                Equipo equipo = new Equipo("Los campeones");

                ciclista1.setTiempo(30);
                ciclista2.setTiempo(45);
                ciclista3.setTiempo(25);


                equipo.aniadirCiclista(ciclista1);
                equipo.aniadirCiclista(ciclista2);
                equipo.calcularTotal();
                equipo.imprimirEquipo();

                equipo.imprimirCiclista(12);


    }
}
