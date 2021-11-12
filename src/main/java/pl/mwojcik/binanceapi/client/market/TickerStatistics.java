package pl.mwojcik.binanceapi.client.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerStatistics {

    private String symbol;

    private String priceChange;

    private String priceChangePercent;

    private String weightedAvgPrice;

    private String prevClosePrice;

    private String lastPrice;

    private String bidPrice;

    private String askPrice;

    private String openPrice;

    private String highPrice;

    private String lowPrice;

    private String volume;

    private long openTime;

    private long closeTime;

    private long firstId;

    private long lastId;

    private long count;
}
