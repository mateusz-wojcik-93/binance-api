package pl.mwojcik.binanceapi.client.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AggTrade {

    @JsonProperty("a")
    private long aggregatedTradeId;

    @JsonProperty("p")
    private String price;

    @JsonProperty("q")
    private String quantity;

    @JsonProperty("f")
    private long firstBreakdownTradeId;

    @JsonProperty("l")
    private long lastBreakdownTradeId;

    @JsonProperty("T")
    private long tradeTime;

    @JsonProperty("m")
    private boolean isBuyerMaker;

}
