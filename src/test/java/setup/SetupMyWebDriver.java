package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SetupMyWebDriver {

    private WebDriver webDriver;

    public SetupMyWebDriver() {
        String osName = System.getProperty("os.name").toLowerCase();
        switch (osName) {
            case "win" ->
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            case "mac" ->
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("disable-infobars");
        options.setHeadless(false);
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

}
