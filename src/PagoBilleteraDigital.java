public class PagoBilleteraDigital implements  ProcesadorPago{
    private String alias;
    private double saldoBilletera;

    public PagoBilleteraDigital(String alias, double saldoBilletera) {
        this.alias = alias;
        this.saldoBilletera = saldoBilletera;
    }

    @Override
    public boolean efectuarCobro(double monto) {
        System.out.println(" Validando alias " + alias + "...");
        if (monto <= saldoBilletera) {
            saldoBilletera -= monto;
            System.out.println("Pago confirmado por $ " + monto);
            return true;
        }else{
            System.out.println("Pago rechazado por saldo insuficiente en la billetera.");
            return false;
        }
    }

}
