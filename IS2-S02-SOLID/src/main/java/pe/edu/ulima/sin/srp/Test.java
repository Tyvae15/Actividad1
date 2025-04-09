package pe.edu.ulima.sin.srp;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** test ***");
        Reporte r = new Reporte("Anti-Ejemplo","No se cumple el principio SRP");
        r.guardarEnArchivo("MiReporte.txt");
        r.enviarPorCorreo("micorreo@ulima.edu.pe");
    }
}
