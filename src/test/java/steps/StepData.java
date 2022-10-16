package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ResultPage;
import setup.SetupMyWebDriver;

public class StepData {

    private WebDriver webDriver;
    private HomePage homePage;
    private ResultPage resultPage;

    @Before
    public void setup(){
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
        webDriver.quit();
    }

//    @AfterMethod
//    public void recordFailure(ITestResult result){
//        if(ITestResult.FAILURE == result.getStatus())
//        {
//            var camera = (TakesScreenshot)webDriver();
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try{
//                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }

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
