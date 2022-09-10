package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mwojcik.binanceapi.client.dto.OrderSide;
import pl.mwojcik.binanceapi.client.dto.TimeInForce;
import pl.mwojcik.binanceapi.configuration.BinanceApiConstants;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewOrder {

    private String symbol;
    private OrderSide side;
    private OrderType type;
    private TimeInForce timeInForce;
    private String quantity;
    private String quoteOrderQty;
    private String price;
    private String newClientOrderId;
    private String stopPrice;
    private String icebergQty;
    private NewOrderResponseType newOrderRespType;
    private Long recvWindow;
    private long timestamp;

    public NewOrder(String symbol, OrderSide side, OrderType type, TimeInForce timeInForce, String quantity) {
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.timeInForce = timeInForce;
        this.quantity = quantity;
        this.newOrderRespType = NewOrderResponseType.RESULT;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }
}
