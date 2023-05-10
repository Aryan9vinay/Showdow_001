package com.actitime.generic;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this is generic class for data driven testing
 * @author Hp
 *
 */

public class FileLibr {
/**
 * This is generic methods for Property File
 * @param key
 * @throws IOExecption
 * @return
 */
	public String getProperty(String key) {
		FileInputStream fis=new FileInputStream();
		Properties p=new Propeties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	} 
}
