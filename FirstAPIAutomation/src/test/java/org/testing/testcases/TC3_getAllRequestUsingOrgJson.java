package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_getAllRequestUsingOrgJson {
	@Test
	public void testCase3_1() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/URLPath.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response re=http.getAllRequestUsingOrgJson("QA_URI");
		JsonParsingUsingOrgJson.jsonParse(re.asString(), "id");
	}

}
