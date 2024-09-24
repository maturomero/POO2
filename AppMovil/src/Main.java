public class Main {
    public static void main(String[] args) {
        AppMovil app1 = new AppMovil("Hola","hello");
        AppMovil app2 = new AppMovil("Hola2","hello2");
        System.out.println("jorge tiene la version " + app1.getVersionActual());
        System.out.println("Juan tiene la version " + app2.getVersionActual());

        System.out.println("Jorge" + app1.consultarActualizacion());
        System.out.println("Juan" + app2.consultarActualizacion());

        AppMovil.ultimaVersion = 1;
        System.out.println("Jorge tiene la version " + app1.consultarActualizacion());
        System.out.println("Juan tiene la version " + app2.consultarActualizacion());

        app1.acutualizar();

        System.out.println("Jorge tiene " + app1.consultarActualizacion());
        System.out.println("Juan tiene la version " + app2.consultarActualizacion());

        app2.acutualizar();

        System.out.println("Jorge tiene " + app2.consultarActualizacion());
        System.out.println("Juan tiene la version " + app1.consultarActualizacion());




    }
}