package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_UpdateEmployee
{
	static String returnIdValue;
	@Test
	public void testCase9() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/EmployeeURI.properties");
		String bodydata = HandleJsonFile.readJson("../FirstAPIAutomation/src/main/java/org/testing/resources/InputEmployeeUpdate.json");
		String replacedbody = JsonReplacement .replaceJsonData(bodydata, "id","21"); 
		HTTPMethods http = new HTTPMethods(p);

		System.out.println("Body data : "+bodydata);
		Response res = http.updateRequest(replacedbody,"QA_URI_Update","21");
		System.out.println("Status code : " + res.statusCode());
		
	}

}
