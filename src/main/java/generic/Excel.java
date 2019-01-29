package generic;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
 	Workbook wb;
	public   Excel(String excelpath){
		try {
			FileInputStream fis= new FileInputStream(excelpath);
			 wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getData(String name, int row, int column){
		  Cell c = wb.getSheet(name).getRow(row).getCell(column);
		  DataFormatter df = new DataFormatter();
		  String value = df.formatCellValue(c);
		 return value ;	
	}
}
