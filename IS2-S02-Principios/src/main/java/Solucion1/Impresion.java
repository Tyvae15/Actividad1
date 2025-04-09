
package Solucion1;

import java.util.List;


public class Impresion {
    
    // Esta clase se encarga de la impresion, pero se agrega la lista de los libros.
    
    public void muestraLibros(List<Libro> libros) {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void imprimeResumen(List<Libro> libros) {
        System.out.println("Cantidad de Libros: " + libros.size());
    }
    
    
    
}
