/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solucion1;


public class Test {
    
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad","Gabriel García Márquez");
        Libro l2 = new Libro("El señor de los anillos","J. R. R. Tolkien");
        Libro l3 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes");
        
        Biblioteca b = new Biblioteca();
        b.agregaLibro(l1);
        b.agregaLibro(l2);
        b.agregaLibro(l3);
        
        Impresion imp = new Impresion();
        imp.muestraLibros(b.getLibros());
        imp.imprimeResumen(b.getLibros());
    }
    
}
