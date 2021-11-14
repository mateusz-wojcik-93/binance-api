package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trade {

    private Long id;

    private String price;

    private String qty;

    private String quoteQty;

    private String commission;

    private String commissionAsset;

    private long time;

    private String symbol;

    @JsonProperty("isBuyer")
    private boolean buyer;

    @JsonProperty("isMaker")
    private boolean maker;

    @JsonProperty("isBestMatch")
    private boolean bestMatch;

    private String orderId;

    @JsonSetter("tradeId")
    public void setTradeId(Long id) {
        if (this.id == null) {
            setId(id);
        }
    }
}
