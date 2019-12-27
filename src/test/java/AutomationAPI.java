import io.restassured.response.Response;
import  org.junit.Ignore;
import org.junit.Test;
import org.hamcrest.Matchers;
import static  io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;

public class AutomationAPI {
    @Test
    public void getTest(){
      Response response = given()
                .when().get("https://reqres.in/api/users?page=2");
      //response.then().body("page",is(2));
      response.prettyPrint();

    }

    @Test
    public void getsingleuser(){
        Response response=given()
                .when().get("https://reqres.in/api/users/2");
        response.then().statusCode(200)
                .body("data.avatar",is("https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"));
        response.prettyPrint();
    }


}
