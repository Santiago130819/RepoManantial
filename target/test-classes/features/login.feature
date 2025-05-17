@LOGIN
Feature: set de caso de prueba para validacion del login en orange
  Background: arranco la url de Orange
    Given abro la url de orange

  Scenario: El usuario procede a ingresar a la plataforma desde la vista principal
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login

