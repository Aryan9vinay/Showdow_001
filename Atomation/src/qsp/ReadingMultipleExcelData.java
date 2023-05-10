package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleExcelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the last row count which contains data
		int rowcount = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
		 String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		for(int j=1;j<=rowcount;j++)
		{
			String pw = wb.getSheet("Sheet1").getRow(j).getCell(2).getStringCellValue();
			System.out.println(un+ " " +pw );
		}
		
		}
		

	}

}
