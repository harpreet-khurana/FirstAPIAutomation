package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion 
{
	public static String convertXMLtoJson(String xmlData)
	{
		JSONObject js = XML.toJSONObject(xmlData);
		return js.toString();
	}
	
	public static String convertJsontoXML(String jsonData)
	{
		JSONObject js = new JSONObject(jsonData);
		String convertedxmlData = XML.toString(js);
		return convertedxmlData;
	}

}
