/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra1;

import adoptarperro.Adopcion;
import java.util.concurrent.ForkJoinTask;

/**
 *
 * @author QuinSDev
 */
public class Ejercicio_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adopcion adopcion = new Adopcion();
        adopcion.infoPersona();
        adopcion.mostrarPerros();
        adopcion.adoptar();
        adopcion.mostrar();
        
    }
    
}
