/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alonso
 */
public class cuentas {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public cuentas(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public double obtenerSaldo() {
        return saldo;
    }
}
