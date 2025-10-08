package Punto2;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotificacionInterface email = new NotificacionEmail();
        NotificacionInterface mensaje = new NotificacionMensaje();
        NotificacionInterface instantanea = new NotificacionInstantanea();


        Usuario u1 = new Usuario("Carlos", 40.000);
        u1.agregarPreferencia(new NotificacionTransaccion("instantánea", instantanea));
        u1.agregarPreferencia(new NotificacionSaldo(u1.saldo, 50.000, mensaje));

        Usuario u2 = new Usuario("Maria", 120.000);
        u2.agregarPreferencia(new NotificacionTransaccion("diaria", email));
        u2.agregarPreferencia(new NotificacionPromocion("2x1 en compras", mensaje));

        Usuario u3 = new Usuario("Andres", 10.000);
        u3.agregarPreferencia(new NotificacionSaldo(u3.saldo, 20.000, instantanea));
        u3.agregarPreferencia(new NotificacionPromocion("Descuento 15%", email));

        List<Usuario> usuarios = Arrays.asList(u1, u2, u3);


        for (Usuario u : usuarios) {
            System.out.println("\n   NOTIFICACIONES PARA " + u.nombre + "   ");
            u.ejecutarNotificaciones();
        }
    }
}   