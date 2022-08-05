package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.models.ModelProducto;
import com.choucair.moviles.app.questions.VerificarMensajeReciboDePago;
import com.choucair.moviles.app.tasks.AgregarProductos;
import com.choucair.moviles.app.tasks.FinalizarCompra;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarProcesoCompraStep {

    @And("^agrega productos al carrito$")
    public void agregaProductosAlCarrito(List<ModelProducto> producto){
        theActorInTheSpotlight().attemptsTo(AgregarProductos.exitosamente(producto.get(0)));
    }
    @When("^finaliza compra con medio de pago en efectivo$")
    public void finalizaCompraEnEfectivo(){
        theActorInTheSpotlight().attemptsTo(FinalizarCompra.exitosamente());
    }
    @Then("^podria ver el mensaje de: (.*)$")
    public void podraVisualizarElMensaje(String mensajeReciboPago){
        theActorInTheSpotlight().should(seeThat(VerificarMensajeReciboDePago.correcto(mensajeReciboPago.toLowerCase())));
    }
}
