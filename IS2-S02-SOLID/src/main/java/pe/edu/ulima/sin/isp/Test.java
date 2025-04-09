package pe.edu.ulima.sin.isp;

public class Test {
    public static void main(String[] args) {
        Animal conejo = new Conejo();
        Animal perro = new Perro();
        
        conejo.comer();
        conejo.nadar();
        conejo.volar();
        
        perro.comer();
        perro.nadar();
        perro.volar();
    }
    
}
