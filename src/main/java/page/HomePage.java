package page;

import attributes.HomeAttributes;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends HomeAttributes {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validarLoginSucesso(){
        String titulo = driver.findElement(By.xpath("//div[contains(text(), 'Swag Labs')]")).getText();
        Assertions.assertEquals("Swag Labs", titulo);
    }

    public void efetuarLogout(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("logout_sidebar_link")).click();
        driver.quit();
    }
}
