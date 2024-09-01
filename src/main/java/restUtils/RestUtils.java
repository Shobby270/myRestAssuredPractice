package restUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

public class RestUtils {




    public static Response createPostRequest(String endPoint, String payLoad, HashMap<String,String>header)
    {

        return RestAssured
                .given()
                .log()
                .all()
                .baseUri(endPoint)
                .body(payLoad)
                .contentType("application/json")
                .when()
                .post()
                .then()
                .log()
                .all()
                .extract()
                .response();



    }

    public static Response createPostRequestbyMap(String endPoint, HashMap<String,Object> payLoadMap, HashMap<String,String>header)
    {

        return RestAssured
                .given()
                .log()
                .all()
                .baseUri(endPoint)
                .body(payLoadMap)
                .contentType("application/json")
                .when()
                .post()
                .then()
                .log()
                .all()
                .extract()
                .response();



    }
}
