package HarpreetAPIAutomation.FirstAPIAutomation;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostSimple {
	
	public static void main(String[] args) {
		
		//Using Complex json 		
		JSONObject cobj = new JSONObject();
		for(int i=1;i<4;i++)
		{
			cobj.put("CourseName"+i,"CourseContent"+i);
		}
		JSONObject jobj = new JSONObject();
		jobj.put("Name", "Harpreet");
		jobj.put("Age", "25");
		jobj.put("Courses", cobj);
		
		String requestBody = jobj.toString();
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



