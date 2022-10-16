package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalculatorSteps {

    private StepData stepData;
    public CalculatorSteps(StepData stepData) {
        this.stepData = stepData;
    }

    @When("I do a simple math operation")
    public void iDoASimpleMathOperation() {
        stepData.getHomePage().searchTheWeb("4!");
    }

    @Then("the calculator feature is shown")
    public void theCalculatorFeatureIsShown() {
        Assert.assertTrue(stepData.getResultPage().getCalculatorPage().isCalculatorFeatureDisplayed());
    }

    @Then("results equals {string}")
    public void resultsEqualsResult(String result) {
        Assert.assertEquals(stepData.getResultPage().getCalculatorPage().getMathOperationResult(), result);
    }

}
