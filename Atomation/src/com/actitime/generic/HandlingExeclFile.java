package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExeclFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// get java representative object for resource file
		FileInputStream fis= new FileInputStream("./data/customer.xlsx");
		//create workbook for file
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("createcustomer").getRow(1).getCell(3).getStringCellValue();
System.out.println(data);
	}

}
