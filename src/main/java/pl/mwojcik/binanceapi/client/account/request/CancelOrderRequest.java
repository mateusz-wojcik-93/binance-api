package pl.mwojcik.binanceapi.client.account.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelOrderRequest extends OrderRequest {

    private Long orderId;

    private String origClientOrderId;

    private String newClientOrderId;

    public CancelOrderRequest(String symbol) {
        super(symbol);
    }
}
