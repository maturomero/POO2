public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new cuentaCorriente("Matias","Romero",5);
        CuentaBancaria cuenta2 = new cuentaCorriente("Matias2","Romero2",10);

        System.out.println("");

        cuenta.cargarSaldo(545.34);

        cuenta.imprimirTipo();

        System.out.println("");

        System.out.println(cuenta.mostrarSaldo());

        System.out.println("");

        System.out.println(cuenta.retirar(100000));
        // devuelve false si se pasa dinero demas por parametro de la cantidad de dinero que tengo en la cuenta

        System.out.println("");

        cuenta.tasaInteresMensual();

        System.out.println("");

        System.out.println(cuenta.comparar(cuenta));

        System.out.println("");


        System.out.println("");

        cuenta.mostrarSaldo();
        cuenta2.mostrarSaldo();


        System.out.println();

        System.out.println(cuenta2.retirar(12));
        System.out.println(cuenta2.cambioEstado());
    }
}