import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_001Page {
    private WebDriver driver;
    private By columnCFormula = By.xpath("//some_xpath_for_column_C");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportAccountingReport() {
        // Code to export accounting report
        // e.g., click export button
    }

    public void verifyFormulaInColumnC() {
        // Code to verify formula in Column C
    }

    public boolean isColumnCFormatCorrect() {
        List<WebElement> columnCValues = driver.findElements(columnCFormula);
        for (WebElement cell : columnCValues) {
            String formulaText = cell.getText();
            if (!formulaText.matches("^\\w+_\\w+_\\w+_\\w+_\\w+$")) {
                return false;
            }
        }
        return true;
    }
}