package com.choucair.moviles.app.interactions.interaccionesalternas.tap;

import com.choucair.moviles.app.exceptions.ObjetosException;
import com.choucair.moviles.app.interactions.interaccionesalternas.GetDriver;
import com.choucair.moviles.app.interactions.interaccionesalternas.Scroll;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class TapByElement implements Interaction {
    WebElement element;

    public TapByElement(WebElement element) {
        this.element = element;
    }

    @Step("{0} taps on element #atributo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new Performable[]{Scroll.on(this.element)});

        try {
            (new TouchAction(GetDriver.as(actor).appiumDriver())).tap((TapOptions)(new TapOptions()).withElement((new ElementOption()).withElement(this.element))).perform().release();
        } catch (RuntimeException var3) {
            throw new ObjetosException(ObjetosException.errorSeleccionandoObjeto() + this.element.toString());
        }
    }
}
