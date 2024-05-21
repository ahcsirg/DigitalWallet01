package cl.AlkeWalletProyect01.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cl.AlkeWalletProyect01.Cuenta;

class WalletTest {
	
	Cuenta cuenta = new Cuenta(0);

    @Test
    void testGetSaldo() {
        double saldoInicial = 100.0;
        Cuenta cuenta = new Cuenta(saldoInicial);
        assertEquals(saldoInicial, cuenta.getSaldo());
    }

    @Test
    void testDepositar() {
        double saldoInicial = 100.0;
        double cantidadDeposito = 50.0;
        Cuenta cuenta = new Cuenta(saldoInicial);
        cuenta.depositar(cantidadDeposito);
        assertEquals(saldoInicial + cantidadDeposito, cuenta.getSaldo());
    }

    @Test
    void testRetirar_SaldoSuficiente() {
        double saldoInicial = 100.0;
        double cantidadRetiro = 30.0;
        Cuenta cuenta = new Cuenta(saldoInicial);
        cuenta.retirar(cantidadRetiro);
        assertEquals(saldoInicial - cantidadRetiro, cuenta.getSaldo());
    }

    @Test
    void testRetirar_SaldoInsuficiente() {
        double saldoInicial = 100.0;
        double cantidadRetiro = 150.0;
        Cuenta cuenta = new Cuenta(saldoInicial);
        cuenta.retirar(cantidadRetiro);
        assertEquals(saldoInicial, cuenta.getSaldo());
    }

}
