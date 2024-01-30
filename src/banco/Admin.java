/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alonso
 */
public class Admin {
     private int id;
    private String nombre;

    public Admin(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    
     public void ReporteTrans(String fechaInicio, String fechaFin) {
        
        System.out.println("Reporte de transacciones desde " + fechaInicio + " hasta " + fechaFin + ":");
     }
    
}
