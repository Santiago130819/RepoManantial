package locators;

import org.openqa.selenium.By;

public class locators {

    public static final By USERNAME_FIELD = By.name("username");
    public static final By PASSWORD_FIELD = By.name("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[contains(normalize-space(.), 'Login')]");
    public static final By OPTION_ADMIN = By.xpath("//ul/li[1]/a/span[contains(normalize-space(.), 'Admin')]");
    public static final By LABEL_LOGIN = By.xpath("//h6[contains(normalize-space(.), 'Dashboard')]");
    public static final By SELECT_ROL = By.xpath("//*[@class='oxd-select-text oxd-select-text--active']");
    public static final By BTN_SEARCH = By.xpath("//button[contains(normalize-space(.), 'Search')]");
    public static final By TABLE_USERS = By.xpath("//div[@class='oxd-table']");
    public static final By FILAS_USERS = By.xpath("//div[contains(@class, 'oxd-table-row')]");
    public static final By BTN_ADD = By.xpath("//button[contains(normalize-space(.), 'Add')]");
    public static final By SELECT_STATUS = By.xpath("//div[3]/div/div[2]/div/div[@class='oxd-select-text oxd-select-text--active']");
    public static final By INPUT_EMPLOYE_NAME = By.xpath("//input[@placeholder='Type for hints...']");
    public static final By INPUT_USER_NAME = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    public static final By INPUT_PASSWORD = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    public static final By INPUT_REPASSWORD = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    public static final By BTN_SAVE = By.xpath("//button[contains(normalize-space(.), 'Save')]");
}