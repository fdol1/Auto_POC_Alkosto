package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.ClicWeb;
import com.choucair.moviles.app.interactions.interaccionesalternas.Swipe;
import com.choucair.moviles.app.models.ModelProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static com.choucair.moviles.app.userInterface.BusquedaProductosInterface.*;
public class AgregarProductos implements Task {
    ModelProducto datosProducto;
    public AgregarProductos(ModelProducto datosProducto){this.datosProducto = datosProducto;}
    public static AgregarProductos exitosamente(ModelProducto datosProducto){
        return Tasks.instrumented(AgregarProductos.class, datosProducto);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_BUSCAR_PRODUCTO),
                Enter.theValue(datosProducto.getProducto()).into(TXT_BUSCAR_PRODUCTO),
                Click.on(BTN_BUSCAR_PRODUCTO),
                EsperaExplicita.empleada(15000),
                Swipe.as(actor).fromBottom().toTop(),
                Swipe.as(actor).fromBottom().toTop(),
                EsperaExplicita.empleada(2000),
                ClicWeb.dobleMap(IMG_PRODUCTO_JS, IMG_PRODUCTO),
                EsperaExplicita.empleada(20000),
                Swipe.as(actor).fromBottom().toTop(),
                Click.on(BTN_AGREGAR_AL_CARRITO),
                //ClicWeb.dobleMap(BTN_AGREGAR_AL_CARRITO_JS, BTN_AGREGAR_AL_CARRITO),
                EsperaExplicita.empleada(10000)
        );
        actor.attemptsTo(
                Check.whether(BTN_IR_A_CARRITO_KALLEY.resolveFor(actor).isVisible())
                        .andIfSo(
                                Click.on(BTN_IR_A_CARRITO_KALLEY)
                        ).otherwise(
                                Click.on(BTN_IR_AL_CARRITO)
                        )
                );
        actor.attemptsTo(
                EsperaExplicita.empleada(10000),
                Swipe.as(actor).fromBottom().to(20, 100),
                Click.on(BTN_IR_A_PAGAR),
                //ClicWeb.dobleMap(BTN_IR_A_PAGAR_JS, BTN_IR_A_PAGAR),
                EsperaExplicita.empleada(10000)
               // ClicWeb.dobleMap(COMBO_TIPO_DOCUMENTO_JS, COMBO_TIPO_DOCUMENTO)
        );
    }
}
