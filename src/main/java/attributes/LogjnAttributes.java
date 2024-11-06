package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogjnAttributes {

    @FindBy(name = "user-name")
    public WebElement txtUsername;

    @FindBy(name = "password")
    public WebElement txtPassword;

    @FindBy(id = "login-button")
    public WebElement btnLogin;
}
