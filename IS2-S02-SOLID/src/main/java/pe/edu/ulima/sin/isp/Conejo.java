package pe.edu.ulima.sin.isp;

public class Conejo implements Animal {

    @Override
    public void comer() {
        System.out.println("El conejo está comiendo.");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los conejos no pueden volar.");
    }

    @Override
    public void nadar() {
        System.out.println("Los conejo no nadan.");
    }
}
