package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mwojcik.binanceapi.client.OrderSide;
import pl.mwojcik.binanceapi.client.OrderStatus;
import pl.mwojcik.binanceapi.client.OrderType;
import pl.mwojcik.binanceapi.client.TimeInForce;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginNewOrderResponse {

    private String symbol;

    private Long orderId;

    private String clientOrderId;

    private String price;

    private String origQty;

    private String executedQty;

    private String cummulativeQuoteQty;

    private OrderStatus status;

    private TimeInForce timeInForce;

    private OrderType type;

    private String marginBuyBorrowAmount;

    private String marginBuyBorrowAsset;

    private OrderSide side;

    private List<Trade> fills;

    private Long transactTime;
}
