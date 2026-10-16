package com.mycompany.pregunta4;

public class Pregunta4 {

    public static void main(String[] args) {
        TwilioSMSClient twilio = new TwilioSMSClient();
        
        Notificador adaptador = new AdaptadorTwilio(twilio);
        
        ServicioAviso servicio = new ServicioAviso(adaptador);
        
        servicio.enviarNotificacion("949 078 244", "HOla");
    }
}
