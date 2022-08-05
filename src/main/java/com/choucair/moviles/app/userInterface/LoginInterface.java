package com.choucair.moviles.app.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginInterface {

    public static final Target BTN_MI_CUENTA = Target.the("Boton mi cuenta")
            .located(By.xpath("(//*[@class='js-mobile-navigation-item'])[1]"));

    public static final Target TXT_CORREO = Target.the("input correo")
            .located(By.cssSelector("#j_username"));

    public static final Target BTN_CONTINUAR = Target.the("Boton continuar")
            .located(By.xpath("(//*[@type='submit'])[2]"));

    public static final Target BTN_COOKIE = Target.the("Boton de cookie")
            .located(By.xpath("//*[@class='button-primary js-cookie-notification-accept']"));

    public static final By BTN_MAIL_CONTRASENA_JS = By.xpath("//*[@id='js-loginEmailPass']");
    public static final Target BTN_MAIL_CONTRASENA = Target.the("Boton mail contraseña")
            .located(By.xpath("//*[@id='js-loginEmailPass']"));

    public static final Target TXT_CONTRASENA = Target.the("input contraseña")
            .located(By.xpath("//*[@id='j_password']"));

    public static final Target BTN_INICIAR_SESION = Target.the("Botón iniciar sesión")
            .located(By.xpath("//*[@class='button-primary js-login-email-password']"));

    public static final Target CELULARES = Target.the("Boton iniciar sesión")
            .located(By.xpath("//*[@data-category='Celulares']/a"));

    public static final Target BTN_INICIAR = Target.the("Boton iniciar sesión")
            .located(By.xpath("//*[@class='mat-focus-indicator login-text mat-button mat-button-base']"));

    //public static final Target TXT_PASS = Target.the("Campo para ingresar password")
      //      .located(By.cssSelector("#password"));

    public static final Target  prueba = Target.the("Botón para iniciar sesión con credenciales")
            .located(By.cssSelector("#login"));
    public static final Target  MSJ_LOGIN_INVALIDO = Target.the("Mensaje de login invalido")
            .located(By.cssSelector("#swal2-title"));
    public static final Target  MSJ_LOGIN_EXITOSO = Target.the("Mensaje de login EXITOSO")
            .located(By.xpath("//*[@class='position-relative banner']/div/h3"));



}
