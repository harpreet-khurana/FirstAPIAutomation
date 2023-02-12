package HarpreetAPIAutomation.FirstAPIAutomation;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Extractone {
	
	public static void main(String[] args) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIStudentList");
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is  ");
		JSONArray js = new JSONArray(res.asString());
		JSONObject obj = js.getJSONObject(2);
		System.out.println(obj.get("name"));
		
		
	}

}
