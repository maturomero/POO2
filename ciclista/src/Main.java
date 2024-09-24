public class Main {
    public static void main(String[] args) {
        Ciclista cilista1 = new Escalador(343434,"Matias", 23,45,90);
        Ciclista cilista2 = new Escalador(2,"Matias", 23,45,90);
        Ciclista cilista3 = new Escalador(2,"Matias", 1,45,90);
        Equipo equipo = new Equipo(1,"hola",5);
        Equipo equipo2 = new Equipo(2,"hola",5);

        System.out.println(equipo.aniadirCiclista(cilista1));
        System.out.println(equipo.aniadirCiclista(cilista2));
        System.out.println(equipo.aniadirCiclista(cilista2));
        equipo.imprimir();
        equipo.listarCiclistas();
        equipo.listarUnCiclista(2);
        equipo2.aniadirCiclista(cilista3);
        System.out.println(equipo2.tTotal());
        System.out.println(equipo.tTotal());






        System.out.println(cilista1);

    }
}