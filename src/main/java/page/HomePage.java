package page;

import attributes.HomeAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends HomeAttributes {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Inicializa os elementos
    }

    public void validarLoginSucesso(){
        String titulo = mensagemSucesso.getText();
        Assert.assertEquals("Swag Labs", titulo);
    }

    public void efetuarLogout() {
        menuHamburguer.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        btnLogout.click();
        driver.quit();
    }
}
