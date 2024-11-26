package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlinesTest extends AirLineAPIs {

    @Test
    public void createAirline() throws IOException {
        System.out.println("set env is "+System.getProperty("env"));

        HashMap<String, Object> payLoadMap = PayLoad.getAirlinePayloadMap("1222286", "latur Airways", "INDIA", "click here to see logo", "silent and safe", "Vivekanad chowk", "www.shobby.com", "1992");

        Response response = createAirline(payLoadMap);
                 Assert.assertEquals(response.statusCode(),200);
    }


}
