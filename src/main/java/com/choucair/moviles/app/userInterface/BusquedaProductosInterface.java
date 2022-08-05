package com.choucair.moviles.app.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaProductosInterface {
    public static final By IMG_PRODUCTO_JS = By.xpath("(//*[@class='js-product-click-datalayer'])[1]");
    public static final Target IMG_PRODUCTO = Target.the("Lista de productos primer objeto")
            .located(By.xpath("(//*[@class='js-product-click-datalayer'])[2]"));
    public static final Target TXT_BUSCAR_PRODUCTO = Target.the("Campo para buscar producto")
            .located(By.cssSelector("#js-site-search-input"));
    public static final Target BTN_BUSCAR_PRODUCTO = Target.the("boton para buscar producto")
            .located(By.cssSelector("#js-search-button"));

    public static final By BTN_AGREGAR_AL_CARRITO_JS = By.xpath("(//*[@id='addToCartButton'])[2]");
    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("boton para agregar al carrito")
            .located(By.xpath("(//*[@id='addToCartButton'])[2]"));
    public static final Target BTN_IR_AL_CARRITO = Target.the("boton para ir al carrito")
            .located(By.xpath("//*[@class='button-primary cart-pop-up-warrantyFooter_cartRedirect js-warrantyRedirect-overlay']"));

    public static final By BTN_IR_A_PAGAR_JS = By.cssSelector("#js-go-to-pay");
    public static final Target BTN_IR_A_PAGAR = Target.the("boton para ir a pagar")
            .located(By.cssSelector("#js-go-to-pay"));

    public static final Target BTN_IR_A_CARRITO_KALLEY = Target.the("boton para ir a pagar")
            .located(By.xpath("(//*[@class='button-primary js-animateBeforeSend js-delayLocation'])[1]"));
}
