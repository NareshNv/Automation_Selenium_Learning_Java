package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginUserData {

	public Object[][] readExceil() throws IOException {

		String fileLocation = "./test data/Login User Data.xlsx";

		XSSFWorkbook workBook = new XSSFWorkbook(fileLocation);

		XSSFSheet sheet = workBook.getSheetAt(0);
		// XSSFRow row = sheet.getRow(0);
		// XSSFCell cell = row.getCell(0);

		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] userdata = new String[lastRowNum][lastCellNum];

		for (int i = 1; i <= lastRowNum; i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {

				XSSFCell cell = row.getCell(j);
				// System.out.println(cell.getStringCellValue());

				DataFormatter data = new DataFormatter(); // It will format all data
				String formatCellValue = data.formatCellValue(cell);
				System.out.println(formatCellValue);
				userdata[i-1][j]= formatCellValue;

			}
		}
		workBook.close();
		return userdata;
	}


}
