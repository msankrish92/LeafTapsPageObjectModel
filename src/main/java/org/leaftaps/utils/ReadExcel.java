package org.leaftaps.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String excelPath) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook(excelPath);

		XSSFSheet sheet = book.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();

		int colCount = sheet.getRow(1).getLastCellNum();

//		System.out.println(rowCount + " " + colCount);

//		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());

		String[][] excelData = new String[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				excelData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return excelData;
	}

}
