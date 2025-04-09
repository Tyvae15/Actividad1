package solucion.srp;



public class Reporte {
    private String titulo;
    private String contenido;

    public Reporte(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

     public void generaReporte() {
        // Lógica para generar el informe
        System.out.println("Generando Reporte: " + titulo);
        System.out.println(contenido);
    }

}