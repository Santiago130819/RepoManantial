@AGREGAR
Feature: set de caso de prueba para las validaciones en orange
  Background: arranco la url de Orange
    Given abro la url de orange
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login

 Scenario Outline: agregar nuevo usuario
    Given ingreso al menu "Admin" y agrego le doy click al boton add
    Then  ingreso los datos "<userRole>" "<Employee Name>" "<Status>" "<Username>" "<Password>"
   Examples:
     | userRole | Employee Name       | Status  | Username      | Password        |
     | Admin    | joker john selvam   | Enabled | HappyTesting  | HappyTesting123 |