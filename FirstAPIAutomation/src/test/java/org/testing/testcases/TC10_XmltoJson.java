package org.testing.testcases;

import java.io.IOException;

import org.testing.utilities.Conversion;
import org.testing.utilities.XMLRead;
import org.testng.annotations.Test;

public class TC10_XmltoJson 
{
	@Test
	public void testCase11() throws IOException
	{
		
		String xmldata = XMLRead.readXmlData("../FirstAPIAutomation/employee.xml");
		System.out.println("Data read from XML file : " + xmldata);
		
		String convertedToJson = Conversion.convertXMLtoJson(xmldata);
		System.out.println("Converted to Json data: "+ convertedToJson );
		
		String convertedToXml = Conversion.convertJsontoXML(convertedToJson);
		System.out.println("Data converted to XML: "+ convertedToXml);
	}

}
