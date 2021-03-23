package Json.GSON.Stocks.Yahoo.Model;

public class Stock {
    private QuoteResponse quoteResponse;

    public QuoteResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuoteResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "quoteResponse=" + quoteResponse +
                '}';
    }
}
