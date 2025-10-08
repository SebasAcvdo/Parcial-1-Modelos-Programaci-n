package Punto2;

class NotificacionTransaccion extends TipoNotificacion {
    private String tipo; // instantánea, diaria o semanal
    public NotificacionTransaccion(String tipo, NotificacionInterface notificacion) {
        this.tipo = tipo;
        this.notificacion = notificacion;
    }
    public void notificar(String usuario) {
        notificacion.enviar("Notificación de transacción (" + tipo + ")", usuario);
    }
} 