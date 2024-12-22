package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataDriven {
	
	@Test
	public void ddt() throws IOException {

	FileInputStream fis = new FileInputStream(
			"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumFrameworkUdemy\\TestData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);

	int sheets = workbook.getNumberOfSheets();

	for(int i= 0;i<sheets;i++)
	{
		if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {

			XSSFSheet sheet = workbook.getSheetAt(i);
			Iterator<Row> rows = sheet.iterator();
			Row firstrow = rows.next();
			Iterator<Cell> ce = firstrow.cellIterator();

			while (ce.hasNext()) {
				Cell value = ce.next();
				if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {

				}

			}

		}
	}
}}
