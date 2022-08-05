package com.choucair.moviles.app.interactions.interaccionesalternas;

import com.choucair.moviles.app.interactions.interaccionesalternas.tap.BuscarElementoWebByTarget;
import com.choucair.moviles.app.interactions.interaccionesalternas.tap.WebOnVisibleObject;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClicWeb {

    private ClicWeb() {
        throw new IllegalStateException("Error en Clic");
    }

    public static WebOnVisibleObject siElElementoEsVisible(Target target){
        return (WebOnVisibleObject) Tasks.instrumented(WebOnVisibleObject.class, new Object[]{target});
    }
    public static BuscarElementoWebByTarget dobleMap(By by, Target target) {
        return Tasks.instrumented(BuscarElementoWebByTarget.class, by, target);
    }
}
