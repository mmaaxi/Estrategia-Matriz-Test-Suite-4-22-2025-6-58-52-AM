import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_001Steps {

    private tc_001Page page = new tc_001Page();

    @Given("the user exports the accounting report")
    public void the_user_exports_the_accounting_report() {
        page.exportAccountingReport();
    }

    @When("the user verifies the formula in Column C")
    public void the_user_verifies_the_formula_in_Column_C() {
        page.verifyFormulaInColumnC();
    }

    @Then("the values in Column C should follow the specified format")
    public void the_values_in_Column_C_should_follow_the_specified_format() {
        boolean isFormatCorrect = page.isColumnCFormatCorrect();
        Assert.assertTrue("The format in Column C is not correct", isFormatCorrect);
    }
}