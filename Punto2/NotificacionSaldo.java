package Punto2;

class NotificacionSaldo extends TipoNotificacion {
    private double saldo, umbral;
    public NotificacionSaldo(double saldo, double umbral, NotificacionInterface notificacion) {
        this.saldo = saldo;
        this.umbral = umbral;
        this.notificacion = notificacion;
    }
    public void notificar(String usuario) {
        if (saldo < umbral)
            notificacion.enviar("Saldo bajo: " + saldo + " (umbral " + umbral + ")", usuario);
    }
}