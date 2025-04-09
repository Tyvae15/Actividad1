package pe.edu.ulima.sin.dip;

public class Usuario {
   private ServicioMail sm;

    public Usuario() {
        this.sm = new ServicioMail(); // Dependencia directa
    }

    public void notificarUsuario (String msg) {
        sm.enviaEmail(msg, "destino@ulima.edu.pe");
    }    
}
