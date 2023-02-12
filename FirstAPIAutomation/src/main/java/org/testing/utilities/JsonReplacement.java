package org.testing.utilities;

import java.util.regex.Pattern;

//input parameter - String json data,replacement key,corresponding value
//purpose -- replace the key with correspondin value
//output -- after replacement it will give the string json data
public class JsonReplacement {
	public static String replaceJsonData(String jsonbody,String variableName,String variableValue)
	{
		jsonbody = jsonbody.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
		return jsonbody;
	}

}
