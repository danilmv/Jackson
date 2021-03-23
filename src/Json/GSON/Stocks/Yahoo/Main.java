package Json.GSON.Stocks.Yahoo;

import Json.GSON.Stocks.Yahoo.Model.Stock;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {

    private static ObjectMapper mapper = initObjectMapper();

    private static ObjectMapper initObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

    public static void main(String[] args) {
        try {
//            URL url = Main.class.getResource("/GOOG_YNDX_shortlist.json");
            URL url = new URL("https://query1.finance.yahoo.com/v7/finance/quote?symbols=GOOG,YNDX&fields=symbol,regularMarketPrice,regularMarketOpen,regularMarketPreviousClose,longName");
            JsonNode node = mapper.readTree(url);
            Stock stocks = mapper.readValue(url, Stock.class);

            System.out.println(stocks);
        } catch (
                IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
