package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC5_deleteRequest 
{
	@Test
	public void testCase5() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/URLPath.properties");
		HTTPMethods http = new HTTPMethods(p);
		http.deleteRequest("QA_URI",TC2_replaceVarPost.returnIdValue);
		System.out.println("Record deleted");
	}
}
