package test;

import generic.Excel;

public class testexcel {
	public static void main(String[] args) {
		
	
	Excel e = new Excel("D:\\Downloads\\applaunch-master (1)\\need\\excel\\excel.xlsx");
	String un= e.getData("sheet1", 0, 0);
	String pw = e.getData("sheet1", 0, 1);
	System.out.println(un+pw);
	
	}
}
