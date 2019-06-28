package org.maven.MavenSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Navin\\eclipse-workspace\\MavenSelenium\\excel\\datas.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows= s.getPhysicalNumberOfRows();
		System.out.println(rows);
		Row row = s.getRow(3);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		int type= cell.getCellType();
		System.out.println(type);
		if(type==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm/dd/yyyy");
			    String format=sim.format(d);
				System.out.println(format);
			}
			else {
				double num = cell.getNumericCellValue();
				long l = (long)num;
				String number = String.valueOf(1);
				System.out.println(number);
			}
		}
				System.out.println("add");
		}
		
	
}
	
	


