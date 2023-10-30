
package votaciones;

/**
 *
 * @author david
 */
public class votacionSimulada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulacion simulacion = new Simulacion();
        simulacion.listaAlumnos(12);
        simulacion.imprimirAlumnos();
        simulacion.votacion();
        System.out.println();
        simulacion.imprimirAlumnos();
        System.out.println("");
        simulacion.imprimirVotos();
        System.out.println("");
        simulacion.encontrarFacilitadores();
    }
    
}
