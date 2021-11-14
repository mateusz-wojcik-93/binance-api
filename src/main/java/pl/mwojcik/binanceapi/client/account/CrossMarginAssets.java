package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossMarginAssets {

    public String assetFullName;
    public String assetName;
    public boolean isBorrowable;
    public boolean isMortgageable;
    public String userMinBorrow;
    public String userMinRepay;
}
