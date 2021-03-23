import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;

import java.io.IOException;
import java.net.URL;

public class Main {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        try {
            readTree();
            readArray();
            readAddress();
            simpleSerialization();
            simpleDeserialization();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readTree() throws IOException {
        URL service = Main.class.getResource("/sample.json");
        JsonNode node = mapper.readTree(service);
        System.out.println(node.get("weather").get(0).get("main").asText());
    }

    private static void readArray() throws IOException {
        URL service = Main.class.getResource("/array.json");
        ArrayNode arrayNode = (ArrayNode) mapper.readTree(service);
        for (JsonNode node : arrayNode) {
            if (node instanceof BooleanNode) {
                System.out.println(node.asBoolean());
            }
        }
    }

    private static void readAddress() throws IOException {
        URL service = Main.class.getResource("/sample.json");
        JsonNode node = mapper.readTree(service);
        System.out.println(node.at("/weather/0/description").asText());
    }

    private static void simpleSerialization() throws JsonProcessingException {
        Category cat = new Category();
        cat.setId(123456);
        System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                        .writeValueAsString(cat));
    }

    private static void simpleDeserialization() throws IOException {
        URL service = Main.class.getResource("/category.json");
        Category category = mapper.readValue(service, Category.class);
        System.out.println(category);
    }
}
