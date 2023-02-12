package org.testing.helpers;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{
	public static String jsonExtract(Response res,String jsonPath)
	{	
		String extractedValue = res.jsonPath().get(jsonPath);
		return extractedValue;
		
	}

}
