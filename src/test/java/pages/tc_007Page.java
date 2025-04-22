package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_007Page {
    WebDriver driver;

    By exportButton = By.id("exportButton");
    By ivaExentoColumn = By.xpath("//th[contains(text(),'IVA exento')]");
    
    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void login() {
        // Lógica para iniciar sesión en el sistema de reportes
    }

    public void exportarReporteContable() {
        driver.findElement(exportButton).click();
    }

    public boolean verificarPosicionColumnaIVAExento() {
        List<WebElement> columns = driver.findElements(By.xpath("//th"));
        int position = -1;

        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).getText().equals("IVA exento")) {
                position = i;
                break;
            }
        }
        
        return position != -1 && position == 5; // Supongamos que la posición esperada es la sexta columna (índice 5)
    }

    public boolean verificarMontosIVAExento() {
        List<WebElement> ivaExentoValues = driver.findElements(By.xpath("//td[position()=6]"));
        
        // Validación de cada valor de la columna 'IVA exento'
        for (WebElement value : ivaExentoValues) {
            if (!valorEsCorrecto(value.getText())) {
                return false;
            }
        }
        return true;
    }

    private boolean valorEsCorrecto(String valor) {
        // Implementar la lógica para verificar si el valor es correcto
        return true;
    }
}