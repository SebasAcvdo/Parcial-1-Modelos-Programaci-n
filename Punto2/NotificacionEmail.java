package Punto2;

public class NotificacionEmail implements NotificacionInterface{

    @Override
    public void enviar(String mensaje, String usuario) {
        System.out.println("Email dirigido a "+ usuario + mensaje);
    }
    
}
