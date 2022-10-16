package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(name = "q")
    private WebElement searchFormInput;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void searchTheWeb(String search){
        searchFormInput.sendKeys(search);
        searchFormInput.sendKeys(Keys.RETURN);
    }

}
