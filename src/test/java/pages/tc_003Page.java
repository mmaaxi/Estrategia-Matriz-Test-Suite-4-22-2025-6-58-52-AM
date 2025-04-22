import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    private WebDriver driver;
    private String initialState;
    private String updatedState;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("url_de_la_pagina");
    }

    public void saveInitialState() {
        initialState = driver.findElement(By.xpath("xpath_de_la_celda_estado")).getText();
    }

    public void performUpdate() {
        // Implementar la lógica para actualizar el campo 'estado'
    }

    public void saveUpdatedState() {
        updatedState = driver.findElement(By.xpath("xpath_de_la_celda_estado")).getText();
    }

    public boolean verifyStateChange() {
        // Comparar initialState y updatedState con lo esperado (Figura 3, Fila 12 – ID 11)
        return updatedState.equals("valor_esperado");
    }
}