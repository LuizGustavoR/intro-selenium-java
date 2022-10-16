package pages;

import org.openqa.selenium.WebDriver;

public class ResultPage {

    private WebDriver webDriver;
    private CalculatorPage calculatorPage;

    public ResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        calculatorPage = new CalculatorPage(this.webDriver);
    }

    public String getPageTitle(){
        return webDriver.getTitle();
    }

    public CalculatorPage getCalculatorPage() {
        return calculatorPage;
    }

}
