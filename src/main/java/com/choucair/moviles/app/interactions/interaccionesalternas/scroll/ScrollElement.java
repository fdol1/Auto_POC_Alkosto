package com.choucair.moviles.app.interactions.interaccionesalternas.scroll;

import com.choucair.moviles.app.exceptions.ObjetosException;
import com.choucair.moviles.app.interactions.interaccionesalternas.Swipe;
import com.choucair.moviles.utils.enums.ConfiguracionInteracciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.WebElement;

public class ScrollElement implements Interaction {
    private final WebElement element;
    private int cant = 0;

    public ScrollElement(WebElement element) {
        this.element = element;
    }

    public <T extends Actor> void performAs(T actor) {
        while(true) {
            if (!this.element.isDisplayed() && this.cant <= ConfiguracionInteracciones.CANTIDAD_INTERACCIONES.getOpcionInt()) {
                actor.attemptsTo(new Performable[]{Swipe.as(actor).fromBottom().toTop()});
                ++this.cant;
                if (this.cant != ConfiguracionInteracciones.CANTIDAD_INTERACCIONES.getOpcionInt()) {
                    continue;
                }
                throw new ObjetosException(ObjetosException.errorBuscandoObjeto() + this.element);
            }
            return;
        }
    }
}