#Author: ChristianM

@RealizarCompras
Feature: Realizar el proceso de ruta end to end para compras en alkosto, alkomprar, kalley y ktronix

  @CompraExitosaKtronix
  Scenario: Intentar iniciar sesión exitosamente
    Given que Christian desea realizar compras en Ktronix
    When ingresa sus credenciales correctamente
      |correo|contrasena|
      |chrisramachaphb@gmail.com|Asdf1234*|
     And agrega productos al carrito
       |producto|
       |Lavadora|
     And finaliza compra con medio de pago en efectivo
     Then podria ver el mensaje de: Ver recibo de pago

  @CompraExitosaKalley
  Scenario: Intentar iniciar sesión exitosamente
    Given que Christian desea realizar compras en Kalley
    When ingresa sus credenciales correctamente
      |correo|contrasena|
      |chrisramachaphb@gmail.com|Asdf1234*|
    And agrega productos al carrito
      |producto|
      |Lavadora|
    And finaliza compra con medio de pago en efectivo
    Then podria ver el mensaje de: Ver recibo de pago

  @CompraExitosaAlkomprar
  Scenario: Intentar iniciar sesión exitosamente
    Given que Christian desea realizar compras en Alkomprar
    When ingresa sus credenciales correctamente
      |correo|contrasena|
      |chrisramachaphb@gmail.com|Asdf1234*|
    And agrega productos al carrito
      |producto|
      |Televisor|
    And finaliza compra con medio de pago en efectivo
    Then podria ver el mensaje de: Ver recibo de pago

  @CompraExitosaAlkosto
  Scenario: Intentar iniciar sesión exitosamente
    Given que Christian desea realizar compras en Alkosto
    When ingresa sus credenciales correctamente
      |correo|contrasena|
      |chrisramachaphb@gmail.com|Asdf1234*|
    And agrega productos al carrito
      |producto|
      |Microondas|
    And finaliza compra con medio de pago en efectivo
    Then podria ver el mensaje de: Ver recibo de pago

