package ejercicio_4.Entidad;

import java.util.*;

public class Peliculas {
    private String titulo;
    private String director;
    private double duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + " Dirijida por: " + director + " Duración: " + duracion + " Horas"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Comparator<Peliculas> compararDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return Double.compare(p1.getDuracion(),p2.getDuracion());
        }
    };
    
    public static Comparator<Peliculas> compararTitulo = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas p1, Peliculas p2){
            return  p1.getTitulo().compareTo(p2.getTitulo());
        }    
    };
    
    public static Comparator<Peliculas> compararDirector = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas p1, Peliculas p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
}
