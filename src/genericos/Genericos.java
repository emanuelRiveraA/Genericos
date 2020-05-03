
package genericos;

import controlador.Controlador;
import java.awt.EventQueue;
import vista.Vista;


public class Genericos {

    
    
    public static void main(String[] args) {
        //polimorfismo por genericos----- hay otros por sobrecarga de metodos y por herencia
        
        EventQueue.invokeLater(() -> {
            new Controlador(new Vista()).iniciar("Calcular área");
        });
    }
    
}
