package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//READ THE DATA FROM PROPERTY FILE
public class ReadingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// get java represtative object of the physical file
		FileInputStream fis=new FileInputStream("./data/actime.property");
		//create an object of properties file
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
System.out.println(url);

	}

}
