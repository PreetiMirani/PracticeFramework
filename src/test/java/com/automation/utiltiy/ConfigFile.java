package com.automation.utiltiy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigFile {
	
	Properties prop;
	
	public ConfigFile()
	{
		File src=new File("./Config/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("File not Found"+e.getMessage());
		}
	}
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	public String stagingURL()
	{
		return prop.getProperty("URL");
	}

}
