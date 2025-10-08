package Punto2;

abstract class TipoNotificacion {
    protected NotificacionInterface notificacion;

    public void setnotificacion(NotificacionInterface notificacion) {
        this.notificacion = notificacion;
    }

    public abstract void notificar(String usuario);
}
