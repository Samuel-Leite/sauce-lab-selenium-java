package page;

import attributes.LogjnAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LogjnAttributes {

    public WebDriver driver;

    public void acessarPlataforma(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        PageFactory.initElements(driver, this);

        driver.get("https://www.saucedemo.com/");
    }

    public void informarCredenciair(){
        txtUsername.sendKeys("standard_user");
        txtPassword.sendKeys("secret_sauce");
        btnLogin.click();
    }
}
