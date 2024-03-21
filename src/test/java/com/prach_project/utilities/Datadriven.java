package com.prach_project.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datadriven {

//	@DataProvider(name = "data from ramchi")
//	public Object[][] takeMyDataAndUse1(String username, String password) {
//		Object[][] ramchi = new Object[3][2];
//
//		ramchi[0][0] = "qwerty@gmail.com";
//		ramchi[0][1] = "rambo";
//
//		ramchi[1][0] = "qwerty@gmail.com";
//		ramchi[1][1] = "rambo1";
//
//		ramchi[2][0] = "user2";
//		ramchi[2][1] = "user2pw";
//
//		return ramchi;
//	}

//	Way = working fine used in TC_Login_001
//	@DataProvider(name = "data_from")
//	public Object[][] takeMyDataAndUse1() {
//		return new Object[][]
//		{
//			
//		{"qwerty@gmail.com", "rambo"},
//		{"qwerty@gmail.com", "rambo1"},
//		{"user2","user2pw"}
//		
//		};
//		
//	}

//	way==2   //need to modify some

//	public static void main(String[] args) throws IOException {
//		
//		Datadriven dd = new Datadriven();
//	dd.takeMyDataAndUse("TC_Login_001");
//	
//	}

	@DataProvider(name = "ramchi2")
	public String[][] takeMyDataAndUse(Method m) throws IOException {

		String dimp = m.getName();

		File file = new File("C:\\Users\\kahme\\OneDrive\\Desktop\\emptyexcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xbook = new XSSFWorkbook(fis);
		XSSFSheet xsheet = xbook.getSheet(dimp);

		int totalrow = xsheet.getLastRowNum() + 1; // 4
		int totalcolumn = xsheet.getRow(0).getLastCellNum(); // 2

		System.out.println(totalrow); // 4
		System.out.println(totalcolumn); // 2

		DataFormatter dftr = new DataFormatter();

		String[][] ramchi = new String[totalrow][totalcolumn];
		for (int i = 1; i < totalrow; i++) {
			for (int j = 0; j < totalcolumn; j++) {

//				System.out.print(xsheet.getRow(currentrow).getCell(currentcolumn).toString()); // removed ln to print
//																								// sidebyside
//				System.out.print("\t"); // it will tell to give the secondvalue space and removing ln will give values
//										// side by side

				ramchi[i-1][j] = dftr.formatCellValue(xsheet.getRow(i).getCell(j));
//				String username = dftr.formatCellValue(xsheet.getRow(i).getCell(j));
//				

				System.out.print(ramchi[i - 1][j] + " || ");
				
//				
			}

		}
		return ramchi;

	}

//	way==3

//	public static void main(String[] args) throws IOException {
//
//		File file = new File("C:\\Users\\kahme\\OneDrive\\Desktop\\emptyexcel.xlsx");
//		FileInputStream fis = new FileInputStream(file);
//		XSSFWorkbook xbook = new XSSFWorkbook(fis);
//		XSSFSheet xsheet = xbook.getSheet("sheet1");
//		int totalrow = xsheet.getLastRowNum() + 1;
//		int totalcolumn = xsheet.getRow(0).getLastCellNum();
//
//		// for knowledge
//		System.out.println(totalrow); // 3
//		System.out.println(totalcolumn); // 2
//
//		for (int currentrow = 0; currentrow < totalrow; currentrow++) {
//			for (int currentcolumn = 0; currentcolumn < totalcolumn; currentcolumn++) {
//
//				System.out.print(xsheet.getRow(currentrow).getCell(currentcolumn).toString()); // removed ln to print
//																								// sidebyside
//				System.out.print("\t"); // it will tell to give the secondvalue space and removing ln will give values
//										// side by side
//
//			}
//			System.out.println();
//		}

}
