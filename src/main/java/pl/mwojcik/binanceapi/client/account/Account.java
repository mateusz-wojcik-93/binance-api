package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    private int makerCommission;

    private int takerCommission;

    private int buyerCommission;

    private int sellerCommission;

    private boolean canTrade;

    private boolean canWithdraw;

    private boolean canDeposit;

    private long updateTime;

    private List<AssetBalance> balances;

    public AssetBalance getAssetBalance(String symbol) {
        for (AssetBalance assetBalance : balances) {
            if (symbol.equals(assetBalance.getAsset())) {
                return assetBalance;
            }
        }
        AssetBalance emptyBalance = new AssetBalance();
        emptyBalance.setAsset(symbol);
        emptyBalance.setFree("0");
        emptyBalance.setLocked("0");
        return emptyBalance;
    }
}
