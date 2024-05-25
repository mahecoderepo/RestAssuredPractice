import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class GetTypiCode {


 @BeforeAll
 public static void set_up(){
     RestAssured.baseURI="https://jsonplaceholder.typicode.com";
 }

 @Test
    public void sendGetRequest(){
    Response response=given()
            .param("postId","2")
             .when()
             .get("/comments")
             .then()
             .extract().response();
  Assertions.assertEquals(200,response.statusCode());
  System.out.println(response.asString());
     JsonPath js=new JsonPath(response.asString());
     String userID= js.getString("email[3]");
     String name=js.getString("name[3]");
     System.out.println(name +"%%%%%%%%%%%%%%%%%%%%%%");

 }

}
