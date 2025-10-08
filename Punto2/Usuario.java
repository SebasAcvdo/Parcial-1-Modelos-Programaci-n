package Punto2;
import java.util.ArrayList;
import java.util.List;

class Usuario {
    String nombre;
    double saldo;
    List<TipoNotificacion> preferencias = new ArrayList<>();

    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void agregarPreferencia(TipoNotificacion notificacion) {
        preferencias.add(notificacion);
    }

    public void ejecutarNotificaciones() {
        for (TipoNotificacion n : preferencias) {
            n.notificar(nombre);
        }
    }
}