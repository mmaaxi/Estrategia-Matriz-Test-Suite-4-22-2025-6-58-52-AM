package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page reportPage = new tc_004Page();

    @Given("el usuario ha ingresado al sistema contable")
    public void el_usuario_ha_ingresado_al_sistema_contable() {
        reportPage.loginToSystem();
    }

    @When("el usuario exporta el Reporte Contable")
    public void el_usuario_exporta_el_Reporte_Contable() {
        reportPage.exportReport();
    }

    @Then("la columna 'Monto acumulado Folio Reserva 5401' aparece inmediatamente a la derecha de la columna X")
    public void validar_columna_monto_acumulado() {
        assertTrue(reportPage.isColumnPresent());
    }

    @Given("el reporte contable está abierto")
    public void el_reporte_contable_esta_abierto() {
        reportPage.openReport();
    }

    @When("el usuario calcula el valor usando la suma de 'monto de reserva acumulado inmediata anterior' y 'monto de reserva actual' en filas de ejemplo")
    public void calcular_monto_acumulado() {
        reportPage.calculateAccumulatedAmount();
    }

    @Then("el resultado es correcto y coincide con el cálculo manual")
    public void validar_calculo() {
        assertTrue(reportPage.isCalculationCorrect());
    }
}