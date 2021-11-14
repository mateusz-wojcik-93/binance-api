package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeHistoryItem {

    private long id;
    private String price;
    private String qty;
    private long time;

    @JsonProperty("isBuyerMaker")
    private boolean isBuyerMaker;

    @JsonProperty("isBestMatch")
    private boolean isBestMatch;
}
