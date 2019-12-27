
import io.restassured.response.Response;
import  org.junit.Ignore;
import org.junit.Test;
import org.hamcrest.Matchers;
import static  io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;
public class TwitterGetAuto {
    String ConsumerKey = "VucpzZmYFqL3dSspfhzbstSQE";
    String ConsumerSecret= "I2rXmfQ6FR2syjqDgJ8FxfG1GM9FxwVced02hgd5kLc44j4AmL";
    String AccessKey = "1204375644404174851-QzX8Sit7rcBX7cihThQxhSkbIZzQCw";
    String TokenSecret = "vcHHTzRhY5c6VSUeTAjbQ12NfvAIz7JmUGWS9bzcmssrM";
@Test
    public void TwitterGet(){
    Response response = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
            .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");
    response.prettyPrint();
}
}
