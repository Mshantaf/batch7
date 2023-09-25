package API_Bootcamp;


import static io.restassured.RestAssured.*;

import io.restassured.response.Response;


public class get_response_Bootcamp {

	public static void main(String[] args) {
		
		Response io= get("https://reqres.in/api/users?page=2");
		io.prettyPrint();
		
		
//    	//status code
// 	   Response io =	get("https://reqres.in/api/users?page=2");
//        io.prettyPrint();    // printing the response 
// 	   int status_code=   io.statusCode();
// 	   Assert.assertEquals(status_code, 200); // if its right nothing will be print
		
		
	}

}
