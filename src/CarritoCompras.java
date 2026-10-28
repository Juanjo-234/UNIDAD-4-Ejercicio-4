public class   CarritoCompras {
public void finalizarCompra(ProcesadorPago pasarela, double total){
    System.out.println("--------------------------------------------------");
    System.out.println("Iniciando cierre de carrito. Monto total: $" + total);

    boolean resultado = pasarela.efectuarCobro(total);

    if (resultado) {
        System.out.println(">>> Estado: Transacción EXITOSA. Pedido despachado.");
    } else {
        System.out.println(">>> Estado: Transacción RECHAZADA. Seleccione otro método de pago.");
    }
    System.out.println("--------------------------------------------------\n");
}
}

