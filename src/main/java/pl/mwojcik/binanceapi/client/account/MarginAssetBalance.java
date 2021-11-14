package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginAssetBalance {

    public static MarginAssetBalance of(final String asset) {
        final MarginAssetBalance marginAssetBalance = new MarginAssetBalance();

        marginAssetBalance.setAsset(asset);

        return marginAssetBalance;
    }

    private String asset;

    private String borrowed = "0";

    private String free = "0";

    private String interest = "0";

    private String locked = "0";

    private String netAsset = "0";
}
