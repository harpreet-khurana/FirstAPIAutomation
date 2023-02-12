package org.testing.testcases;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	@Test
	public void testCase1() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/URLPath.properties");
		HTTPMethods http = new HTTPMethods(p);
		String bodydata = HandleJsonFile.readJson("../FirstAPIAutomation/src/main/java/org/testing/resources/InputPayLoad.json");
		System.out.println("Body data : "+bodydata);
		Response res = http.postRequest(bodydata,"QA_URI");
	}

}  