package org.testing.teststeps;
import java.util.Properties;
//import com.jayway.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

//input -- input data(request body) and Uri key
//purpose --to hit the post request
//output -- void

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
	}
	//For Post request TC1_PostRequest
//	public void postRequest(String bodyData, String uriKey)
//	{
//		String uriValue = pr.getProperty(uriKey);
//		System.out.println("postrequest urikey : " +uriValue);
//		System.out.println(bodyData);
//		Response res= 
//		given()
//		.contentType(ContentType.JSON)
//		.body(bodyData)
//		.when()
//		.post(uriValue);
//		
//		System.out.println("Status code = " +res.statusCode());
//		
//		
//	}
	//For TC3_getParticularRequest
	
	public Response postRequest(String bodyData, String uriKey)
	{
		String uriValue = pr.getProperty(uriKey);
		System.out.println("postrequest urikey : " +uriValue);
		System.out.println(bodyData);
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(uriValue);
		
		System.out.println("Status code = " +res.statusCode());
		
		return res;
	}
	//normal get request
	public void getAllRequest(String uriKey)
	{
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		System.out.println("Status code = " +res.statusCode());
		System.out.println("Bodydata = " +res.asString());
	}
	
	//Get Particular request TC3_getParticularrequest
	public Response getParticularRequest(String uriKey,String endPoint)
	{
		String uri = pr.getProperty(uriKey)+"/"+endPoint;
		System.out.println("URI key: "+uri);
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		System.out.println("Status code = " +res.statusCode());
		System.out.println("Bodydata = " +res.asString());
		return res;
	}
	
	//using org.json
	
	public Response getAllRequestUsingOrgJson(String uriKey)
	{
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		System.out.println("Status code = " +res.statusCode());
		System.out.println("Bodydata = " +res.asString());
		
		return res;
	}
	
	//Update request
	public Response updateRequest(String bodyData,String uriKey,String idValue)
	{
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		
		System.out.println("Status code = " +res.statusCode());
		System.out.println("Bodydata = " +res.asString());
		return res;
	}
	
	//Delete Request
	public Response deleteRequest(String uriKey,String endPoint)
	{
		String uri = pr.getProperty(uriKey)+"/"+endPoint;
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		System.out.println("Status code = " +res.statusCode());
		System.out.println("Bodydata = " +res.asString());
		return res;
	}
	

}
