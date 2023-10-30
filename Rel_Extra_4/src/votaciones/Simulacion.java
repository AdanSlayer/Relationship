package votaciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author david
 */
public class Simulacion {

    private final Random aleatorio = new Random();
    private ArrayList<Alumno> alumnos;
    private ArrayList<Voto> votos;

    public Simulacion() {
        this.alumnos = new ArrayList();
        this.votos = new ArrayList();
    }

    public ArrayList<String> listaNombreCompleto(int cantidad) {
        ArrayList<String> lista = new ArrayList();
        String[] nombre = {"Antonio", "Sherley", "Diego", "María", "José",
            "Ana", "Lucas", "Britney", "Francia", "Blas"};
        String[] apellido = {"Pérez", "Leroux", "Lozada", "Fuentes",
            "Torroja", "Ponce", "Di Bari", "Echenique", "Klein", "Da Silva"};

        for (int i = 0; i < cantidad; i++) {
            lista.add(nombre[aleatorio.nextInt(nombre.length)] + " "
                    + apellido[aleatorio.nextInt(apellido.length)]);
        }
        return lista;
    }

    public ArrayList<Integer> listaDNI(int cantidad) {
        int dni;
        ArrayList<Integer> lista = new ArrayList();
        while (lista.size() < cantidad) {
            dni = 1000000 + aleatorio.nextInt(290000 + 1);
            if (!lista.contains(dni)) {
                lista.add(dni);
            }
        }
        return lista;
    }

    public ArrayList<Alumno> listaAlumnos(int cantidad) {
        ArrayList<Alumno> lista = new ArrayList();
        ArrayList<String> nombreCompleto = listaNombreCompleto(cantidad);
        ArrayList<Integer> DNI = listaDNI(cantidad);
        for (int i = 0; i < DNI.size(); i++) {
            lista.add(new Alumno(nombreCompleto.get(i), DNI.get(i)));
        }
        alumnos = lista;
        return lista;
    }

    public void imprimirAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void votacion() {
        for (Alumno alumnoVotante : alumnos) {
            HashSet<Alumno> votosValidos = new HashSet();
            while (votosValidos.size() < 3) {
                Alumno alumnoVotado = alumnos
                        .get(aleatorio.nextInt(alumnos.size()));
                if (alumnoVotante != alumnoVotado) {
                    votosValidos.add(alumnoVotado);
                }
            }
            for (Alumno alumnoVotado : votosValidos) {
                alumnoVotado.sumarVoto();
                //System.out.println("                        <-"+alumnoVotado);
                Voto voto = new Voto(alumnoVotado, alumnoVotante);
                votos.add(voto);
            }
        }
    }

    public void imprimirVotos() {

        System.out.println("        Alumno Votante"
                + (" ").repeat(20) + "Votos recibidos por:");
        System.out.println(("= ").repeat(40));
        for (int i = 0; i < votos.size(); i += 3) {
            System.out.println(votos.get(i).getAlumnoVotante());
            for (int j = i; j <= i + 2; j++) {
                System.out.print((" ").repeat(35));
                System.out.println(votos.get(j).getAlumnoVotado());
            }
            System.out.println(("* ").repeat(40));
        }
    }

    public void encontrarFacilitadores() {
        
        ArrayList<Alumno> ordenados = new ArrayList<>(alumnos);
        ordenados.sort(Comparator
                .comparing(Alumno::getCantidadVotos).reversed());
        System.out.println("        Facilitadores");
        for (int i = 0; i < 5; i++) {
            System.out.println(ordenados.get(i));
        }
        System.out.println();
        System.out.println("        Suplentes");
        for (int i = 5; i < 10; i++) {
            System.out.println(ordenados.get(i));
        }
    
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Voto> getVotos() {
        return votos;
    }

    public void setVotos(ArrayList<Voto> votos) {
        this.votos = votos;
    }

}
