package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAttributes {

    @FindBy(name = "user-name")
    public WebElement preencherUsername;
    @FindBy(name = "password")
    public WebElement preencherPassword;
    @FindBy(id = "login-button")
    public WebElement botaoLogin;
}
