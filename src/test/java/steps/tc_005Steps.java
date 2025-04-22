package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page reportPage = new tc_005Page();

    @Given("El usuario ha exportado el Reporte Contable")
    public void el_usuario_ha_exportado_el_Reporte_Contable() {
        reportPage.navigateToReport();
        reportPage.exportReport();
    }

    @When("El usuario revisa la columna 'Monto Acumulado Folio OPC \\(2121)' en la Columna Z")
    public void el_usuario_revisa_la_columna() {
        reportPage.openReport();
    }

    @Then("El encabezado de la columna debe ser 'Monto Acumulado Folio OPC \\(2121)'")
    public void el_encabezado_de_la_columna_debe_ser_correcto() {
        String columnHeader = reportPage.getColumnHeader("Z");
        Assert.assertEquals("Monto Acumulado Folio OPC (2121)", columnHeader);
    }

    @Then("Los datos de la columna deben coincidir con los originales")
    public void los_datos_de_la_columna_deben_coincidir_con_los_originales() {
        boolean isDataConsistent = reportPage.isDataConsistent("Z");
        Assert.assertTrue(isDataConsistent);
    }
}