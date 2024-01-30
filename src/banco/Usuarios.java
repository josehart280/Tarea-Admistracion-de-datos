/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alonso
 */
public class Usuarios {
    
    private int ID;
    private String Nombre;
    private int cuenta;
    private double saldo;

    public Usuarios(int ID, String Nombre, int cuenta, double saldo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

   

    public int getID() {return ID;}

    public void setID(int ID) {this.ID = ID;}

    public String getNombre() {return Nombre;}

    public void setNombre(String Nombre) { this.Nombre = Nombre;}
    
    
    
    
    public void Deposito(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de $" + cantidad + " realizado. Nuevo saldo: " + saldo);
    }

    public void Retiro(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }
    
    
    
    
}
