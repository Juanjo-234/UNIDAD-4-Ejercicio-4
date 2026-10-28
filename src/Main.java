//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CarritoCompras carrito = new CarritoCompras();

    ProcesadorPago tarjeta = new PagoTarjetaCredito("4532888899991234", 12000.0);
    ProcesadorPago cripto = new PagoCripto("0x8F3b...9C21", 500.0);
    ProcesadorPago billetera = new PagoBilleteraDigital("usuario.mp", 3500.0);

    carrito.finalizarCompra(tarjeta, 4000.0);

    carrito.finalizarCompra(cripto, 800.0);

    carrito.finalizarCompra(billetera, 2500.0);
    
    carrito.finalizarCompra(tarjeta, 9000.0);
}
