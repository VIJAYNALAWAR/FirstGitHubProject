package Sample_Data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	static Properties property;
	public static void redaData() throws IOException {
	property= new Properties();
	File f1= new File(System.getProperty("user.dir")+"\\config.properties");
	//File f1= new File(System.getProperty("E:\\workspace\\New Selenium\\src\\config\\config.properties"));
	
	FileReader obj=new FileReader(f1);
	property.load(obj);
	}
	
	
	
	public static String getObject(String Data) throws IOException
	{
		redaData();
		String data=property.getProperty(Data);
		return data;
	}

}


