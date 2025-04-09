package pe.edu.ulima.sin.srp;

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

    public void guardarEnArchivo(String nombre) {
        // Lógica para guardar el informe en un archivo
        System.out.println("Guardando el reporte en " + nombre);
    }

    public void enviarPorCorreo(String email) {
        // Lógica para enviar el informe por correo electrónico
        System.out.println("Enviando reporte a " + email);
    }
}