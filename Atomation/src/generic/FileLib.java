/**
 * 
 */
package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this is a generic class for data driven testing
 * @author vinay
 *
 */
public class FileLib {

	/**
	 * this is a generic method for reading the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key)throws IOException
	{
	FileInputStream fis = new FileInputStream("./data/actime.property");
		Properties p= new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;		
		
	}
/**
 * this is a generic method for reading the data from excel file
 * @param SheetName
 * @param row
 * @param cell
 * @return
 * @throws IOException
 */
	

public String getExcelData(String SheetName,int row,int cell) throws IOException,EncryptedDocumentException
{
	FileInputStream fis = new FileInputStream("./data/customer.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String data=wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * this is a generic method for writing the data from excel file
 * @param SheetName
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public void SetExcelData(String SheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException
{
FileInputStream fis = new FileInputStream("./data/customer.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet(SheetName).getRow(row).getCell(cell).setCellValue(value);
FileOutputStream fos=new FileOutputStream("./data/customer.xlsx");
wb.write(fos);
wb.close();
}
}