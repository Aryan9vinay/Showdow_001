package qsp;
//WRITE A PROGRAM TO WRITE THE DATA TO EXCEL

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Get the java represtative object of the physical file
		FileInputStream fis = new FileInputStream("./data/customer.xlsx");
		//Open or Create the Workbook
		Workbook wb = WorkbookFactory.create(fis);
		//getControl of the sheet ,then row then cell and type the data
		wb.getSheet("createcustomer").getRow(1).getCell(6).setCellValue("pass");
		//get the physical file of the java represtative object
		FileOutputStream fos = new FileOutputStream("./data/customer.xlsx");
		//Save the workbook (actual writting happens here)
		wb.write(fos);
		//close the workbook
		wb.close();
		
		

	}

}
