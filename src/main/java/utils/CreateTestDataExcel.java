package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTestDataExcel {
	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();

		// Sheet1: Kullanıcı Bilgileri
		Sheet sheet1 = workbook.createSheet("Sheet1");
		Object[][] userData = {
				{"Kullanıcı Adı", "Şifre", "Yetki Seviyesi"},
				{"admin", "admin123", "Yüksek"},
				{"test_user", "test@123", "Orta"},
				{"guest", "guest123", "Düşük"}
		};
		populateSheet(sheet1, userData);

		// Sheet2: Ürün Bilgileri
		Sheet sheet2 = workbook.createSheet("Sheet2");
		Object[][] productData = {
				{"Ürün Adı", "Fiyat", "Stok Durumu"},
				{"Telefon", 5000, "Var"},
				{"Laptop", 10000, "Yok"},
				{"Tablet", 3000, "Var"}
		};
		populateSheet(sheet2, productData);

		// Excel dosyasını kaydet
		try (FileOutputStream fos = new FileOutputStream("src/test/resources/TestData.xlsx")) {
			workbook.write(fos);
			System.out.println("Excel dosyası başarıyla oluşturuldu: TestData.xlsx");
		} catch (IOException e) {
			System.err.println("Excel dosyası oluşturulurken hata meydana geldi: " + e.getMessage());
		}
	}

	private static void populateSheet(Sheet sheet, Object[][] data) {
		int rowCount = 0;
		for (Object[] rowData : data) {
			Row row = sheet.createRow(rowCount++);
			int columnCount = 0;
			for (Object field : rowData) {
				Cell cell = row.createCell(columnCount++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}
	}
}
