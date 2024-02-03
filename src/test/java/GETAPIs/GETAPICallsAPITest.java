package GETAPIs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETAPICallsAPITest {
	

	@Test
	public void getAllUsersAPITest() {	
		//request
		
		
		//base url
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request =  RestAssured.given();
		
		request.header("Authorization", "Bearer 53762d62478eb441d3c28098ca0e436747a19f9652dabc4fa32a3b2c7c85752d");
		
		//service url
		Response response = request.get("/public/v2/users");
		
		//response
		
		//status code
		int statusCode = response.statusCode();
		System.out.println("Status code is:: "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		//status msg
		String statusLine = response.statusLine();
		System.out.println("Status line is:: "+statusLine);
		
		//response body
		response.prettyPrint();
		
		//response header
		String contentType = response.header("Content-Type");
		System.out.println("Content-type is:: "+contentType);
		
		
		//print all response headers
		
		List<Header> resposeHeaders =  response.headers().asList();
		System.out.println("count of all headers "+resposeHeaders.size());
		
		for(Header h : resposeHeaders) {
			System.out.println(h);
			System.out.println(h.getName() + ":" + h.getValue());
		}
	}
	
	
	@Test
	public void getAllUsersAPITestWithQueryParams() {	
		//request
		
		//base url
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request =  RestAssured.given();
		
		request.header("Authorization", "Bearer 53762d62478eb441d3c28098ca0e436747a19f9652dabc4fa32a3b2c7c85752d");
		request.queryParam("name", "sahil");
		request.queryParam("status", "active");
		
		
		//service url
	//	Response response = request.get("/public/v2/users?name=sahil&status=active");
		
		Response response = request.get("/public/v2/users");
		
		//response
		
		//status code
		int statusCode = response.statusCode();
		System.out.println("Status code is:: "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		//status msg
		String statusLine = response.statusLine();
		System.out.println("Status line is:: "+statusLine);
		
		//response body
		response.prettyPrint();
		
		//response header
		String contentType = response.header("Content-Type");
		System.out.println("Content-type is:: "+contentType);
		
		
		//print all response headers
		
		List<Header> resposeHeaders =  response.headers().asList();
		System.out.println("count of all headers "+resposeHeaders.size());
		
		for(Header h : resposeHeaders) {
			System.out.println(h);
			System.out.println(h.getName() + ":" + h.getValue());
		}
	}
	
	
	
	@Test
	public void getAllUsersAPITestWithQueryParams_WithHashMap() {	
		//request
		
		//base url
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request =  RestAssured.given();
		
		request.header("Authorization", "Bearer 53762d62478eb441d3c28098ca0e436747a19f9652dabc4fa32a3b2c7c85752d");
//		request.queryParam("name", "sahil");
//		request.queryParam("status", "active");
		
		Map<String, String> queryParamsMap = new HashMap<String, String>();
		queryParamsMap.put("name", "sahil");
		queryParamsMap.put("status", "active");
		
		request.queryParams(queryParamsMap);

		
		
		//service url
	//	Response response = request.get("/public/v2/users?name=sahil&status=active");
		
		Response response = request.get("/public/v2/users");
		
		//response
		
		//status code
		int statusCode = response.statusCode();
		System.out.println("Status code is:: "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		//status msg
		String statusLine = response.statusLine();
		System.out.println("Status line is:: "+statusLine);
		
		//response body
		response.prettyPrint();
		
		//response header
		String contentType = response.header("Content-Type");
		System.out.println("Content-type is:: "+contentType);
		
		
		//print all response headers
		
		List<Header> resposeHeaders =  response.headers().asList();
		System.out.println("count of all headers "+resposeHeaders.size());
		
		for(Header h : resposeHeaders) {
			System.out.println(h);
			System.out.println(h.getName() + ":" + h.getValue());
		}
	}
}