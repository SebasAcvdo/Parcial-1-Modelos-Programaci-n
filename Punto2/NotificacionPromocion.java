package Punto2;

class NotificacionPromocion extends TipoNotificacion {
    private String promo;
    public NotificacionPromocion(String promo, NotificacionInterface notificacion) {
        this.promo = promo;
        this.notificacion = notificacion;
    }
    public void notificar(String usuario) {
        notificacion.enviar("Nueva promoción: " + promo, usuario);
    }
}