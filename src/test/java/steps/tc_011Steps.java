package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.tc_011Page;

public class tc_011Steps {
    WebDriver driver;
    tc_011Page reporteContablePage = new tc_011Page(driver);
    
    @When("exporto el Reporte Contable")
    public void exporto_el_Reporte_Contable() {
        reporteContablePage.exportarReporteContable();
    }
    
    @Then("la columna 'Status Pago Código' debe aparecer inmediatamente a la derecha de 'Fecha de Pago'")
    public void validar_ubicacion_Columna_Status_Pago_Codigo() {
        Assert.assertTrue(reporteContablePage.existeColumnaStatusPagoCodigoADerechaDeFechaDePago(),
                "La columna 'Status Pago Código' no se encontró a la derecha de 'Fecha de Pago'");
    }

    @Then("confirmo que la columna 'Status de Pago' se renombra a 'Descripción Status Pago'")
    public void confirmar_renombrado_Columna() {
        Assert.assertTrue(reporteContablePage.isStatusDePagoRenombradoACorrectamente(),
                "La columna 'Status de Pago' no está renombrada a 'Descripción Status Pago'");
    }
}