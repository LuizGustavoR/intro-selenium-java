package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    @FindBy(id = "zci-calculator")
    private WebElement calculator;

    @FindBy(id = "display")
    private WebElement display;

    public CalculatorPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public boolean isCalculatorFeatureDisplayed(){
        return calculator.isDisplayed();
    }

    public String getMathOperationResult() {
        return display.getText();
    }

}
