package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page reportPage = new tc_006Page();

    @Given("el usuario exporta el Reporte Contable a un archivo de Excel")
    public void exportaReporteContable() {
        reportPage.exportarReporteContable();
    }

    @When("el usuario revisa las celdas de la columna 'IVA 0%'")
    public void revisaCeldasIvaCero() {
        reportPage.revisarColumnaIvaCero();
    }

    @Then("la columna 'IVA 0%' aparece en la hoja de Excel")
    public void verificarExistenciaColumnaIvaCero() {
        Assert.assertTrue(reportPage.existeColumnaIvaCero());
    }

    @Then("los valores corresponden a montos que aplican al 0% de IVA conforme a la lógica de negocio")
    public void verificarContenidoColumnaIvaCero() {
        Assert.assertTrue(reportPage.verificarContenidoColumnaIvaCero());
    }
}