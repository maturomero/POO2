public class Main {
    public static void main(String[] args) {

        Appmovil instancia1 = new Appmovil("Linuxeros", "kernel.org");
        Appmovil instancia2 = new Appmovil("Linuxeros", "kernel.org");

        System.out.println("Mati tiene la verson de la app: " + instancia1.getVersionActual());
        System.out.println("Lauti tiene la version de la app: " + instancia2.getVersionActual());

        System.out.println("Mati " + instancia1.consultarActualizacion());
        System.out.println("Lauti " + instancia2.consultarActualizacion());

        //En kernel.org deciden hacer un cambio asi que ahora pasamos la version 1

        Appmovil.ultimaVersion = 1; // atributo de clase, se modifica cambiando el valor de la clase
                                    //OJO
        System.out.println("Mati " + instancia1.consultarActualizacion());
        System.out.println("Lauti " + instancia2.consultarActualizacion());

        System.out.println("Actualizar el celular de Mati .....");
        instancia1.actualizar();
        System.out.println("Mati fue actualizado.");

        System.out.println("Mati tiene la verson de la app: " + instancia1.getVersionActual());
        System.out.println("Lauti tiene la version de la app: " + instancia2.getVersionActual());

        System.out.println("Actualizar el celular de Lauti .....");
        instancia2.actualizar();
        System.out.println("Lauti fue actualizado.");
        System.out.println("Mati tiene la verson de la app: " + instancia1.getVersionActual());
        System.out.println("Lauti tiene la version de la app: " + instancia2.getVersionActual());

        System.out.println("Mati " + instancia1.consultarActualizacion());
        System.out.println("Lauti " + instancia2.consultarActualizacion());

        //Creamos un nuvo usuario y vemos si tiene la app actualizada
        //como el atributo es de clase, nos va a decir que no

        Appmovil instancia3 = new Appmovil("Linuxeros", "kernel.org");
        System.out.println("Tobias: "+ instancia3.consultarActualizacion());

    }
}