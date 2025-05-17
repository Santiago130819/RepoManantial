@Regresion
Feature: set de caso de prueba para validacion en orange
  Background: arranco la url de Orange
    Given abro la url de orange

  Scenario: prueba de login Orange
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login