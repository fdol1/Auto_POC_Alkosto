package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.interaccionesalternas.ClicWeb;
import com.choucair.moviles.app.interactions.interaccionesalternas.Hide;
import com.choucair.moviles.app.interactions.interaccionesalternas.TakeScreenshot;
import com.choucair.moviles.app.models.ModelUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;

import static com.choucair.moviles.app.userInterface.LoginInterface.*;

public class IngresarCredenciales implements Task {
    ModelUsuario credencialesLogin;
    public IngresarCredenciales(ModelUsuario credencialesLogin){this.credencialesLogin = credencialesLogin;}

    public static IngresarCredenciales deUsuario(ModelUsuario login){
        return Tasks.instrumented(IngresarCredenciales.class,login);
    }
    @Override
    public <T extends Actor> void performAs(@NotNull T actor) {
        actor.attemptsTo(
                ClicWeb.siElElementoEsVisible(BTN_COOKIE),
                Click.on(BTN_MI_CUENTA),
                EsperaExplicita.empleada(3000),
                Click.on(TXT_CORREO),
                Enter.theValue(credencialesLogin.getCorreo()).into(TXT_CORREO),
                Click.on(BTN_CONTINUAR),
                EsperaExplicita.empleada(5000),
                ClicWeb.dobleMap(BTN_MAIL_CONTRASENA_JS, BTN_MAIL_CONTRASENA),
                EsperaExplicita.empleada(3000),
                Click.on(TXT_CONTRASENA),
                Enter.theValue(credencialesLogin.getContrasena()).into(TXT_CONTRASENA),
                Hide.Keyboard(),
                Click.on(BTN_INICIAR_SESION),
                EsperaExplicita.empleada(15000),
                TakeScreenshot.asEvidence()
        );
    }
}
