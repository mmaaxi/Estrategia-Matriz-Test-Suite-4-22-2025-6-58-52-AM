package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_011Page {
    WebDriver driver;

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    private By statusDePagoColumna = By.xpath("//th[contains(text(),'Status de Pago')]");
    private By descripcionStatusPagoColumna = By.xpath("//th[contains(text(),'Descripción Status Pago')]");
    private By statusPagoCodigoColumna = By.xpath("//th[contains(text(),'Status Pago Código')]");
    private By fechaDePagoColumna = By.xpath("//th[contains(text(),'Fecha de Pago')]");

    public void exportarReporteContable() {
        // Lógica para exportar el reporte contable
    }

    public boolean existeColumnaStatusPagoCodigoADerechaDeFechaDePago() {
        // Lógica para verificar la posición de la columna 'Status Pago Código'
        int indexFechaDePago = driver.findElements(fechaDePagoColumna).get(0).getLocation().getX();
        int indexStatusPagoCodigo = driver.findElements(statusPagoCodigoColumna).get(0).getLocation().getX();
        return indexStatusPagoCodigo > indexFechaDePago;
    }

    public boolean isStatusDePagoRenombradoACorrectamente() {
        // Lógica para verificar si se ha renombrado a 'Descripción Status Pago'
        return driver.findElements(descripcionStatusPagoColumna).size() > 0;
    }
}