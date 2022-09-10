package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import pl.mwojcik.binanceapi.client.dto.OrderSide;
import pl.mwojcik.binanceapi.client.dto.OrderStatus;
import pl.mwojcik.binanceapi.client.dto.TimeInForce;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    private String symbol;
    private Long orderId;
    private String clientOrderId;
    private String price;
    private String origQty;
    private String executedQty;
    private OrderStatus status;
    private TimeInForce timeInForce;
    private OrderType type;
    private OrderSide side;
    private String stopPrice;
    private String icebergQty;
    private long time;
    private String cummulativeQuoteQty;
    private long updateTime;
    @JsonProperty("isWorking")
    private boolean working;
    private String origQuoteOrderQty;
}
