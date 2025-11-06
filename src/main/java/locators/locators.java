package locators;

import org.openqa.selenium.By;

public class locators {

    public static final By USERNAME_FIELD = By.name("username");
    public static final By PASSWORD_FIELD = By.name("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[contains(normalize-space(.), 'Login')]");
    public static final By OPTION_ADMIN = By.xpath("//span[contains(normalize-space(.), 'Admin')]");
    public static final By OPTION_PIM = By.xpath("//span[contains(normalize-space(.), 'PIM')]");
    public static final By LABEL_LOGIN = By.xpath("//h6[contains(normalize-space(.), 'Dashboard')]");
    public static final By SELECT_ROL = By.xpath("//*[@class='oxd-select-text oxd-select-text--active']");
    public static final By BTN_SEARCH = By.xpath("//button[contains(normalize-space(.), 'Search')]");
    public static final By TABLE_USERS = By.xpath("//div[@class='oxd-table']");
    public static final By FILAS_USERS = By.xpath("//div[contains(@class, 'oxd-table-row')]");
    public static final By BTN_ADD = By.xpath("//button[contains(normalize-space(.), 'Add')]");
    public static final By RADIO_STATUS_ENABLED = By.xpath("//label[contains(normalize-space(.), 'Enabled')]");
    public static final By RADIO_STATUS_DISABLED = By.xpath("//label[contains(normalize-space(.), 'Disabled')]");
    public static final By CHECKBOX_CREATE_DETAILS = By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']");

    public static final By INPUT_EMPLOYE_NAME = By.xpath("(//*[@placeholder='Type for hints...'])[1]");
    public static final By INPUT_FISRT_NAME = By.xpath("//*[@name='firstName']");
    public static final By INPUT_LAST_NAME = By.xpath("//*[@name='lastName']");
    public static final By INPUT_USER_NAME = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    public static final By INPUT_PASSWORD = By.xpath("(//input[@type='password'])[1]");
    public static final By INPUT_REPASSWORD = By.xpath("(//input[@type='password'])[2]");
    public static final By BTN_SAVE = By.xpath("//button[contains(normalize-space(.), 'Save')]");
}