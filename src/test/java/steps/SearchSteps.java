package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {

    private StepData stepData;
    public SearchSteps(StepData stepData) {
        this.stepData = stepData;
    }

    @When("I search for {string}")
    public void iSearchFor(String fruit) {
        stepData.getHomePage().searchTheWeb(fruit);
    }

    @Then("results title contain {string}")
    public void resultsTitleContain(String fruit) {
        String actual = stepData.getResultPage().getPageTitle();
        Assert.assertTrue(actual.contains(fruit));
    }

}
