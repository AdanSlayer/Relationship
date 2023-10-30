/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author lorena
 */
public class Pelicula {
    
    private String titulo, director;
    private int duracion, edadMinina;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int edadMinina) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinina = edadMinina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinina() {
        return edadMinina;
    }

    public void setEdadMinina(int edadMinina) {
        this.edadMinina = edadMinina;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadMinina=" + edadMinina + '}';
    }
    
    
    
}
