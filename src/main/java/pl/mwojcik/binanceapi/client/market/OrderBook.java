package pl.mwojcik.binanceapi.client.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBook {

    private long lastUpdateId;

    private List<OrderBookEntry> bids;

    private List<OrderBookEntry> asks;

}
