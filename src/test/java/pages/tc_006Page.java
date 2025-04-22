package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc_006Page {

    WebDriver driver;
    
    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarReporteContable() {
        // Lógica para exportar el reporte contable a Excel
        WebElement exportButton = driver.findElement(By.id("exportButtonId"));
        exportButton.click();
    }

    public boolean existeColumnaIvaCero() {
        // Lógica para verificar si la columna 'IVA 0%' existe
        List<WebElement> headers = driver.findElements(By.cssSelector("table th"));
        for (WebElement header : headers) {
            if (header.getText().equals("IVA 0%")) {
                return true;
            }
        }
        return false;
    }

    public void revisarColumnaIvaCero() {
        // Lógica para revisar las celdas de la columna 'IVA 0%'
        // Aquí iría la lógica para navegar al archivo Excel y verificar su contenido
    }

    public boolean verificarContenidoColumnaIvaCero() {
        // Lógica para verificar el contenido de la columna 'IVA 0%'
        // Verificación según la lógica de negocio
        return true;  // Ejemplo de captura de devolución true si está correcto
    }
}