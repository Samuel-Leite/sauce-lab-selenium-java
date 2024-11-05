package page;

import attributes.LogjnAttributes;
import org.openqa.selenium.By;
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
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
