package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC6_getAllEmployess {
	
	@Test
	public void testCase6() throws IOException
	{
		Properties p = PropertiesLoad.handleProperties("../FirstAPIAutomation/EmployeeURI.properties");
		HTTPMethods http = new HTTPMethods(p);
		http.getAllRequest("QA_URI");
	}
}
