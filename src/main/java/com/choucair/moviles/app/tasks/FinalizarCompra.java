package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.ClicWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Logger;

import static com.choucair.moviles.app.userInterface.DatosEnvioInterface.*;

public class FinalizarCompra implements Task {
    public FinalizarCompra(){}
    public static FinalizarCompra exitosamente(){
        return Tasks.instrumented(FinalizarCompra.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("aca llega o que");
        actor.attemptsTo(
                ClicWeb.dobleMap(BTN_CONTINUAR_A_PAGAR_JS, BTN_CONTINUAR_A_PAGAR),
                EsperaExplicita.empleada(10000),
                ClicWeb.dobleMap(BTN_PAGO_EN_EFECTIVO_JS, BTN_PAGO_EN_EFECTIVO),
                EsperaExplicita.empleada(10000),
                ClicWeb.dobleMap(BTN_FINALIZAR_COMPRA_JS, BTN_FINALIZAR_COMPRA),
                EsperaExplicita.empleada(10000),
                ClicWeb.dobleMap(BTN_CONTINUAR_CHECKOUT_JS, BTN_CONTINUAR_CHECKOUT),
                EsperaExplicita.empleada(10000)
        );
    }
}
