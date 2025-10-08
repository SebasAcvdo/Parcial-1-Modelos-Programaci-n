package Punto1.Sujeto;
import java.util.ArrayList;
import java.util.List;

import Punto1.Observer.NotificacionInterface;

public class Sujeto {
    private List<NotificacionInterface> observadores = new ArrayList<>();

    public void agregarObservador(NotificacionInterface observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(NotificacionInterface observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensaje) {
        for (NotificacionInterface observador : observadores) {
            observador.notificar(mensaje);
        }
    }

    public void actualizarCursos(String curso, String accion) {
        String mensaje = "El curso '" + curso + "' ha sido " + accion + ".";
        notificarObservadores(mensaje);
    }


}
