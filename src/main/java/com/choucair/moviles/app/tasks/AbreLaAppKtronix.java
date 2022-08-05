package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.GetDriver;
import com.choucair.moviles.app.interactions.interaccionesalternas.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;

public class AbreLaAppKtronix implements Task {
    public AbreLaAppKtronix(){}
    public static AbreLaAppKtronix exitosamente(){
        return Tasks.instrumented(AbreLaAppKtronix.class);
    }
    @Override
    @Step("Ktronix")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app de KTRONIX");
        GetDriver.as(actor).webDriver().get("https://www.ktronix.com/");
        actor.attemptsTo(
                EsperaExplicita.empleada(3000),
                TakeScreenshot.asEvidence()
        );
    }
}