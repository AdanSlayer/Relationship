package votaciones;

/**
 *
 * @author david
 */
public class Alumno {

    private String nombreCompleto;
    private int DNI, cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        cantidadVotos = 0;
    }

    public void sumarVoto() {
        cantidadVotos++;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(nombreCompleto);
        int length = nombreCompleto.length();
        sb.append((" ").repeat(18>length? 18-length:0));
        sb.append(DNI);
        sb.append((" ").repeat(3)).append(cantidadVotos);
        sb.append(" |");
        return sb.toString();
    }

}
