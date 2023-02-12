package HarpreetAPIAutomation.FirstAPIAutomation;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import java.io.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONTokener;

public class PostwithFile {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		//Using external json file 		
		File file1 = new File("../FirstAPIAutomation/BodyData.json");
		FileReader fr = new FileReader(file1);
		JSONTokener js = new JSONTokener(fr);
		JSONObject jo = new JSONObject(js);
		
		String requestBody = jo.toString();
		String uri = "http://localhost:3000/SelStudentList"; 
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uri);
		
		
		System.out.println("PostRequest : Status code is ");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}

}



