package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;
public class AbreLaAppAlkomprar implements Task {
    public AbreLaAppAlkomprar(){}
    public static AbreLaAppAlkomprar exitosamente(){
        return Tasks.instrumented(AbreLaAppAlkomprar.class);
    }
    @Override
    @Step("Alkomprar")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app de ALKOMPRAR");
        BrowseTheWeb.as(actor).openAt("https://www.alkomprar.com/");
        actor.attemptsTo(
                EsperaExplicita.empleada(3000),
                TakeScreenshot.asEvidence()
        );
    }
}