package page;

import attributes.LogjnAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends LogjnAttributes {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Inicializa os elementos da página
    }

    // A URL será aberta pela classe de hook, não é necessário fazer isso aqui
    public void acessarPlataforma() {
        driver.get("https://www.saucedemo.com/");
    }

    public void informarCredenciais() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
        Properties properties = new Properties();
        properties.load(fis);
        String user = properties.getProperty("usuario");
        String password = properties.getProperty("senha");

        // Realizando a ação de login
        txtUsername.sendKeys(user);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }
}
