import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_003Steps {
    private tc_003Page page;

    public tc_003Steps() {
        this.page = new tc_003Page();
    }

    @Given("Me encuentro en la página específica con el campo 'estado'")
    public void setup() {
        page.navigateToPage();
    }

    @When("Comparo los valores en la columna 'estado' antes y después de la actualización")
    public void compareValues() {
        page.saveInitialState();
        page.performUpdate();
        page.saveUpdatedState();
    }

    @Then("Los cambios en el formato y contenido de la columna 'estado' coinciden con lo especificado")
    public void verifyChanges() {
        boolean changesMatch = page.verifyStateChange();
        Assert.assertTrue("Los cambios en el formato y contenido no coinciden con lo especificado", changesMatch);
    }
}