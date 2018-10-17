package Sample_Data;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestProperties extends TestBase {
	@Test
	public void init() throws IOException
	{
		String name1=getObject("Name");
		System.out.println(name1);
		
		String place1=getObject("Place");
		System.out.println(place1);
	}

}
