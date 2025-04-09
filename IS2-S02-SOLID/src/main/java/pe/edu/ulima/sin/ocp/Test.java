package pe.edu.ulima.sin.ocp;

public class Test {
    
    public static void main(String[] args) {
        Figura f1 = new Figura("CIRCULO", 2);
        Figura f2 = new Figura("RECTANGULO", 2,3);

         Area a = new Area();
        
         System.out.println( a.calcularArea(f1));
         System.out.println( a.calcularArea(f2));
        
        
    }
}
