
package votaciones;

/**
 *
 * @author david
 */
public class Voto {
private Alumno alumnoVotante;
private Alumno alumnoVotado;

    public Voto() {
    }

    public Voto(Alumno alumnoVotado, Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
        this.alumnoVotado = alumnoVotado;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public Alumno getAlumnoVotado() {
        return alumnoVotado;
    }

    public void setAlumnoVotado(Alumno alumnoVotado) {
        this.alumnoVotado = alumnoVotado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ").append(alumnoVotante);
        sb.append("  ").append(alumnoVotado);
        return sb.toString();
    }


}
