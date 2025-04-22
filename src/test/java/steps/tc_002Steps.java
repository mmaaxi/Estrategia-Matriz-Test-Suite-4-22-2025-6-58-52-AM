package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    private tc_002Page reportPage = new tc_002Page();

    @Given("I have exported the Financial Report")
    public void i_have_exported_the_Financial_Report() {
        reportPage.exportFinancialReport();
    }

    @When("I open the Excel sheet")
    public void i_open_the_Excel_sheet() {
        reportPage.openExcelSheet();
    }

    @Then("the column 'Estado Código' should be immediately to the right of column I")
    public void the_column_estado_codigo_should_be_immediately_to_the_right_of_column_I() {
        Assert.assertTrue(reportPage.isEstadoCodigoColumnInCorrectPosition());
    }

    @Then("the column header should be in the correct position")
    public void the_column_header_should_be_in_the_correct_position() {
        Assert.assertTrue(reportPage.isHeaderPositionCorrect());
    }
}