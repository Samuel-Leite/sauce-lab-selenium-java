package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAttributes {

    @FindBy(xpath = "//div[contains(text(), 'Swag Labs')]")
    public WebElement mensagemLoginSucesso;
    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuHamburguer;
    @FindBy(id = "logout_sidebar_link")
    public WebElement botaoLogout;
}
