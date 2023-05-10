package generic;

import java.io.IOException;

public class DemoGenericLib {

	public static void main(String args[]) throws IOException
	{
		FileLib f=new FileLib();
		//Reading the data form PropertyFile using generic library
		String url=f.getPropertyData("url");
		System.out.println(url);
		
		//Read the Data from Excel File
		String cn = f.getExcelData("createcustomer", 1, 2);
		System.out.println(cn);
		
		//Writing the data to Excel File
		f.SetExcelData("createcustomer",1,4, "pass or fail");
	}
}
