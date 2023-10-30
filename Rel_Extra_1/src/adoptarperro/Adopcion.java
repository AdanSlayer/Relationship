package adoptarperro;

import java.util.ArrayList;
import java.util.Scanner;
import model.Perro;
import model.Persona;

/**
 *
 * @author QuinSDev
 */
public class Adopcion {

    Perro perro;
    Persona persona = new Persona();
    ArrayList<Perro> adopcion = new ArrayList<>();

    Scanner read = new Scanner(System.in);

    public void infoPersona() {

        String opc = "";
        do {

            System.out.print("Ingresa el nombre: ");
            persona.setNombre(read.nextLine());
            System.out.print("Ingresa el apellido: ");
            persona.setApellido(read.nextLine());
            System.out.print("Ingresa la edad: ");
            persona.setEdad(read.nextInt());
            System.out.print("Ingresa el documento: ");
            persona.setDocumento(read.nextLong());
            persona.setPersona(new Persona(persona.getNombre(),
                    persona.getApellido(), persona.getEdad(), persona.getDocumento()));
            read.nextLine();
            System.out.print("\n¿Deseas ingresar otro usuario al sistema?: ");
            opc = read.nextLine();
            System.out.println("");

        } while (opc.equalsIgnoreCase("si"));

    }

    public void mostrarPerros() {

        System.out.println("\nTenemos los siguiente animales: ");
        for (Perro value : perro.values()) {
            System.out.println(value);
        }

    }

    public boolean perroAdoptado(String nombreP) {
        for (Persona pero : persona.getPersona()) {
            for (Perro perro1 : pero.getPerro()) {
                if (perro1.getNombre().equalsIgnoreCase(nombreP)) {
                    return true;

                }
            }

        }
        return false;
    }

    public void adoptar() {

        for (Persona persona1 : persona.getPersona()) {
            System.out.print(persona1.getNombre());
            System.out.print(" ¿Cuál es el nombre del perro que deseas"
                    + " adoptar?: ");
            String nombreP = read.nextLine();
            if (perroAdoptado(nombreP)) {
                System.out.println("Ya tiene hogar");
            } else {
                for (Perro value : Perro.values()) {
                    if (value.getNombre().toString().equalsIgnoreCase(nombreP)) {
                        persona1.setPerro(value);
                        System.out.println("¡Adopción exitosa! ");
                        break;
                    } else {
                        System.out.println("No se encontro el perro");
                    }
                }
            }

        }

    }
    
    public void mostrar() {
        for (Persona persona1 : persona.getPersona()) {
            System.out.println(persona1.toString());
        }
    }

}
