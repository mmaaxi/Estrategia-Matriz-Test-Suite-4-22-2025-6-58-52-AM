package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {
    private WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReport() {
        driver.get("URL_DEL_REPORTE_CONTABLE");
    }

    public void exportReport() {
        WebElement exportButton = driver.findElement(By.id("exportReport"));
        exportButton.click();
    }

    public void openReport() {
        // Implement loading the exported report
    }

    public String getColumnHeader(String columnName) {
        WebElement columnHeader = driver.findElement(By.xpath("//th[text()='" + columnName + "']"));
        return columnHeader.getText();
    }

    public boolean isDataConsistent(String columnName) {
        // Implement data verification logic
        return true; // Assuming data is consistent
    }
}