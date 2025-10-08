package Punto1.Observer;

public class Periodista implements NotificacionInterface{
    public String nombre;

    public Periodista(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " Periodista ha sucedido un cambio: " + mensaje);
    }
    
}
