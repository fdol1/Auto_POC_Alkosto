package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.models.ModelUsuario;
import com.choucair.moviles.app.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {

    @Given("^que (.*) desea realizar compras en Ktronix$")
    public void queDeseaRealizarComprasEnKtronix(String actor){
        theActorCalled(actor).wasAbleTo(AbreLaAppKtronix.exitosamente());
    }

    @Given("^que (.*) desea realizar compras en Kalley$")
    public void queDeseaRealizarComprasEnKalley(String actor){
        theActorCalled(actor).wasAbleTo(AbreLaAppKalley.exitosamente());
    }

    @Given("^que (.*) desea realizar compras en Alkosto$")
    public void queDeseaRealizarComprasEnAlkosto(String actor){
        theActorCalled(actor).wasAbleTo(AbreLaAppAlkosto.exitosamente());
    }

    @Given("^que (.*) desea realizar compras en Alkomprar$")
    public void queDeseaRealizarComprasEnAlkomprar(String actor){
        theActorCalled(actor).wasAbleTo(AbreLaAppAlkomprar.exitosamente());
    }

    @When("^ingresa sus credenciales correctamente$")
    public void ingresaSusCredencialesCorrectamente(List <ModelUsuario> credenciales){
        theActorInTheSpotlight().attemptsTo(IngresarCredenciales.deUsuario(credenciales.get(0)));
    }
}
