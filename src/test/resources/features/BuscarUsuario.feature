@BUSCAR
Feature: set de caso de prueba para las validaciones en orange
  Background: arranco la url de Orange
    Given abro la url de orange
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login

  Scenario: El usuario utiliza el filtro para visualizar unicamente los usuarios que tienen el rol de Admin
    Given ingreso al modulo admin y realizo el filtro para solo ver el rol "Admin"
    Then  Valido que contengan los botones de editar y eliminar
