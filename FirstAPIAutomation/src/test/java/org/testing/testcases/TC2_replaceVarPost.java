package org.testing.testcases;
import java.io.IOException;
import java.util.Properties;

import org.testing.helpers.JsonParsingUsingJsonPath;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_replaceVarPost 
{
	static String returnIdValue;
	@Test
	public void testCase2() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/URLPath.properties");
		String bodydata = HandleJsonFile.readJson("../FirstAPIAutomation/src/main/java/org/testing/resources/InputPayLoad.json");
		String replacedbody = JsonReplacement .replaceJsonData(bodydata, "id",RandomData.generateRandomData()); 
		HTTPMethods http = new HTTPMethods(p);

		System.out.println("Body data : "+bodydata);
		Response res = http.postRequest(replacedbody,"QA_URI");
		returnIdValue = JsonParsingUsingJsonPath.jsonExtract(res, "id"); 
	}

}  