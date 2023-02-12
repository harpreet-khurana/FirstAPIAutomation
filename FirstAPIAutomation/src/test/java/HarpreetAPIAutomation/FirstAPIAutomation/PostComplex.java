package HarpreetAPIAutomation.FirstAPIAutomation;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostComplex {
	
	public static void main(String[] args) {
		
		//Using Complex json 		
		JSONObject courseJson = new JSONObject();
		for(int i=1;i<4;i++)
		{
			courseJson.put("CourseName"+i,"CourseContent"+i);
		}
		JSONObject studentJson = new JSONObject();
		studentJson.put("Name", "Harpreet");
		studentJson.put("Age", "25");
		studentJson.put("Courses", courseJson);
		
		String requestBody = studentJson.toString();
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



