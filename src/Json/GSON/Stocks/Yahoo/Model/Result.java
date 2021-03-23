package Json.GSON.Stocks.Yahoo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
//    @SerializedName("symbol")
    @JsonProperty("symbol")
    private String ticker;

    @JsonProperty("longName")
    private String stockName;
    @JsonProperty("regularMarketPreviousClose")
    private float prevClosePrice;
    @JsonProperty("regularMarketOpen")
    private float openPrice;
    @JsonProperty("regularMarketPrice")
    private float price;

    private boolean favorite;
    private String stockIcon;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(float openPrice) {
        this.openPrice = openPrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Result{" +
                "ticker='" + ticker + '\'' +
                ", stockName='" + stockName + '\'' +
                ", prevClosePrice=" + prevClosePrice +
                ", openPrice=" + openPrice +
                ", price=" + price +
                ", favorite=" + favorite +
                ", stockIcon='" + stockIcon + '\'' +
                '}';
    }
}
