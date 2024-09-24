public class cuentaAhorros extends CuentaBancaria{

    public cuentaAhorros(String nombreTitular, String apellidoTitular, int numeroCuenta) {
        super(nombreTitular, apellidoTitular, numeroCuenta);
    }

    public cuentaAhorros( ) {
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Cuenta de ahorro");
        System.out.println("nombre de propietario de cuenta: "+ getNombreTitular());
        System.out.println("apellido de propietario de cuenta: "+ getApellidoTitular());
        System.out.println("numero de propietario de cuenta: "+ getNumeroCuenta());
        System.out.println("saldo: $"+ getSaldo());
    }

}
