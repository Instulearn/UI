package utils;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
	private Workbook workbook;

	public ExcelReader(String filePath) {
		File file = new File(filePath);
		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(file)) {
				workbook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				throw new RuntimeException("Failed to read Excel file: " + e.getMessage());
			}
		} else {
			workbook = new XSSFWorkbook(); // create new workbook if file doesn't exist
		}
	}

	// Belirli bir sheet'teki tüm verileri okur
	public List<List<String>> readSheet(String sheetName) {
		List<List<String>> data = new ArrayList<>();
		Sheet sheet = workbook.getSheet(sheetName);

		if (sheet == null) {
			throw new RuntimeException("Belirtilen sheet bulunamadı: " + sheetName);
		}

		for (Row row : sheet) {
			List<String> rowData = new ArrayList<>();
			for (Cell cell : row) {
				rowData.add(getCellValueAsString(cell));
			}
			data.add(rowData);
		}
		return data;
	}

	// Belirtilen sheet ve hücreye değer yazar
	public void writeCell(String sheetName, int rowIndex, int colIndex, String value, String outputPath) {
		Sheet sheet = workbook.getSheet(sheetName);

		if (sheet == null) {
			sheet = workbook.createSheet(sheetName); // Eğer sheet yoksa oluşturulur
		}

		Row row = sheet.getRow(rowIndex);
		if (row == null) {
			row = sheet.createRow(rowIndex);
		}

		Cell cell = row.getCell(colIndex);
		if (cell == null) {
			cell = row.createCell(colIndex);
		}

		cell.setCellValue(value);

		try (FileOutputStream fos = new FileOutputStream(outputPath)) {
			workbook.write(fos);
		} catch (IOException e) {
			throw new RuntimeException("Excel dosyasına yazılırken hata oluştu: " + e.getMessage());
		}
	}

	// Excel dosyasını kapatma
	public void close() {
		try {
			if (workbook != null) {
				workbook.close();
			}
		} catch (IOException e) {
			throw new RuntimeException("Excel dosyası kapatılırken hata oluştu: " + e.getMessage());
		}
	}

	// Hücredeki veriyi String olarak okuma
	private String getCellValueAsString(Cell cell) {
		DataFormatter formatter = new DataFormatter(); // Tüm formatları string'e dönüştürür
		return formatter.formatCellValue(cell);
	}
}
