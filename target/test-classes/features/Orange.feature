@Regresion
Feature: set de caso de prueba para validacion en orange
  Background: arranco la url de Orange
    Given abro la url de orange
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login

  Scenario: El usuario procede a ingresar a la plataforma desde la vista principal
    Given ingreso usuario "Admin" y contraseña "admin123" y doy click en iniciar sesion
    Then  Valido ingreso de login

  Scenario: El usuario utiliza el filtro para visualizar unicamente los usuarios que tienen el rol de Admin
    Given ingreso al modulo admin y realizo el filtro para solo ver el rol "Admin"
    Then  Valido que contengan los botones de editar y eliminar

 Scenario Outline: agregar nuevo usuario
    Given ingreso al menu "Admin" y agrego le doy click al boton add
    Then  ingreso los datos "<userRole>" "<Employee Name>" "<Status>" "<Username>" "<Password>"
    And   verifico el registro
   Examples:
     | userRole | Employee Name | Status  | Username      | Password        |
     | Admin    | John A. Doe   | Enabled | HappyTesting  | HappyTesting123 |