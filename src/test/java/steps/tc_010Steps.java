package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page reportPage = PageFactory.initElements(driver, tc_010Page.class);

    @Given("^El usuario está en la página del Reporte Contable$")
    public void el_usuario_está_en_la_página_del_reporte_contable() {
        driver.get("URL_DE_LA_PAGINA_DEL_REPORTE");
    }

    @When("^El usuario exporta el Reporte Contable$")
    public void el_usuario_exporta_el_reporte_contable() {
        reportPage.exportarReporteContable();
    }

    @Then("^La columna 'Folio Pre solicitud' está a la derecha del campo 'Ramo'$")
    public void la_columna_folio_pre_solicitud_está_a_la_derecha_del_campo_ramo() {
        assertTrue(reportPage.isFolioPreSolicitudInCorrectPosition());
    }

    @Then("^La columna 'Folio de Pago' está a la derecha de la columna 'Folio Pre solicitud'$")
    public void la_columna_folio_de_pago_está_a_la_derecha_de_la_columna_folio_pre_solicitud() {
        assertTrue(reportPage.isFolioDePagoInCorrectPosition());
    }

    @Then("^Ambas columnas están vacías o contienen valores por defecto$")
    public void ambas_columnas_están_vacías_o_contienen_valores_por_defecto() {
        assertTrue(reportPage.areColumnsEmptyOrWithDefaultValues());
    }
}