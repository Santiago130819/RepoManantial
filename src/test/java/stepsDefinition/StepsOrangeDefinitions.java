package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PagesDefinition;

public class StepsOrangeDefinitions  {

    private PagesDefinition pagesDefinition;
    @Given("abro la url de orange")
    public void abroLaUrLOrange() {
        pagesDefinition = new PagesDefinition();
        pagesDefinition.arrancoUrlOrange();
    }
    @Given("ingreso usuario {string} y contraseña {string} y doy click en iniciar sesion")
    public void ingresoCredencialesInicioSesion(String user, String pass) {
        pagesDefinition.loginOrange(user, pass);
    }

    @Then("Valido ingreso de login")
    public void validacionLoginOrange() {
        pagesDefinition.validoLoginCorrecto();
    }


    @Given("ingreso al modulo admin y realizo el filtro para solo ver el rol {string}")
    public void seleccionoFiltro(String rol) throws InterruptedException {
        pagesDefinition.procesoFiltro(rol);
    }
    @Then("Valido que contengan los botones de editar y eliminar")
    public void validoTabla() {
        pagesDefinition.validoTablaUsers();
    }
    @Given("ingreso al menu {string} y agrego le doy click al boton add")
    public void seleccionMenuAdd(String opcion)  {
        pagesDefinition.seleccionMenuAdd(opcion);
    }
    @Then("ingreso los datos {string} {string} {string} {string} {string}")
    public void ingresoNuevoUsuario(String role, String name, String status, String user, String pass) throws InterruptedException {
        pagesDefinition.registroNuevoUsuario(role, name, status, user, pass);
    }
    @And("verifico el registro")
    public void verificoElRegistro(){

    }
}
