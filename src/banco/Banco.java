/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Alonso
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        
        PantallaPrincipal mostrarPantalla1 =new PantallaPrincipal();
        
        mostrarPantalla1.show();
        mostrarPantalla1.setTitle("Login");
        mostrarPantalla1.setDefaultCloseOperation(PantallaPrincipal.EXIT_ON_CLOSE);
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - mostrarPantalla1.getWidth()) / 2;
        int y = (screenSize.height - mostrarPantalla1.getHeight()) / 2;

        // Establecer las coordenadas de la ventana
        mostrarPantalla1.setLocation(x, y);
        
        
        
    }
    
}
