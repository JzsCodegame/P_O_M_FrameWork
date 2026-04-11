package framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public final class ExcelKeyValueConfigReader {

    private ExcelKeyValueConfigReader() {
    }

    public static Map<String, String> read(Path excelPath, String sheetName) throws IOException {
        try (InputStream inputStream = Files.newInputStream(excelPath);
             Workbook workbook = WorkbookFactory.create(inputStream)) {
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet not found: " + sheetName);
            }

            Map<String, String> data = new LinkedHashMap<>();
            DataFormatter formatter = new DataFormatter();
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) {
                    continue;
                }

                String key = formatter.formatCellValue(row.getCell(0)).trim();
                String value = formatter.formatCellValue(row.getCell(1)).trim();
                if (!key.isEmpty()) {
                    data.put(key, value);
                }
            }

            return Collections.unmodifiableMap(data);
        }
    }
}
