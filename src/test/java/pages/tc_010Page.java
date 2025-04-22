package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_010Page {
    WebDriver driver;

    @FindBy(id = "exportButton")
    WebElement exportButton;

    @FindBy(xpath = "//table//th[contains(text(),'Folio Pre solicitud')]/following-sibling::th[contains(text(),'Ramo')]")
    WebElement folioPreSolicitudColumn;

    @FindBy(xpath = "//table//th[contains(text(),'Folio de Pago')]/following-sibling::th[contains(text(),'Folio Pre solicitud')]")
    WebElement folioDePagoColumn;

    @FindBy(xpath = "//table//th[contains(text(),'Folio Pre solicitud')]/following-sibling::th")
    WebElement emptyPreSolicitudColumn;

    @FindBy(xpath = "//table//th[contains(text(),'Folio de Pago')]/following-sibling::th")
    WebElement emptyFolioPagoColumn;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarReporteContable() {
        exportButton.click();
    }

    public boolean isFolioPreSolicitudInCorrectPosition() {
        return folioPreSolicitudColumn.isDisplayed();
    }

    public boolean isFolioDePagoInCorrectPosition() {
        return folioDePagoColumn.isDisplayed();
    }

    public boolean areColumnsEmptyOrWithDefaultValues() {
        // Assume there is logic to check if columns are empty or have default values
        return emptyPreSolicitudColumn.getText().isEmpty() && emptyFolioPagoColumn.getText().isEmpty();
    }
}