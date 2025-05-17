package stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.PagesDefinition;
import config.BaseConfig;

public class StepsOrangeDefinitions extends BaseConfig{

    private PagesDefinition pagesDefinition;

    @Before
    public void setUp() {
        super.setUp();  // Inicializa el WebDriver desde BaseConfig
        WebDriver driver = getDriver();
        pagesDefinition = new PagesDefinition(driver);  // Inicializa pagesDefinition con el driver
    }

    @Given("ingreso usuario {string} y contraseña {string} y doy click en iniciar sesion")
    public void ingresoCredencialesInicioSesion(String user, String pass) {
        pagesDefinition.loginOrange(user, pass);
    }

    @Then("Valido ingreso de login")
    public void validacionLoginLibey() {
        pagesDefinition.validoLoginCorrecto();
    }
    @Given("abro la url de orange")
    public void abroLaUrLOrange() {
        pagesDefinition.arrancoUrlOrange();
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
