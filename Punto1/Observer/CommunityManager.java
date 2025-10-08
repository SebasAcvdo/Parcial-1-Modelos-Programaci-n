package Punto1.Observer;

public class CommunityManager implements NotificacionInterface{
    public String nombre;

    public CommunityManager(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " Community manager ha sucedido un cambio: " + mensaje);
    }
    
}
   