package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XMLRead
{
	public static String readXmlData(String path) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		String data;
		String saved="";
		while((data=br.readLine())!=null)
		{
			saved=saved+data;
		}
		return saved;
		
	}

}
