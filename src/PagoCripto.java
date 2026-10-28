public class PagoCripto implements ProcesadorPago{
    private String walletAddress;
    private double saldoCriptoUSD;

    public PagoCripto(String walletAddress, double saldoCriptoUSD) {
        this.walletAddress = walletAddress;
        this.saldoCriptoUSD = saldoCriptoUSD;
    }

    @Override
    public boolean efectuarCobro(double monto) {
        System.out.println(" Conectando con la red blockchain para wallet " + walletAddress + "...");
        if (monto <= saldoCriptoUSD) {
            saldoCriptoUSD -= monto;
            System.out.println("Transaccion confirmada por $ " + monto);
            return true;
        }else{
            System.out.println("Transaccion rechazada por saldo de criptomonedas insuficiente.");
            return false;
        }
    }
}
