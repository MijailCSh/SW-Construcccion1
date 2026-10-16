package com.mycompany.pregunta4;

public class AdaptadorTwilio implements Notificador{
    private final TwilioSMSClient twilio;
    
    public AdaptadorTwilio(TwilioSMSClient twilio) {
        this.twilio = twilio;
    }
    
    @Override
    public void enviar(String destinatario, String mensaje) {
        twilio.sendSms(destinatario, mensaje);
    }
}
