package scripts;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import org.apache.http.HttpStatus;
import static org.hamcrest.Matcher.* ;



public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		// Basic Structure (this is not syntax)
		// given(): Request headers, params, ...
		// when(): get(resource), post(resource), put(resource), ...
		// then(): assertions
		// extract(): to extract data for further processing
	
	 System.out.println("Test started");
	 
	 // given().param("id", "1").when().get("/posts").then().assertThat().statusCode(200);
	 //given().when().get("/posts/1").then().assertThat().statusCode(200);
	 
//	 given().param("id", "1").
//	 when().get("/posts").
//	 then().assertThat().statusCode(200).statusCode(HttpStatus.SC_OK).contentType("application/json");	 
//	 
	 
	 //given().when().get("/posts/1").
	// then().assertThat().statusCode(200).body("id", is(1)).body("userId", is(1));	 
	 
	 
	 
	 
	  //System.out.println("Completed");
	}

}
