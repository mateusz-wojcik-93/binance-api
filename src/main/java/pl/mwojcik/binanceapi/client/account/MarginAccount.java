package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class MarginAccount {

    private boolean borrowEnabled;

    private String marginLevel;

    private String totalAssetOfBtc;

    private String totalLiabilityOfBtc;

    private String totalNetAssetOfBtc;

    private boolean tradeEnabled;

    private boolean transferEnabled;

    private List<MarginAssetBalance> userAssets;

    public MarginAssetBalance getAssetBalance(final String symbol) {
        return userAssets.stream()
                         .filter(marginAssetBalance -> marginAssetBalance.getAsset()
                                                                         .equals(symbol))
                         .findFirst()
                         .orElse(MarginAssetBalance.of(symbol));
    }
}
