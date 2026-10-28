Resolución del ejercicio N°4  de la unidad 4  de programación 2.
Interfaz Contrato (ProcesadorPago):

Define la firma universal boolean efectuarCobro(double monto). Obliga a cualquier pasarela de pago presente o futura a implementar un mecanismo estándar de cobro que devuelva un valor lógico (true si fue exitoso, false si fue rechazado).

Clases Concretas (Pasarelas de Pago):

PagoTarjetaCredito: Valida tokens seguros y verifica si el monto solicitado se encuentra dentro del límite de crédito disponible.

PagoCripto: Simula la conexión a una red blockchain utilizando una dirección de billetera (wallet address) y verifica el saldo disponible en dólares (USD).

PagoBilleteraDigital: Simula la validación de seguridad (PIN o biometría) asociada a un correo electrónico y comprueba los fondos en cuenta.

Clase Coordinadora (CarritoCompras):

Funciona como el componente de negocio principal. Contiene el método finalizarCompra(ProcesadorPago pasarela, double total), el cual recibe cualquier implementación de la interfaz de manera genérica. Gracias a esto, el carrito no necesita conocer los detalles internos de la tarjeta, las criptomonedas o la billetera digital.

Clase Principal (Main / SimuladorTienda):

Inicializa las distintas pasarelas con sus respectivos saldos y límites.

Realiza simulaciones de compra alternando dinámicamente el medio de pago en tiempo de ejecución, imprimiendo las trazas de validación, aprobación o rechazo en la consola.
<img width="567" height="695" alt="Captura de pantalla 2026-10-28 101205" src="https://github.com/user-attachments/assets/393c2410-34c4-4deb-aaa9-a969cba26522" />
