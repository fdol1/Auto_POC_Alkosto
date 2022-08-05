package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;
public class AbreLaAppAlkosto implements Task {
    public AbreLaAppAlkosto(){}
    public static AbreLaAppAlkosto exitosamente(){
        return Tasks.instrumented(AbreLaAppAlkosto.class);
    }
    @Override
    @Step("Alkosto")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app de ALKOSTO");
        BrowseTheWeb.as(actor).openAt("https://www.alkosto.com/");
        actor.attemptsTo(
                EsperaExplicita.empleada(3000),
                TakeScreenshot.asEvidence()
        );
    }
}