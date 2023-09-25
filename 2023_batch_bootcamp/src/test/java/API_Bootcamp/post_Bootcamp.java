package API_Bootcamp;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post_Bootcamp {

	public static void main(String[] args) {
		
		File postPayload= 	new File("C:\\Users\\Moe\\eclipse-workspace\\2023_batch_bootcamp\\src\\test\\java\\API_Bootcamp\\payload.json");
		Response postRequest=     given().contentType(ContentType.JSON).body(postPayload).post("https://reqres.in/api/users");
        postRequest.prettyPrint();
	}

}
