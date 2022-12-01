package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossMarginAssets {

    private String assetFullName;
    private String assetName;
    private boolean isBorrowable;
    private boolean isMortgageable;
    private String userMinBorrow;
    private String userMinRepay;
}
