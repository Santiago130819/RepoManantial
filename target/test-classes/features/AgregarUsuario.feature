@AGREGAR
Feature: set de caso de prueba para las validaciones en orange
  Background: arranco la url de Orange
    Given abro la url de orange
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login

 Scenario Outline: agregar nuevo usuario
    Given ingreso al menu "PIM" y agrego le doy click al boton add
    Then  ingreso los datos "<FirstName>" "<LastName>" "<Status>" "<Username>" "<Password>"
   Examples:
     | FirstName |LastName | Status  | Username     | Password        |
     | Josei     | Garcia  | Enabled | JoseiPrueba  | HappyTesting123 |