package HarpreetAPIAutomation.FirstAPIAutomation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;

public class PostJsonArray {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put("item1");
        jsonArray.put("item2");
        jsonArray.put("item3");

        Response response = RestAssured.given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(jsonArray.toString())
            .post("http://localhost:3000/APIStudentList");

        System.out.println(response.getStatusCode());
        System.out.println(response.asString());
    }
}
