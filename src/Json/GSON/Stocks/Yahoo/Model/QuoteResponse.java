package Json.GSON.Stocks.Yahoo.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class QuoteResponse {
    @SerializedName("result")
    private Result[] result;

    public Result[] getResult() {
        return result;
    }

    public void setResult(Result[] result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "QuoteResponse{" +
                "results=" + Arrays.toString(result) +
                '}';
    }
}
