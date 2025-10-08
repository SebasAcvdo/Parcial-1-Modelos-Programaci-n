package Punto2;

public class NotificacionMensaje implements NotificacionInterface{

    @Override
    public void enviar(String mensaje, String usuario) {
        System.out.println("sms  enviado a "+  usuario + mensaje);
    }
    
}