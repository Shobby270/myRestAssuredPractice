package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payLoads.PayLoad;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlinesTest {

    @Test
    public void createAirline() throws IOException {
        String env =System.getProperty("env")==null ? "qa" : System.getProperty("env");
        Map<String, String> data = JsonUtils.getJsoDataAsMap("airline/"+env+"/airlineAPIData.json");
        String endPoint=data.get("createAirLineEndPoint");
        HashMap<String, Object> payLoadMap = PayLoad.getAirlinePayloadMap("12345786", "latur Airways", "INDIA", "click here to see logo", "silent and safe", "Vivekanad chowk", "www.shobby.com", "1992");
        Response response = RestUtils.createPostRequestbyMap(endPoint, payLoadMap, new HashMap<>());

                 Assert.assertEquals(response.statusCode(),200);
    }


}
