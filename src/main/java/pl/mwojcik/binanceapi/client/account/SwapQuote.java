package pl.mwojcik.binanceapi.client.account;

import lombok.Data;

@Data
public class SwapQuote {

    private String quoteQty;
    private String price;
    private String fee;
    private String baseQty;
    private String baseAsset;
    private String slippage;
    private String quoteAsset;
}

