package ejercicio_4.Service;

import java.util.*;
import ejercicio_4.Entidad.Peliculas;

public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> pelis = new ArrayList();
    String op, titulo, director;
    Double horas;

    public void crearPeliculas() {
        do {
            System.out.println("-------------------------------------------");
            System.out.println("Ingrese el Titulo de la pelicula");
            titulo = sc.next();
            System.out.println("Ingrese el Director de la pelicula");
            director = sc.next();
            System.out.println("Ingrese la duracion de la pelicula en horas");
            horas = sc.nextDouble();
            Peliculas p = new Peliculas(titulo, director, horas);
            pelis.add(p);
            System.out.println("Desea seguir ingresando Peliculas? (S/N)");
            op = sc.next();
        } while (op.equalsIgnoreCase("s"));
    }

    public void mostrarPeliculas() {
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando peliculas:");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        pelis.sort(Peliculas.compararDuracion);
        Collections.reverse(pelis);
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando peliculas por mayor duración:");
        
        for(Peliculas peli: pelis){
            System.out.println(peli);
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando peliculas por menor duración:");
        pelis.sort(Peliculas.compararDuracion);
        
        for(Peliculas peli: pelis){
            System.out.println(peli);
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando peliculas por duración mayor a 1h:");
        
        for(Peliculas peli: pelis){
            if (peli.getDuracion() >= 1) {
                System.out.println(peli);
            }
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando peliculas por Titulo Alfabeticamente:");
        pelis.sort(Peliculas.compararTitulo);
        
        for(Peliculas peli: pelis){
            System.out.println(peli);
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando peliculas por Autor Alfabeticamente:");
        
        for(Peliculas peli: pelis){
            System.out.println(peli);
        }
    }

}
