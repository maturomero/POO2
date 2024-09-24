public class cuentaCorriente extends CuentaBancaria{

    public cuentaCorriente(String nombreTitular, String apellidoTitular, int numeroCuenta) {
        super(nombreTitular, apellidoTitular, numeroCuenta);
    }

    public cuentaCorriente( ) {
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Cuenta Corriente");
        System.out.println("nombre de propietario de cuenta: "+ getNombreTitular());
        System.out.println("apellido de propietario de cuenta: "+ getApellidoTitular());
        System.out.println("numero de propietario de cuenta: "+ getNumeroCuenta());
        System.out.println("saldo: $"+ getSaldo());
    }


}
