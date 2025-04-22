package steps;

import io.cucumber.java.en.*;
import pages.tc_007Page;
import static org.junit.Assert.assertTrue;

public class tc_007Steps {
    tc_007Page reportePage = new tc_007Page();

    @Given("el usuario tiene acceso al sistema de reportes contables")
    public void el_usuario_tiene_acceso_al_sistema_de_reportes_contables() {
        reportePage.login();
    }

    @When("el usuario exporta el Reporte Contable")
    public void el_usuario_exporta_el_Reporte_Contable() {
        reportePage.exportarReporteContable();
    }

    @Then("la columna 'IVA exento' debe aparecer en el documento en la posición designada")
    public void la_columna_IVA_exento_debe_aparecer_en_el_documento_en_la_posición_designada() {
        assertTrue(reportePage.verificarPosicionColumnaIVAExento());
    }

    @And("los montos en la columna 'IVA exento' deben ser correctos según los criterios de IVA exento")
    public void los_montos_en_la_columna_IVA_exento_deben_ser_correctos_segun_los_criterios_de_IVA_exento() {
        assertTrue(reportePage.verificarMontosIVAExento());
    }
}