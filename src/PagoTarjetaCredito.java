public class PagoTarjetaCredito implements ProcesadorPago {
    private String numeroTarjeta;
    private double limiteCredito;

    public PagoTarjetaCredito(String numeroTarjeta, double limiteCredito) {
        this.numeroTarjeta = numeroTarjeta;
        this.limiteCredito = limiteCredito;
    }

    private String enmascarar(String tarjeta) {
        if (tarjeta != null && tarjeta.length() >= 4) {
            return "****-****-****-" + tarjeta.substring(tarjeta.length() - 4);
        }
        return "****";
    }

    @Override
    public boolean efectuarCobro(double monto) {
        System.out.println("[TARJETA] Tokenizando y validando tarjeta " + numeroTarjeta + "...");
        if (monto <= limiteCredito) {
            limiteCredito -= monto;
            System.out.println("Pago aprobado por $ " + monto);
            return true;
        }else{
            System.out.println("Pago rechazado por limite insuficiente.");
            System.out.println("limite actual: " + this.limiteCredito + ". Monto requerido: $" + monto);
            return false;
        }
    }
}
