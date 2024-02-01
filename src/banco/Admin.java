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
    private String nombre = "Admin";
    private String password= "Admin";

    public Admin( String nombre, String password) {
        
        this.nombre = nombre;
        this.password = password;
    }
    public String getpassword() {return password;}
    public void setpassword(int id) {this.password = password;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    
     public void ReporteTrans(String fechaInicio, String fechaFin) {
        
        System.out.println("Reporte de transacciones desde " + fechaInicio + " hasta " + fechaFin + ":");
     }
    
}
