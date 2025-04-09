package pe.edu.ulima.sin.ocp;

import java.util.List;

public class Area {

    public double calcularArea(Figura f) {

            if (f.tipo.equals("CIRCULO")) {
                return Math.PI * f.radio * f.radio;
            } else if (f.tipo.equals("RECTANGULO")) {
                return f.ancho * f.largo;
            }
            // Si se agrega una nueva forma, aquí se debe modificar el código

        return 0;
    }
    
}