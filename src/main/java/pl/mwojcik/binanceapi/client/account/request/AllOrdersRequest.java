package pl.mwojcik.binanceapi.client.account.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class AllOrdersRequest extends OrderRequest {

    private static final Integer DEFAULT_LIMIT = 500;

    private Long orderId;

    private Integer limit;

    public AllOrdersRequest(String symbol) {
        super(symbol);
    }
}
