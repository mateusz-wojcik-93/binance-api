package pl.mwojcik.binanceapi.client.account;

import lombok.Data;

@Data
public class SwapHistory {

    private String quoteQty;
    private Long swapTime;
    private String swapId;
    private String price;
    private String fee;
    private String baseQty;
    private String baseAsset;
    private String quoteAsset;
    private SwapStatus status;
}
