package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("El usuario ha exportado el Reporte Contable")
    public void elUsuarioHaExportadoElReporteContable() {
        page.exportarReporteContable();
    }

    @When("El usuario verifica la columna 'IVA retenido' en la hoja Excel")
    public void elUsuarioVerificaLaColumnaIVAenLaHojaExcel() {
        page.verificarColumnaIVAExcel();
    }

    @Then("La columna 'IVA retenido' aparece correctamente")
    public void laColumnaIVAapareceCorrectamente() {
        page.validarExistenciaColumnaIVA();
    }

    @When("El usuario comprueba el cálculo en la columna para movimientos que lo requieren")
    public void elUsuarioCompruebaElCalculoEnLaColumna() {
        page.comprobarCalculoIVA();
    }

    @Then("El valor mostrado es el monto retenido correcto")
    public void elValorMostradoEsElMontoRetenidoCorrecto() {
        page.validarMontoRetenidoCorrecto();
    }
}