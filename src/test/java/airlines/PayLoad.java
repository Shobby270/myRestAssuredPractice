package airlines;

import java.util.HashMap;

public class PayLoad {



    public static String getAirlinePayload(String id, String name, String country, String logoLink,
                                           String slogan, String headQuarter, String website, String estYear)
    {
        String payLoad="{\n" +
                "    \"_id\":"+id+",\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"country\": \""+country+"\",\n" +
                "    \"logo\": \""+logoLink+"\",\n" +
                "    \"slogan\": \""+slogan+"\",\n" +
                "    \"head_quaters\": \""+headQuarter+"\",\n" +
                "    \"website\": \""+website+"\",\n" +
                "    \"established\": \""+estYear+"\"\n" +
                "}\n";
        return payLoad;
    }


    public static HashMap<String, Object> getAirlinePayloadMap(String id, String name, String country, String logoLink,
                                                               String slogan, String headQuarter, String website, String estYear)
    {
        HashMap<String,Object> payLoadMap=  new HashMap<>();
        payLoadMap.put("_id",id);
        payLoadMap.put("name",name);
        payLoadMap.put("country",country);
        payLoadMap.put("logo",logoLink);
        payLoadMap.put("slogan",slogan);
        payLoadMap.put("head_quaters",headQuarter);
        payLoadMap.put("website",website);
        payLoadMap.put("established",estYear);




        return payLoadMap;
    }



}
