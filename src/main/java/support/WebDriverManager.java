package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverManager {

    private WebDriver driver;

    public WebDriver setupWebDriver() throws IOException {
        if (driver == null) {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("baseUrl");

            // Configuração do navegador
            if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            } else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (properties.getProperty("browser").equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//msedgedriver.exe");

                EdgeOptions options = new EdgeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(options);
            }

            driver.manage().window().maximize();
            driver.get(url);  // A URL será fornecida pela propriedade no arquivo global.properties
        }
        return driver;
    }
}
