package apchopoi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {

		String fname = "D:\\Excelsheet.xlsx";
		FileInputStream fs = new FileInputStream(fname);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		int rows = sh.getLastRowNum();
		int col = sh.getRow(1).getLastCellNum();
		for (int i = 0; i <= rows; i++) {
			XSSFRow r = sh.getRow(i);

			for (int j = 0; j < col; j++) {
				XSSFCell cell = r.getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + " ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + " ");
					break;
				}
			}
			System.out.println("-------");
		}

	}

}
