package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {
            driver = new ChromeDriver(); // o FirefoxDriver, etc.
            driver.manage().window().maximize();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*"); // solo si es necesario
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--no-sandbox");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
