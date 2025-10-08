package Punto1.Observer;

public class Webmaster implements NotificacionInterface{
    public String nombre;

    public Webmaster(String nombre){
        this.nombre = nombre;   
    }
    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " Webmaster ha sucedido un cambio: " + mensaje);
    }
    
}
