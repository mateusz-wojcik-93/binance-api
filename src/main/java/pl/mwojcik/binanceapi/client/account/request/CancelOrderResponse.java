package pl.mwojcik.binanceapi.client.account.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelOrderResponse {

    private String symbol;
    private String origClientOrderId;
    private String orderId;
    private String clientOrderId;
    private String status;
    private String executedQty;
}
