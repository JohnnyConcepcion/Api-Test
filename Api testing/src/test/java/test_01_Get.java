import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static io.restassured.response.ResponseBody.*;

public class test_01_Get {


    @Test
    void test_01 (){
        Response response = RestAssured.get("https://www.breakingbadapi.com/api/characters?name=Walter+White");

        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getTime());


    }
}
