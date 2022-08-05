package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;

public class AbreLaAppKalley implements Task {
    public AbreLaAppKalley(){}
    public static AbreLaAppKalley exitosamente(){
        return Tasks.instrumented(AbreLaAppKalley.class);
    }
    @Override
    @Step("Kalley")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app de KALLEY");
        BrowseTheWeb.as(actor).openAt("https://www.kalley.com.co/");
        actor.attemptsTo(
                EsperaExplicita.empleada(3000),
                TakeScreenshot.asEvidence()
        );
    }
}