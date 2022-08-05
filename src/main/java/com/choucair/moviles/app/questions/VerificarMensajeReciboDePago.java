package com.choucair.moviles.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.choucair.moviles.app.userInterface.DatosEnvioInterface.MSJ_COMPRA_EXITOSA;

public class VerificarMensajeReciboDePago implements Question<Boolean> {
    String mensaje;
    public VerificarMensajeReciboDePago(String mensaje){
        this.mensaje = mensaje;
    }
    public static VerificarMensajeReciboDePago correcto(String mensaje){
        return new VerificarMensajeReciboDePago(mensaje);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajePag = Text.of(MSJ_COMPRA_EXITOSA).viewedBy(actor).asString();
        System.out.println("el mensaje es: "+mensajePag);
        return mensaje.contains(mensajePag.toLowerCase());
    }
}
