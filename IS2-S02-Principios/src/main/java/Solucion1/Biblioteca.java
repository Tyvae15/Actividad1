package Solucion1;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
       private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregaLibro(Libro l) {
        libros.add(l);
    }
    
    //Metodo agregado

    public List<Libro> getLibros() {
        return libros;
    }
    
    

}
