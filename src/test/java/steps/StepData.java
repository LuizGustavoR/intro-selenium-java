package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ResultPage;
import setup.SetupMyWebDriver;

import java.io.ByteArrayInputStream;

public class StepData {

    private Scenario scenario;
    private WebDriver webDriver;
    private HomePage homePage;
    private ResultPage resultPage;

    @Before
    public void setup(Scenario scenario){
        this.scenario = scenario;
        webDriver = new SetupMyWebDriver().getWebDriver();
        homePage = new HomePage(webDriver);
        resultPage = new ResultPage(webDriver);
    }

    @Given("The duckduckgo page is displayed")
    public void theDuckduckgoPageIsDisplayed() {
        webDriver.get("https://duckduckgo.com/");
    }

    @After
    public void tearDown(){
        screenshot();
        webDriver.quit();
    }

    private void screenshot(){
        Allure.addAttachment(scenario.getName() + "+" + System.currentTimeMillis(),
                new ByteArrayInputStream(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES)));
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public ResultPage getResultPage() {
        return resultPage;
    }

}
