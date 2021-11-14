package pl.mwojcik.binanceapi.client.account.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mwojcik.binanceapi.configuration.BinanceApiConstants;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {

    private final String symbol;

    private Long recvWindow;

    private Long timestamp;

    public OrderRequest(String symbol) {
        this.symbol = symbol;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }
}
