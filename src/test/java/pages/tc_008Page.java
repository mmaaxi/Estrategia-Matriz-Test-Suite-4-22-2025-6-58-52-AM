package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_008Page {

    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarReporteContable() {
        // Lógica para exportar el reporte contable
    }

    public void verificarColumnaIVAExcel() {
        // Lógica para abrir el archivo Excel y encontrar la columna 'IVA retenido'
    }

    public void validarExistenciaColumnaIVA() {
        // Lógica para validar que la columna 'IVA retenido' existe en el archivo Excel
    }

    public void comprobarCalculoIVA() {
        // Lógica para comprobar el cálculo o el valor en la columna 'IVA retenido'
    }

    public void validarMontoRetenidoCorrecto() {
        // Lógica para validar el monto retenido correcto en la fila requerida
    }
}