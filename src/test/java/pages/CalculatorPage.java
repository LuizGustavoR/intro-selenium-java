package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorPage {

    private WebDriver webDriver;

    @FindBy(id = "zci-calculator")
    private WebElement calculator;

    @FindBy(id = "display")
    private WebElement display;

    public CalculatorPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public boolean isCalculatorFeatureDisplayed(){
        return calculator.isDisplayed();
    }

    public String getMathOperationResult() {
        new WebDriverWait(webDriver, Duration.ofSeconds(6)).until(webDriver -> !display.getText().isEmpty());
        return display.getText();
    }

}
