package com.mycompany.pregunta4;

public class ServicioAviso {
    Notificador notificador;
    public ServicioAviso(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarNotificacion(String destinatario, String mensaje) {
        notificador.enviar(destinatario, mensaje);
    }
}
