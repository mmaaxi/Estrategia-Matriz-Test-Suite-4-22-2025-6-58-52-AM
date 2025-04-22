package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    WebDriver driver;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMovementsPage() {
        driver.get("http://example.com/movements");
    }

    public void identifyPaymentMovements() {
        // Logic to identify payment movements
        WebElement paymentMovementTable = driver.findElement(By.id("paymentMovementTable"));
        // Further processing
    }

    public void applyNewFormula() {
        // Logic to apply the formula
        WebElement z4 = driver.findElement(By.id("Z4"));
        WebElement ad5 = driver.findElement(By.id("AD5"));
        WebElement ae5 = driver.findElement(By.id("AE5"));
        WebElement ah5 = driver.findElement(By.id("AH5"));
        WebElement ac5 = driver.findElement(By.id("AC5"));
        WebElement ab5 = driver.findElement(By.id("AB5"));
        WebElement am5 = driver.findElement(By.id("AM5"));

        double result = Double.parseDouble(z4.getText()) +
                        Double.parseDouble(ad5.getText()) +
                        Double.parseDouble(ae5.getText()) +
                        Double.parseDouble(ah5.getText()) +
                        Double.parseDouble(ac5.getText()) +
                        Double.parseDouble(ab5.getText()) +
                        Double.parseDouble(am5.getText());

        // Save or display result
    }

    public double calculateManually() {
        // Manual calculation for testing purposes
        double z4 = Double.parseDouble(driver.findElement(By.id("Z4")).getText());
        double ad5 = Double.parseDouble(driver.findElement(By.id("AD5")).getText());
        double ae5 = Double.parseDouble(driver.findElement(By.id("AE5")).getText());
        double ah5 = Double.parseDouble(driver.findElement(By.id("AH5")).getText());
        double ac5 = Double.parseDouble(driver.findElement(By.id("AC5")).getText());
        double ab5 = Double.parseDouble(driver.findElement(By.id("AB5")).getText());
        double am5 = Double.parseDouble(driver.findElement(By.id("AM5")).getText());

        return z4 + ad5 + ae5 + ah5 + ac5 + ab5 + am5;
    }

    public double getExpectedResult() {
        // Expected result, possibly fetched from UI or test data
        return 100.00; // Example expected result
    }
}