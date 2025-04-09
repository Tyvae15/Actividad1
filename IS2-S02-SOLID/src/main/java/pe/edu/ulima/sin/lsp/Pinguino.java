package pe.edu.ulima.sin.lsp;

public class Pinguino extends Ave {

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los pingüinos no pueden volar.");
    }
}
