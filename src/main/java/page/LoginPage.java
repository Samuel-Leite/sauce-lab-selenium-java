package page;

import attributes.LoginAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginAttributes {

    public WebDriver driver;

    public void acessarPlataforma(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        PageFactory.initElements(driver, this);

        driver.get("https://www.saucedemo.com/");
    }

    public void informarCredenciair(){
        preencherUsername.sendKeys("standard_user");
        preencherPassword.sendKeys("secret_sauce");
        botaoLogin.click();
    }
}

