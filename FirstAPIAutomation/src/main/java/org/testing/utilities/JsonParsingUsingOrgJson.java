package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson 
{
	public static void jsonParse(String responseData, String keyName)
	{
		JSONArray js = new JSONArray(responseData);
		int l = js.length();
		for(int i=0;i<l;i++)
		{
			JSONObject ob = js.getJSONObject(i);
			System.out.println(ob.get(keyName));
		}
	}

}
