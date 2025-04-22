package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_002Page {
    
    private final String filePath = "path/to/exported/report.xlsx";
    
    public void exportFinancialReport() {
        // Implementation for exporting the financial report
    }

    public void openExcelSheet() {
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            validateColumnPosition(sheet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isEstadoCodigoColumnInCorrectPosition() {
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);
            Cell cell = headerRow.getCell(9); // Column J (to the right of Column I which is index 8)
            return "Estado Código".equals(cell.getStringCellValue());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isHeaderPositionCorrect() {
        // Additional checks if needed for header position
        // This example uses the same condition for simplicity
        return isEstadoCodigoColumnInCorrectPosition();
    }

    private void validateColumnPosition(Sheet sheet) {
        // Additional validations can be added if required; placeholder for extensibility
    }
}