package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.groovy.runtime.StringGroovyMethods;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {


   public static ObjectMapper objmapper = new ObjectMapper();
    public static Map<String, String> getJsoDataAsMap(String jsoFileName) throws IOException {
        String completeJsoFilePath = System.getProperty("user.dir") + "/src/test/resource/" + jsoFileName;
        Map<String,String> data = objmapper.readValue(new File(completeJsoFilePath), new TypeReference<Map<String, String>>() {
        });

        return data;



    }
}
