package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_PostEmployee
{
	@Test
	public void testCase8() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/EmployeeURI.properties");
		HTTPMethods http = new HTTPMethods(p);
		String bodydata = HandleJsonFile.readJson("../FirstAPIAutomation/src/main/java/org/testing/resources/InputEmployeeData.json");
		System.out.println("Body data : "+bodydata);
		Response res = http.postRequest(bodydata,"QA_URI_Create");
	}

}
