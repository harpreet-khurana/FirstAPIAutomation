package HarpreetAPIAutomation.FirstAPIAutomation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {
	
	public static void main(String[] args) {
		
		 String requestBody = "{\r\n"
				+ "    \"Server\": \"servername\",\r\n"
				+ "    \"Instance\": \"Instance name\",\r\n"
				+ "    \"Discovery\": \"discovery name\",\r\n"
				+ "    \"User name\": \"user name\",\r\n"
				+ "    \"password\": \"password\",\r\n"
				+ "    \"Switch IP\": \"ip address\",\r\n"
				+ "    \"Enable_secure_connection\": \"secure connection\"\r\n"
				+ "}";
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
