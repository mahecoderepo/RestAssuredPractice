import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetRequestTest {

@BeforeAll
public static void set_up(){
RestAssured.baseURI="https://jsonplaceholder.typicode.com";

}

@Test
public void SendGetRequest(){
    Response response=given()
            .when()
            .get("/posts")
            .then()
            .extract().response();
    Assertions.assertEquals(200,response.statusCode());
    String res=response.asPrettyString();
    System.out.println(res);
}
}