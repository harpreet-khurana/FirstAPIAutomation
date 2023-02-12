package HarpreetAPIAutomation.FirstAPIAutomation;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingFromResponse {
	
	public static void main(String[] args) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/SelStudentList");
		System.out.println("GetRequest2 : Status code is ");
		System.out.println(res.statusCode());
		System.out.println(res.jsonPath().get("[8].Courses.CourseName2"));
		
		
	}

}
