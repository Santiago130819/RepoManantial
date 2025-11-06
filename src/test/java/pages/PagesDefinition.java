package pages;

import constant.Constant;
import driver.DriverManager;
import locators.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class PagesDefinition  {

    private WebDriver driver;

    public PagesDefinition(){
        this.driver = DriverManager.getDriver();
    }
    public void arrancoUrlOrange() {
        driver.get(Constant.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void loginOrange(String username, String password) {
        driver.findElement(locators.USERNAME_FIELD).sendKeys(username);
        driver.findElement(locators.PASSWORD_FIELD).sendKeys(password);
        driver.findElement(locators.LOGIN_BUTTON).click();
    }

    public void validoLoginCorrecto() {
        if (driver.findElement(locators.LABEL_LOGIN).isDisplayed()) {
            System.out.println("Login Correcto");
        } else {
            System.out.println("error en login");
        }

    }
    public void procesoFiltro(String filtro) throws InterruptedException {
        driver.findElement(locators.OPTION_ADMIN).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement combo = driver.findElement(locators.SELECT_ROL);
        if (combo.isEnabled()) {
            combo.click();
            Thread.sleep(1000);
            List<WebElement> opciones = driver.findElements(By.xpath("//div[@role='option']"));
            for (WebElement opcion : opciones) {
                if (opcion.getText().equalsIgnoreCase(filtro)) {
                    opcion.click();
                    Thread.sleep(1000);
                    driver.findElement(locators.BTN_SEARCH).click();
                    break;
                }
            }
        } else {
            System.out.println("no esta habilitado el elemento");
        }
    }
    public void validoTablaUsers()  {
        WebElement tabla = driver.findElement(locators.TABLE_USERS);
        List<WebElement> filas = tabla.findElements(locators.FILAS_USERS);
        // Iterar sobre las filas y mostrar el texto de cada celda
        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            List<WebElement> celdas = fila.findElements(By.xpath(".//div[contains(@class, 'oxd-table-cell')]"));
            System.out.print("Fila " + (i + 1) + ": ");
            for (WebElement celda : celdas) {
                System.out.print(celda.getText() + " | ");
            }
            System.out.println();
        }
    }
    public void seleccionMenuAdd(String opcion){
        driver.findElement(locators.OPTION_PIM).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(locators.BTN_ADD).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(locators.CHECKBOX_CREATE_DETAILS).click();
    }
    public void registroNuevoUsuario(String firstName, String last, String status, String user, String pas) throws InterruptedException {
        WebElement inputName = driver.findElement(locators.INPUT_FISRT_NAME);
        inputName.sendKeys(firstName);
        WebElement lastName = driver.findElement(locators.INPUT_LAST_NAME);
        lastName.sendKeys(last);
        WebElement radioOK = driver.findElement(locators.RADIO_STATUS_ENABLED);
        WebElement radioNOOK = driver.findElement(locators.RADIO_STATUS_DISABLED);
        if(status.equalsIgnoreCase("Enabled")){
            radioOK.click();
        }else {
            radioNOOK.click();
        }
        WebElement inputUserName = driver.findElement(locators.INPUT_USER_NAME);
        inputUserName.sendKeys(user);
        WebElement inputPass = driver.findElement(locators.INPUT_PASSWORD);
        inputPass.click();
        inputPass.sendKeys(pas);
        inputPass.sendKeys(Keys.TAB);
        Thread.sleep(Duration.ofSeconds(2));
        WebElement inputRePass = driver.findElement(locators.INPUT_REPASSWORD);
        inputRePass.sendKeys(pas);
        WebElement save = driver.findElement(locators.BTN_SAVE);
        save.click();
    }
}









