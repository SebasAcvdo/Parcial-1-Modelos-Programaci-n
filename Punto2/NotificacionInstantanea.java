package Punto2;

public class NotificacionInstantanea implements NotificacionInterface{

    @Override
    public void enviar(String mensaje, String usuario) {
        System.out.println("Instantanea dirigida a "+  usuario + mensaje);
    }
    
}