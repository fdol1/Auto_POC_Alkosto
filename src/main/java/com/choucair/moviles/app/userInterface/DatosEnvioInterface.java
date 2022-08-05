package com.choucair.moviles.app.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosEnvioInterface {
    public static final By BTN_CONTINUAR_CHECKOUT_JS = By.xpath("(//*[@id='placeOrder'])[2]");
    public static final Target BTN_CONTINUAR_CHECKOUT = Target.the("Continuar a checkout")
            .located(By.xpath("(//*[@id='placeOrder'])[2]"));
    public static final By BTN_FINALIZAR_COMPRA_JS = By.xpath("//*[@class='button-primary js-animationPaymentMethodBtn']");
    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Boton finalizar compra")
            .located(By.xpath("//*[@class='button-primary js-animationPaymentMethodBtn']"));
    public static final By BTN_PAGO_EN_EFECTIVO_JS = By.xpath("(//*[@data-pmcode='CASH'])[2]");
    public static final Target BTN_PAGO_EN_EFECTIVO = Target.the("Boton pago en efectivo")
            .located(By.xpath("(//*[@data-pmcode='CASH'])[2]"));
    public static final By BTN_CONTINUAR_A_PAGAR_JS = By.cssSelector("#deliveryMethodSubmit");
    public static final Target BTN_CONTINUAR_A_PAGAR = Target.the("Boton para acceder a medios de pago")
            .located(By.cssSelector("#deliveryMethodSubmit"));
    public static final Target  MSJ_COMPRA_EXITOSA = Target.the("Mensaje de login EXITOSO")
            .located(By.xpath("//*[@class='btn button-variant btn-default btn-default--green-read-more hidden-lg hidden-md']"));
}
