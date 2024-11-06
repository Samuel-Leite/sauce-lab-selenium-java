package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import support.WebDriverManager;

import java.io.IOException;

public class Hook {

    public static WebDriver driver;
    WebDriverManager webDriverManager;

    public Hook() {
        webDriverManager = new WebDriverManager();
    }

    @Before
    public void inicializarNavegador() throws IOException {
        // Inicializa o WebDriver antes do cenário de teste
        driver = webDriverManager.setupWebDriver();
    }

    @After
    public void finalizarNavegador() {
        // Encerra o WebDriver após o cenário de teste
        if (driver != null) {
            driver.quit();  // Fechar o navegador
        }
    }
}
