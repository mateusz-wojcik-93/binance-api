package pl.mwojcik.binanceapi.client.account.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CancelOrderRequest extends OrderRequest {

    private Long orderId;

    private String origClientOrderId;

    private String newClientOrderId;

    public CancelOrderRequest(String symbol) {
        super(symbol);
    }
}
