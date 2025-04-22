package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;

import static org.junit.Assert.assertEquals;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("El usuario accede a la aplicación de registros de movimiento")
    public void el_usuario_accede_a_la_aplicacion_de_registros_de_movimiento() {
        page.navigateToMovementsPage();
    }

    @When("El usuario identifica los registros de movimientos de 'pago'")
    public void el_usuario_identifica_los_registros_de_movimientos_de_pago() {
        page.identifyPaymentMovements();
    }

    @Then("Se debe aplicar la nueva fórmula: =Z4+AD5+AE5+AH5+AC5+AB5+AM5")
    public void se_debe_aplicar_la_nueva_formula() {
        page.applyNewFormula();
    }

    @Then("El resultado del cálculo manual debe coincidir con el resultado esperado")
    public void el_resultado_del_calculo_manual_debe_coincidir_con_el_resultado_esperado() {
        double manualCalculationResult = page.calculateManually();
        double expectedResult = page.getExpectedResult();
        assertEquals(expectedResult, manualCalculationResult, 0.01);
    }
}