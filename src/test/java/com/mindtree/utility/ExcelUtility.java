package com.mindtree.utility;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import com.mindtree.reusableComponents.WebDriverHelper;

public class ExcelUtility extends WebDriverHelper {
	public static String Excelread(int rownum, int cellnum) throws IOException {
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = null;
		if (cell.getCellType() == CellType.STRING) {
			value = cell.getStringCellValue();
		}

		else if (cell.getCellType() == CellType.NUMERIC) {
			value = ((int) cell.getNumericCellValue() + "");
		}
		return value;
	}
}
