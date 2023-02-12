package org.testing.testcases;
//input file - inputPayLoadForUpdate.json

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_updateRequest
{
	static String returnIdValue;
	@Test
	public void testCase4() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/URLPath.properties");
		String bodydata = HandleJsonFile.readJson("../FirstAPIAutomation/src/main/java/org/testing/resources/inputPayLoadForUpdate.json");
		String replacedbody = JsonReplacement .replaceJsonData(bodydata, "id",TC2_replaceVarPost.returnIdValue); 
		HTTPMethods http = new HTTPMethods(p);

		System.out.println("Body data : "+bodydata);
		Response res = http.updateRequest(replacedbody,"QA_URI",TC2_replaceVarPost.returnIdValue);
		System.out.println("Status code : " + res.statusCode());
		
	}

}
