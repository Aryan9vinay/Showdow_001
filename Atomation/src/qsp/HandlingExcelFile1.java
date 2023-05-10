package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



//To read the data from Excel File
public class HandlingExcelFile1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//get the java represtative object of the physcial file
		FileInputStream fis = new FileInputStream("./data/customer.xlsx");
		//create workbook or open the workbook
	 Workbook wb = WorkbookFactory.create(fis);
	 //get the control of the sheet ,then row ,then read the data
	 String data = wb.getSheet("createcustomer").getRow(1).getCell(2).getStringCellValue();
//print the data on the console
	 System.out.println(data);
	}

}
