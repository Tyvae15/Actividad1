package pe.edu.ulima.sin.isp;

public class Perro implements Animal {
    @Override
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los perros no pueden volar.");
    }

    @Override
    public void nadar() {
        System.out.println("El perro está nadando.");
    }
}