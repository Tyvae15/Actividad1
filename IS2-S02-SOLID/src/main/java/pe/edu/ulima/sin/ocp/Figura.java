package pe.edu.ulima.sin.ocp;

public class Figura {

    public String tipo;
    public double radio; // Para círculos
    public double largo;  // Para rectángulos
    public double ancho; // Para rectángulos

    public Figura(String tipo, double largo, double ancho) {
        this.tipo = tipo;
        this.largo = largo;
        this.ancho = ancho;
    }

    public Figura(String tipo, double radio) {
        this.tipo = tipo;
        this.radio = radio;
    }

}
