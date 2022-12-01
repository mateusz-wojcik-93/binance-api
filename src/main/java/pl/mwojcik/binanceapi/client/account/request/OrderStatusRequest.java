package pl.mwojcik.binanceapi.client.account.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class OrderStatusRequest extends OrderRequest {

    private Long orderId;
    private String origClientOrderId;

    public OrderStatusRequest(String symbol) {
        super(symbol);
    }
}
