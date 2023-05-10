package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//get the java representative object of the physical file
		
		 FileInputStream file=new FileInputStream("./data/customer.xlsx");
		 //create workbook or open the workbook
		Workbook wb=WorkbookFactory.create(file);
		//get the control of the sheet ,then row ,then read the data
		String data = wb.getSheet("createcustomer").getRow(1).getCell(2).getStringCellValue();
		//print the data on the console
		System.out.println(data);
		

	}

}
