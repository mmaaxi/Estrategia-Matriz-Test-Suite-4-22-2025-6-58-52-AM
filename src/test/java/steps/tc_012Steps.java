package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_012Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_012Steps {
    WebDriver driver;
    tc_012Page reportPage = new tc_012Page(driver);

    @Given("el usuario abre la aplicación de Reportes Contables")
    public void el_usuario_abre_la_aplicacion_de_reportes_contables() {
        reportPage.navigateToReportPage();
    }

    @When("el usuario ejecuta la acción de exportar el reporte contable")
    public void el_usuario_ejecuta_la_accion_de_exportar_el_reporte_contable() {
        reportPage.exportReport();
    }

    @Then("la fórmula de la columna 'IVA Acumulado' incluye únicamente IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO")
    public void la_formula_de_la_columna_iva_acumulado_incluye_unicamente_permitidos() {
        reportPage.validateIncludedIVATypes();
    }

    @Then("excluye IVA retenido")
    public void excluye_iva_retenido() {
        reportPage.validateExcludedIVATypes();
    }

    @Given("el usuario ingresa datos de prueba en la tabla de reportes")
    public void el_usuario_ingresa_datos_de_prueba_en_la_tabla_de_reportes() {
        reportPage.enterTestData();
    }

    @When("revisa la columna 'IVA Acumulado'")
    public void revisa_la_columna_iva_acumulado() {
        reportPage.checkIVAAcumuladoColumn();
    }

    @Then("verifica que la suma acumulada es correcta")
    public void verifica_que_la_suma_acumulada_es_correcta() {
        reportPage.verifyAccumulatedSum();
    }

    @Then("el IVA retenido no está incluido")
    public void el_iva_retenido_no_esta_incluido() {
        reportPage.ensureRetainedIVANotIncluded();
    }
}