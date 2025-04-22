package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_004Page {

    WebDriver driver = DriverFactory.getDriver();

    public void loginToSystem() {
        // Lógica para iniciar sesión en el sistema contable
    }

    public void exportReport() {
        // Lógica para exportar el reporte contable
    }

    public boolean isColumnPresent() {
        try {
            WebElement column = driver.findElement(By.xpath("//th[text()='Monto acumulado Folio Reserva 5401']/following-sibling::th[text()='X']"));
            return column != null;
        } catch (Exception e) {
            return false;
        }
    }

    public void openReport() {
        // Lógica para abrir el reporte contable
    }

    public void calculateAccumulatedAmount() {
        // Lógica para calcular el monto acumulado
    }

    public boolean isCalculationCorrect() {
        // Lógica para validar que el cálculo es correcto. Aquí se incluiría
        // el cálculo y la comparación manual.
        return true; // Retornar verdadero si el cálculo es correcto
    }
}