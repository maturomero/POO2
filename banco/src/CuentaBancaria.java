public abstract class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private int numeroCuenta;
    private double saldo;
    private double retirar;
    private double porcentajeInteres;
    private boolean estado;

    public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.porcentajeInteres = 0.37;
        this.estado = false;
    }


    public CuentaBancaria() {
    }

    public String getNombreTitular( ) {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidoTitular( ) {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public int getNumeroCuenta( ) {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void  cargarSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimirTipo( );

    public double mostrarSaldo(){
         return this.saldo;

    }

    public boolean retirar (double retirar){
        if(estado){
            saldo -= retirar;
            return true;
        }
        return false;
    }

    public double getRetirar( ) {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public double getPorcentajeInteres( ) {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public boolean isEstado( ) {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void tasaInteresMensual(){
        double valor = saldo + (saldo * porcentajeInteres);
        System.out.println("Saldo total con tasa de interes: $" + valor);
    }


    public boolean comparar(CuentaBancaria cuentaComparar){
        return this.getSaldo() >= cuentaComparar.getSaldo();
    }


    public boolean transferencia(CuentaBancaria cuentaDestino, double monto){
        if (this.saldo < monto){
            return false;
        }else{
            double valor = cuentaDestino.saldo + monto;
            cuentaDestino.saldo = valor;
            this.saldo -= monto;
        }
        return true;
    }



    public boolean cambioEstado(){
        if(this.saldo > 0){
            return true;
        }
        return false;
    }

    @Override // uso del overraide
    public String toString( ) {
        return "CuentaBancaria{" +
                "nombreTitular='" + nombreTitular + '\'' +
                ", apellidoTitular='" + apellidoTitular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", retirar=" + retirar +
                ", porcentajeInteres=" + porcentajeInteres +
                '}';
    }
}
