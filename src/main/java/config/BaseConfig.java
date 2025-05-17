package config;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseConfig {
    protected WebDriver driver;

    // Método para inicializar el WebDriver

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    // Método para cerrar el WebDriver
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Método para obtener el WebDriver
    public WebDriver getDriver() {
        return driver;
    }
}
