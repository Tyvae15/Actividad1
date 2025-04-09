package solucion.srp;



public class Test {

    public static void main(String[] args) {
        System.out.println("*** test ***");
        Reporte r = new Reporte("Ejemplo","Ahora se cumple el principio SRP");
        //Guardar reporte
        ReporteGuardar rg = new ReporteGuardar();
        rg.guardarEnArchivo("MiReporte.txt");
        
        //Enviar reporte
        ReportarEnvio re= new ReportarEnvio();
        re.enviarPorCorreo("micorreo@ulima.edu.pe");
    }
}
