package HarpreetAPIAutomation.FirstAPIAutomation;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostRequestSimple {
	public static void main(String[] args)
	{
		BasicInformation basic = new BasicInformation();
		basic.setName("Preet");
		basic.setAge(30);
		
		String uri = "http://localhost:3000/SelStudentList"; 
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
				.post(uri);
				
				System.out.println("PostRequest : Status code is ");
				System.out.println(res.statusCode());
				System.out.println(res.asString());
	}
	
 
}
